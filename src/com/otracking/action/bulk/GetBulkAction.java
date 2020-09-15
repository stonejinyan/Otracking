package com.otracking.action.bulk;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.otracking.dao.BulkDao;

public class GetBulkAction {
	private int offset;
	private String sort;
	private String order;
	private int limit;
	private String search;

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		BulkDao bulkDao = new BulkDao();

		ActionContext.getContext().put("Json", gson.toJson(bulkDao.getBulkList(offset, limit, sort, order, search)));
		return "success";
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}
