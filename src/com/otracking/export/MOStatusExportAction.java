package com.otracking.export;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MOStatusExportAction extends ActionSupport {

	public String execute() throws Exception {

		ActionContext.getContext().put("active", "export");
		return "success";
	}
}
