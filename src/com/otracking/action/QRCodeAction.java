package com.otracking.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Method_ProcessTableDao;

public class QRCodeAction extends ActionSupport {

	Method_ProcessTableDao Method_ProcessTableDao = new Method_ProcessTableDao();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext.getContext().put("Method_Process", Method_ProcessTableDao.getAll());
		return "success";
	}
}
