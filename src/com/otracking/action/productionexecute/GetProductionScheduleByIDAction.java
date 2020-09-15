package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Production_ScheduleTableDao;

public class GetProductionScheduleByIDAction extends ActionSupport {

	private int id;

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	Production_ScheduleTableDao production_ScheduleTableDao = new Production_ScheduleTableDao();

	public String execute() throws Exception {
		ActionContext.getContext().put("Json", gson.toJson(production_ScheduleTableDao.findById(id)));
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
