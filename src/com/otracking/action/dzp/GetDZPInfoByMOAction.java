package com.otracking.action.dzp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.DZPTHDao;
import com.otracking.dao.MODao;

public class GetDZPInfoByMOAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int mo_id;
	private int order_id;
	DZPTHDao dzpthDao = new DZPTHDao();
	MODao moDao = new MODao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {

		ActionContext.getContext().put("Json",
		        gson.toJson(dzpthDao.getByMO_AOP(moDao.getfindById(mo_id).getDms_id(), order_id)));

		return "success";

	}

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

}
