package com.otracking.action.productionexecute;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Method_Process;
import com.otracking.dao.Method_ProcessDao;
import com.otracking.dao.ProcessLineDao;

public class MethodProcessScheduleAction extends ActionSupport {

	private int method_process_id;
	Method_ProcessDao method_ProcessDao = new Method_ProcessDao();
	ProcessLineDao processLineDao = new ProcessLineDao();

	public String execute() throws Exception {
		Method_Process method_Process = method_ProcessDao.findById(method_process_id);
		ActionContext.getContext().put("MethodProcess", method_Process);
		ActionContext.getContext().put("ProcessLine", processLineDao.findById(method_Process.getProcessline_id()));
		ActionContext.getContext().put("active", "ProductionExecute");
		return "success";
	}

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
	}

}
