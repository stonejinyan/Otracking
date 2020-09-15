package com.otracking.action.productionexecute;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Method_ProcessDao;
import com.otracking.dao.ProcessLineDao;

public class ProductionExecuteAction extends ActionSupport {

	private int process_line_id;
	Method_ProcessDao method_ProcessDao = new Method_ProcessDao();
	ProcessLineDao processLineDao = new ProcessLineDao();

	public String execute() throws Exception {
		ActionContext.getContext().put("ProcessLine", processLineDao.findById(process_line_id));
		ActionContext.getContext().put("Method_Process",
		        method_ProcessDao.getMethod_ProcessByProcessLine_id(process_line_id));
		ActionContext.getContext().put("active", "ProductionExecute");
		return "success";
	}

	public int getProcess_line_id() {
		return process_line_id;
	}

	public void setProcess_line_id(int process_line_id) {
		this.process_line_id = process_line_id;
	}

}
