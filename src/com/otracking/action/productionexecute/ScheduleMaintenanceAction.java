package com.otracking.action.productionexecute;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ScheduleMaintenanceAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "Order");
		return "success";
	}

}
