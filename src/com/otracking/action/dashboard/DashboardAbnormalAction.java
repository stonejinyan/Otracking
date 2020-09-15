package com.otracking.action.dashboard;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.service.WIPService;

public class DashboardAbnormalAction extends ActionSupport {
	private String name;
	WIPService wipService = new WIPService();

	public String execute() throws Exception {
		ActionContext.getContext().put("active", "dashboard");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
