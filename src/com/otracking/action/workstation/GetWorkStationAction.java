package com.otracking.action.workstation;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.WorkStationTableDao;

public class GetWorkStationAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	WorkStationTableDao workStationTableDao = new WorkStationTableDao();

	public String execute() throws Exception {

		Gson gson = new Gson();
		ActionContext.getContext().put("Json", gson.toJson(workStationTableDao.getAll()));
		return "success";

	}
}
