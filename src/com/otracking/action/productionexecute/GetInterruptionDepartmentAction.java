package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Interruption_Recover_DepartmentDao;

public class GetInterruptionDepartmentAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	Interruption_Recover_DepartmentDao interruption_Recover_DepartmentDao = new Interruption_Recover_DepartmentDao();

	public String execute() throws Exception {

		ActionContext.getContext().put("Json", gson.toJson(interruption_Recover_DepartmentDao.getAll()));
		return "success";
	}
}
