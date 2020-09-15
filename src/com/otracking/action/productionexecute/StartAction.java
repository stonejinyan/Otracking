package com.otracking.action.productionexecute;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.DatabaseMaterial;
import com.otracking.bean.MO;
import com.otracking.bean.MaterialPull;
import com.otracking.bean.MaterialPullList;
import com.otracking.bean.Production_Schedule;
import com.otracking.bean.Routing;
import com.otracking.bean.Staff;
import com.otracking.dao.BatchDao;
import com.otracking.dao.DatabaseMaterialDao;
import com.otracking.dao.MODao;
import com.otracking.dao.MaterialPullDao;
import com.otracking.dao.MaterialPullListDao;
import com.otracking.dao.Method_ProcessDao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.dao.RoutingDao;
import com.otracking.tool.HttpRequest;
import com.otracking.tool.LogUtil;

public class StartAction extends ActionSupport {

	private int id;
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	MODao moDao = new MODao();
	RoutingDao routingDao = new RoutingDao();
	BatchDao batchDao = new BatchDao();
	Method_ProcessDao method_ProcessDao = new Method_ProcessDao();
	MaterialPullDao materialPullDao = new MaterialPullDao();
	DatabaseMaterialDao databaseMaterialDao = new DatabaseMaterialDao();
	MaterialPullListDao materialPullListDao = new MaterialPullListDao();
	Staff staff = ((Staff) ActionContext.getContext().getSession().get("staff"));

	@Override
	public String execute() throws Exception {
		if (staff == null) {
			staff = new Staff();
			staff.setName("手机扫码");
		}
		// 获取当前生产工单
		Production_Schedule production_Schedule = production_ScheduleDao.findById(id);
		MO mo = moDao.findById(production_Schedule.getMo_id());
		// 确认工单处于可开工状态
		if (production_Schedule.getFlag() == 1) {
			// 生产开始
			int start = production_ScheduleDao.start(id);
			// 获取工单对应的Routing
			Routing routing = routingDao.getRouting(production_Schedule.getMethod_process_id(),
			        mo.getProduct_type_id());
			// 生产开始，且Routing序号小于等于1，设置MO、Batch开始生产
			if (start == 1 && routing.getSequence() <= 1) {
				int startMO = moDao.start(production_Schedule.getMo_id());
				if (startMO == 1) {
					batchDao.start(moDao.findById(production_Schedule.getMo_id()).getBatch_id());
					// 给E-Quality发送信号
					HttpRequest.sendGet(
					        "http://10.177.118.249:8096/equality/php/interface.php?action=Traceability&monumber=",
					        mo.getName());
					// 给E-Quality发送信号完成
				}
			}

			// 后端物料拉动
			if (method_ProcessDao.findById(routing.getMethod_process_id()).getMethod_process_type_id() == 3)

			{
				List<DatabaseMaterial> databaseMaterials = databaseMaterialDao
				        .queryByMO_id(production_Schedule.getMo_id());
				if (databaseMaterials != null) {
					for (int i = 0; i < databaseMaterials.size(); i++) {
						DatabaseMaterial databaseMaterial = databaseMaterials.get(i);
						MaterialPullList materialPullList = materialPullListDao
						        .findByNameAndMethod_Process_ID(databaseMaterial.getR_MATNR(), 7);
						if (materialPullList != null) {
							materialPullDao.save(new MaterialPull(0, 1, production_Schedule.getMo_id(), 1, null, 3,
							        materialPullList.getId(),databaseMaterial.getMENGE()));
						}
					}
				}
			}
		}
		production_Schedule = production_ScheduleDao.findById(id);
		ActionContext.getContext().put("Json", gson.toJson(production_Schedule));
		LogUtil.RollingFile.info(staff.getName() + "---开始生产mo_id:" + id);
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
