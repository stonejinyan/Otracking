package com.otracking.action.keycomponents;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class KeyComponentsAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

}
