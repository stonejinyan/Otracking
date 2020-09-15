package com.otracking.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.OutputDao;
import com.otracking.dao.WIPDao;

public class homeAction extends ActionSupport {
	private String name;
	WIPDao wipDao = new WIPDao();
	OutputDao outputDao = new OutputDao();

	public String execute() throws Exception {

		ActionContext.getContext().getSession().remove("error");
		ActionContext.getContext().put("TotalWIP", (int) wipDao.getWIPTotal());
		ActionContext.getContext().put("Abnormal", (int) wipDao.getAbnormalTotal());
		ActionContext.getContext().put("MFG", (int) outputDao.getMFG());
		ActionContext.getContext().put("MT", (int) outputDao.getById(4).getOutput_num());
		ActionContext.getContext().put("active", "home");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
