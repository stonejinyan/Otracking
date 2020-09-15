package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.MO;
import com.otracking.bean.Production_Schedule;
import com.otracking.bean.Routing;
import com.otracking.bean.Staff;
import com.otracking.dao.MODao;
import com.otracking.dao.Method_ProcessDao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.dao.RoutingDao;
import com.otracking.tool.HttpRequest;
import com.otracking.tool.LogUtil;

public class EndAction extends ActionSupport {

	private int id;
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	Method_ProcessDao method_ProcessDao = new Method_ProcessDao();
	RoutingDao routingDao = new RoutingDao();
	MODao moDao = new MODao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	Staff staff = ((Staff) ActionContext.getContext().getSession().get("staff"));

	@Override
	public String execute() throws Exception {
		if (staff == null) {
			staff = new Staff();
		}
		// 获取提交的工单
		Production_Schedule production_Schedule = production_ScheduleDao.findById(id);
		MO mo = moDao.findById(production_Schedule.getMo_id());
		// 确认工单处于生产中，可以被关闭
		if (production_Schedule.getFlag() == 2) {
			// 关闭工单
			int isUpdate = production_ScheduleDao.end(id);
			// 获取当前工单对应的Routing
			Routing routing = routingDao.getRouting(production_Schedule.getMethod_process_id(),
			        mo.getProduct_type_id());
			// 确认工单Update且Routing排序大于0，后续工位可以被设置为可开工
			if (isUpdate == 1 && routing.getSequence() > 0) {
				// 设置下一工位为可开工状态
				int isUpdateNext = production_ScheduleDao.updateNextMethodProcessFlag(production_Schedule.getMo_id(),
				        production_Schedule.getMethod_process_id());
				// 如无后工序，将MO设置为生产结束
				if (isUpdateNext == 0) {
					moDao.end(production_Schedule.getMo_id());
				}
			}
		}
		// 非标程序，机械结束自动开始配线
		if (method_ProcessDao.findById(production_Schedule.getMethod_process_id()).getMethod_process_type_id() == 3) {
			// 开始配线工单
			startNextWorkStation(production_ScheduleDao
			        .getProduction_ScheduleByMo_IDAndMethod_Process_Type(production_Schedule.getMo_id(), 5));
		}
		// 配线结束
		if (method_ProcessDao.findById(production_Schedule.getMethod_process_id()).getMethod_process_type_id() == 5) {
			// 给E-Quality发送信号
			HttpRequest.sendGet("http://10.177.118.249:8096/equality/php/interface.php?action=Traceability&monumber=",
			        mo.getName());
			// 给E-Quality发送信号完成
		}
		production_Schedule = production_ScheduleDao.findById(id);
		ActionContext.getContext().put("Json", gson.toJson(production_Schedule));
		LogUtil.RollingFile.info(staff.getName() + "---结束生产mo_id:" + id);
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private void startNextWorkStation(Production_Schedule production_Schedule) {
		// 确认工单处于可开工状态
		if (production_Schedule.getFlag() == 1) {
			// 生产开始
			int start = production_ScheduleDao.start(production_Schedule.getId());
		}
	}
}
