package com.otracking.action.OrderTechnicalInfo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.OrderTechnicalInfoDao;

public class GetOrderTechnicalInfoByRoleAndOrderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int order_id;
	private int role_id;
	private int limit;
	private int offset;
	private String order;
	private String search;
	private String sort;
	OrderTechnicalInfoDao orderTechnicalInfoDao = new OrderTechnicalInfoDao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	public String execute() throws Exception {

		ActionContext.getContext().put("Json", gson.toJson(orderTechnicalInfoDao.getByRoleAndOrder(role_id, order_id)));
		return "success";
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
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

}
