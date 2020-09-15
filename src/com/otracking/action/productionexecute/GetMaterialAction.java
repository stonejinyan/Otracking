package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.DatabaseMaterialDao;

public class GetMaterialAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int mo_id;
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	DatabaseMaterialDao databaseMaterialDao = new DatabaseMaterialDao();

	public String execute() throws Exception {

		ActionContext.getContext().put("Json", gson.toJson(databaseMaterialDao.queryByMO_id(mo_id)));
		return "success";
	}

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

}
