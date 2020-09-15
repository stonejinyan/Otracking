package com.otracking.action.materialpull;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FinalyAssemblyMaterialPullAction extends ActionSupport {

	public FinalyAssemblyMaterialPullAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() throws Exception {
		ActionContext.getContext().put("active", "MaterialPull");
		return "success";
	}

}
