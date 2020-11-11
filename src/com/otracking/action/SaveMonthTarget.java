package com.otracking.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.OutputDao;

public class SaveMonthTarget extends ActionSupport {
	private int target;
	private int familyID;

	OutputDao outputDao = new OutputDao();
	Gson gson = new Gson();

	public String execute() throws Exception {

		ActionContext.getContext().put("Json",
		        gson.toJson("已保存！(" + outputDao.updateMonthTarget(familyID, target) + ")"));

		return "success";
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public int getFamilyID() {
		return familyID;
	}

	public void setFamilyID(int familyID) {
		this.familyID = familyID;
	}

}
