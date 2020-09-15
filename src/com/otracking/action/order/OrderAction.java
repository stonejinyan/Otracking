package com.otracking.action.order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "Order");
		return "success";
	}

}
