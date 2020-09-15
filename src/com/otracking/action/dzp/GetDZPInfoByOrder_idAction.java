package com.otracking.action.dzp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.DZPTHDao;

public class GetDZPInfoByOrder_idAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int order_id;
	DZPTHDao dzpthDao = new DZPTHDao();

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {

		ActionContext.getContext().put("Json", gson.toJson(dzpthDao.getByOrder_ID(order_id)));

		return "success";

	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

}
