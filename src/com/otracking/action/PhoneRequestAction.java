package com.otracking.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Production_Schedule;
import com.otracking.dao.Method_ProcessDao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.tool.LogUtil;

public class PhoneRequestAction extends ActionSupport {

	private String mo_name;
	private int method_process_id;
	Gson gson = new Gson();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	Method_ProcessDao method_ProcessDao = new Method_ProcessDao();

	public String execute() throws Exception {
		LogUtil.RollingFile.info(mo_name);
		Production_Schedule production_Schedule = production_ScheduleDao.findByMO_NameAndMethodProcess_id(mo_name,
		        method_process_id);
		if (production_Schedule == null) {
			if (method_ProcessDao.findById(method_process_id).getMethod_process_type_id() == 5) {
				production_Schedule = production_ScheduleDao
				        .getProduction_ScheduleByMo_NameAndMethod_Process_Type(mo_name, 5);
				ActionContext.getContext().put("Json", gson.toJson(production_Schedule));
			} else {
				production_Schedule = new Production_Schedule();
				production_Schedule.setFlag(0);
				ActionContext.getContext().put("Json", gson.toJson(production_Schedule));
			}
		} else {
			ActionContext.getContext().put("Json", gson.toJson(production_Schedule));
		}

		return "success";
	}

	public String getMo_name() {
		return mo_name;
	}

	public void setMo_name(String mo_name) {
		this.mo_name = mo_name;
	}

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
	}

}
