package com.otracking.action.productionexecute;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Production_ScheduleTable;
import com.otracking.dao.Production_ScheduleTableDao;

public class GetProductionScheduleAction extends ActionSupport {

	private int id;

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	Production_ScheduleTableDao production_ScheduleTableDao = new Production_ScheduleTableDao();
	List<Production_ScheduleTable> production_Schedules = new ArrayList<Production_ScheduleTable>();

	public String execute() throws Exception {
		production_Schedules.add(production_ScheduleTableDao.findById(id));
		ActionContext.getContext().put("Json", gson.toJson(production_Schedules));
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
