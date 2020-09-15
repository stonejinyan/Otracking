package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Production_ScheduleDao;

public class GetOTRAction extends ActionSupport {
	private int id;
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	public String execute() throws Exception {
		double OTR = production_ScheduleDao.getOTR(id);
		ActionContext.getContext().put("Json", gson.toJson(OTR));
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
