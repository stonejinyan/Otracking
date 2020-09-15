package com.otracking.action.dashboard;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.EasergyPositionDao;

public class GetEasergyAction extends ActionSupport {

	EasergyPositionDao easergyPositionDao = new EasergyPositionDao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext.getContext().put("Json", gson.toJson(easergyPositionDao.getAll()));
		return "success";
	}
}
