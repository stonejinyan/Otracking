package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Production_ScheduleTableDao;

public class SearchProductionScheduleAction extends ActionSupport {

	private int limit;
	private String date_start;
	private String date_end;
	private int offset;
	private String order;
	private String orderBy;
	private String searchType;
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	Production_ScheduleTableDao production_ScheduleTableDao = new Production_ScheduleTableDao();

	public String execute() throws Exception {
		if (orderBy == null) {
			orderBy = "mo_name";
		}
		ActionContext.getContext().put("Json", gson.toJson(production_ScheduleTableDao.getAllBySearchType(searchType,
		        date_start, date_end, offset, limit, order, orderBy)));
		return "success";
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getDate_start() {
		return date_start;
	}

	public void setDate_start(String date_start) {
		this.date_start = date_start;
	}

	public String getDate_end() {
		return date_end;
	}

	public void setDate_end(String date_end) {
		this.date_end = date_end;
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

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public Production_ScheduleTableDao getProduction_ScheduleTableDao() {
		return production_ScheduleTableDao;
	}

	public void setProduction_ScheduleTableDao(Production_ScheduleTableDao production_ScheduleTableDao) {
		this.production_ScheduleTableDao = production_ScheduleTableDao;
	}

}
