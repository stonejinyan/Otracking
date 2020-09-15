package com.otracking.action.batch;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Batch;
import com.otracking.dao.BatchDao;
import com.otracking.dao.BatchTableDao;

public class GetBatchAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int limit;
	private int offset;
	private String order;
	BatchDao batchDao = new BatchDao();
	BatchTableDao batchTableDao = new BatchTableDao();

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {
		if (limit != 0) {
			ActionContext.getContext().put("Json", gson.toJson(batchTableDao.getAll()));
		} else {
			List<Batch> batchs = batchDao.getAll();
			ActionContext.getContext().put("Json", gson.toJson(batchs));
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

}
