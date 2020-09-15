package com.otracking.action.ekitting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.EKittingTableDao;

public class GetEKittingListAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private int limit;
	private int offset;
	private int order_id;
	private String order;
	private String orderBy;
	private int method_process_id;
	private int flag;
	EKittingTableDao eKittingTableDao = new EKittingTableDao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	public String execute() throws Exception {
		ActionContext.getContext().put("Json",
		        gson.toJson(eKittingTableDao.getEKittingList(method_process_id, flag, offset, limit, order, orderBy)));
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

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
