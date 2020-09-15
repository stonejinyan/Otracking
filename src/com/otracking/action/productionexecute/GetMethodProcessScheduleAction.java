package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.ServerPagination;
import com.otracking.dao.Production_ScheduleTableDao;

public class GetMethodProcessScheduleAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int method_process_id;
	private int production_status;
	private int limit;
	private String search;
	private int offset;
	private String order;
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	Production_ScheduleTableDao production_ScheduleTableDao = new Production_ScheduleTableDao();

	public String execute() throws Exception {
		ServerPagination serverPagination = production_ScheduleTableDao.getAll(search, offset, limit, order,
		        method_process_id, production_status);

		ActionContext.getContext().put("Json", gson.toJson(serverPagination));
		return "success";
	}

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
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

	public int getProduction_status() {
		return production_status;
	}

	public void setProduction_status(int production_status) {
		this.production_status = production_status;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}
