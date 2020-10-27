package com.otracking.action.productionexecute;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Batch;
import com.otracking.bean.MO;
import com.otracking.bean.Method_Process;
import com.otracking.bean.Production_Schedule;
import com.otracking.dao.BatchDao;
import com.otracking.dao.MOTableDao;
import com.otracking.dao.Method_ProcessDao;
import com.otracking.dao.ProcessLineDao;
import com.otracking.dao.Product_TypeDao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.dao.Production_ScheduleTableDao;
import com.otracking.dao.RoutingDao;
import com.otracking.tool.CheckMobile;
import com.otracking.tool.LogUtil;

public class MethodProductionExecuteAction extends ActionSupport {

	private int id;
	Method_ProcessDao method_ProcessDao = new Method_ProcessDao();
	ProcessLineDao processLineDao = new ProcessLineDao();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	RoutingDao routingDao = new RoutingDao();
	Product_TypeDao product_TypeDao = new Product_TypeDao();
	Production_ScheduleTableDao production_ScheduleTableDao = new Production_ScheduleTableDao();
	MOTableDao moTableDao = new MOTableDao();
	BatchDao batchDao = new BatchDao();

	public String execute() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
		        .get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		String userAgent = request.getHeader("USER-AGENT");
		boolean isphone = CheckMobile.check(userAgent);
		if (isphone) {
			LogUtil.RollingFile.info("手机访问");
		} else {
			LogUtil.RollingFile.info("电脑访问");
		}
		Production_Schedule production_Schedule = production_ScheduleDao.findById(id);
		Method_Process method_Process = method_ProcessDao.findById(production_Schedule.getMethod_process_id());
		ActionContext.getContext().put("MethodProcess", method_Process);
		ActionContext.getContext().put("ProcessLine", processLineDao.findById(method_Process.getProcessline_id()));
		int mo_type_id = production_ScheduleTableDao.findById(id).getProduct_type_id();
		ActionContext.getContext().put("Routing", routingDao.getRouting(method_Process.getId(), mo_type_id));
		ActionContext.getContext().put("active", "ProductionExecute");
		ActionContext.getContext().put("production_Schedule", production_Schedule);
		ActionContext.getContext().put("OTR", production_ScheduleDao.getOTR(id));
		MO mo = moTableDao.getByID(production_Schedule.getMo_id());
		Batch batch = batchDao.findById(mo.getBatch_id());
		ActionContext.getContext().put("MO", mo);
		ActionContext.getContext().put("Batch", batch);
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
