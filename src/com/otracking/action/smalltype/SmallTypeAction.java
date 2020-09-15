package com.otracking.action.smalltype;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SmallTypeAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

}
