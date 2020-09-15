package com.otracking.action.order;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.SEEEOrder;
import com.otracking.dao.OrderDao;

public class GetOrderByIDAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int limit;
	private int offset;
	private String order;
	private String search;
	private String sort;
	private int id;
	OrderDao orderDao = new OrderDao();
	ArrayList<SEEEOrder> orders = new ArrayList<SEEEOrder>();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {
		orders.add(orderDao.findById(id));
		ActionContext.getContext().put("Json", gson.toJson(orders));
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

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
