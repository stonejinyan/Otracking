package com.otracking.action.routing;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RoutingAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

}
