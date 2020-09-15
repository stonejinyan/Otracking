package com.otracking.action.methodprocess;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Method_ProcessDao;

public class GetMethodProcessAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Method_ProcessDao method_ProcessDao = new Method_ProcessDao();

	public String execute() throws Exception {

		Gson gson = new Gson();
		ActionContext.getContext().put("Json", gson.toJson(method_ProcessDao.getAll()));
		return "success";

	}
}
