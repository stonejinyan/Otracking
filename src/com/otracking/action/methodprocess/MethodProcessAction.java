package com.otracking.action.methodprocess;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MethodProcessAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

}
