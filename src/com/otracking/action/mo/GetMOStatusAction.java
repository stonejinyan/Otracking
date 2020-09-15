package com.otracking.action.mo;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.MO;
import com.otracking.bean.ServerPagination;
import com.otracking.dao.MODao;
import com.otracking.dao.MOTableDao;

public class GetMOStatusAction extends ActionSupport {
	private int limit;
	private int offset;
	private int order_id;
	private String order;
	MODao moDao = new MODao();
	MOTableDao moTableDao = new MOTableDao();

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {
		if (limit != 0) {
			ServerPagination serverPagination = moTableDao.getMOStatus(offset, limit, order, order_id);
			ActionContext.getContext().put("Json", gson.toJson(serverPagination));
		} else {
			List<MO> mos = moDao.getAll();
			ActionContext.getContext().put("Json", gson.toJson(mos));
		}
		return "success";

	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

}
