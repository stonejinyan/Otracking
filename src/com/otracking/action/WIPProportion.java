package com.otracking.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.WIPDao;

public class WIPProportion extends ActionSupport {

	public String execute() throws Exception {

		Gson gson = new Gson();
		WIPDao wipDao = new WIPDao();
		// List<WIP> wips = wipDao.getWIP();
		int[] is = { 500, 110, 20, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
//		for (int i = 0; i < wips.size(); i++) {
//
//			switch (wips.get(i).getName()) {
//			case "OKKEN-70产线":
//
//				break;
//
//			default:
//				break;
//			}
//		}
		ActionContext.getContext().put("Json", gson.toJson(is));
		return "success";
	}
}
