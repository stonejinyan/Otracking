package com.otracking.action.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.ProcessLine;
import com.otracking.bean.ProcessLineStatus;
import com.otracking.bean.ServerPagination;
import com.otracking.dao.ProcessLineDao;

public class GetOrderStatusAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int limit;
	private int offset;
	private String order;
	ProcessLineDao processLineDao = new ProcessLineDao();

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {
		List<ProcessLineStatus> batchStatuss = new ArrayList<ProcessLineStatus>();
		ServerPagination serverPagination = new ServerPagination();
		List<ProcessLine> processLines = processLineDao.getAll();
		for (int i = 0; i < 6; i++) {
			ProcessLineStatus processLineStatus = new ProcessLineStatus(i + 1, processLines.get(i).getName(),
			        /*
			         * "50%" + ProgressBar.getProgressBar("50%", "20%", "10%", "5%"), "50%" +
			         * ProgressBar.getProgressBar("50%", "20%", "10%", "5%"), "50%" +
			         * ProgressBar.getProgressBar("50%", "20%", "10%", "5%"), "50%" +
			         * ProgressBar.getProgressBar("50%", "20%", "10%", "5%"), "50%" +
			         * ProgressBar.getProgressBar("50%", "20%", "10%", "5%"), "50%" +
			         * ProgressBar.getProgressBar("50%", "20%", "10%", "5%"),
			         */
			        "<span class='glyphicon glyphicon-stop success' aria-hidden='true'></span>",
			        "<span class='glyphicon glyphicon-stop success' aria-hidden='true'></span>",
			        "<span class='glyphicon glyphicon-stop success' aria-hidden='true'></span>",
			        "<span class='glyphicon glyphicon-stop success' aria-hidden='true'></span>",
			        "<span class='glyphicon glyphicon-stop success' aria-hidden='true'></span>",
			        "<span class='glyphicon glyphicon-stop success' aria-hidden='true'></span>",
			        "<span class='glyphicon glyphicon-stop success' aria-hidden='true'></span>",
			        "<span class='glyphicon glyphicon-stop success' aria-hidden='true'></span>");
			batchStatuss.add(processLineStatus);
		}
		serverPagination.setRow(batchStatuss);
		serverPagination.setTotal(6);
		ActionContext.getContext().put("Json", gson.toJson(serverPagination));
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
