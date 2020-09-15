package com.otracking.action.processline;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProcessLineAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

}
