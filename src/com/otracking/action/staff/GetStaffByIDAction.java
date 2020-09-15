package com.otracking.action.staff;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.StaffDao;

public class GetStaffByIDAction extends ActionSupport {
	private int id;
	StaffDao staffDao = new StaffDao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	public String execute() throws Exception {

		ActionContext.getContext().put("Json", gson.toJson(staffDao.findById(id)));
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
