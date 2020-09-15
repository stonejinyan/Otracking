package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.service.EKittingService;
import com.otracking.service.productionexecute.ProductionExecute;

public class RefreshScheduleAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	EKittingService eKittingService = new EKittingService();
	ProductionExecute productionExecuteService = new ProductionExecute();
	Gson gson = new Gson();

	public String execute() throws Exception {

		ActionContext.getContext().put("Json",
		        gson.toJson(productionExecuteService.setMOPlan() + "|" + eKittingService.setPullPlan()));
		return "success";
	}

}
