package com.otracking.action.methodprocess;

import org.apache.logging.log4j.LogManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Method_Process;
import com.otracking.dao.Method_ProcessDao;

public class SaveMethodProcessAction extends ActionSupport {
	private String name;
	private int processline_id;
	Method_ProcessDao method_ProcessDao = new Method_ProcessDao();

	public String execute() throws Exception {
		if (name != null && name != "" && !name.equals("") && processline_id > 0) {
			Method_Process method_Process = new Method_Process();
			method_Process.setName(name);
			method_Process.setProcessline_id(processline_id);
			method_ProcessDao.save(method_Process);
			LogManager.getLogger()
			        .info(ActionContext.getContext().getSession().get("staff") + " 新增一个工艺过程 ：" + method_Process);
		}
		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProcessline_id() {
		return processline_id;
	}

	public void setProcessline_id(int processline_id) {
		this.processline_id = processline_id;
	}

}
