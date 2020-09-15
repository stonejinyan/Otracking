package com.otracking.action.batch;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BatchAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "Order");
		return "success";
	}

}
