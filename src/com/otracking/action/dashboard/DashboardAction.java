package com.otracking.action.dashboard;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.service.WIPService;

public class DashboardAction extends ActionSupport {
	private String name;
	WIPService wipService = new WIPService();

	public String execute() throws Exception {

		ActionContext.getContext().put("WIPFlag1", wipService.getWIPFlag1());
		ActionContext.getContext().put("WIPFlag2", wipService.getWIPFlag2());
		ActionContext.getContext().put("WIPFlag3", wipService.getWIPFlag3());
		ActionContext.getContext().put("PackageWIP", (int) wipService.getPackageWIP());
		ActionContext.getContext().put("TotalWIP", (int) wipService.getTotalWIP());
		ActionContext.getContext().put("active", "dashboard");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
