package com.otracking.action.mo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MOAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "Order");
		return "success";
	}

}
