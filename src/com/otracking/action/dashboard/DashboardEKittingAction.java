package com.otracking.action.dashboard;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DashboardEKittingAction extends ActionSupport {

	public String execute() throws Exception {
		ActionContext.getContext().put("active", "dashboard");
		return "success";
	}
}
