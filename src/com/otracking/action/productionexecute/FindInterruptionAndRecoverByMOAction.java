package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Interruption_Recover_TableDao;

public class FindInterruptionAndRecoverByMOAction extends ActionSupport {
	private int mo_id;
	Interruption_Recover_TableDao interruption_Recover_TableDao = new Interruption_Recover_TableDao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext.getContext().put("Json",
		        gson.toJson(interruption_Recover_TableDao.findByForeignId(mo_id, "mo_id", "interruption_time")));
		return "success";
	}

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

}
