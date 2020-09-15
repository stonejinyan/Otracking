package com.otracking.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.SEEEOutputDao;

public class getOutputAction extends ActionSupport {

	private int method_process_id;
	private int method_process_type_id;
	// 1-method_process_id
	// 2-method_process_type_id
	private int flag;
	private String year;
	private String month;

	@Override
	public String execute() throws Exception {
		Gson gson = new Gson();
		SEEEOutputDao seeeOutputDao = new SEEEOutputDao();
		if (flag == 1) {
			ActionContext.getContext().put("Json",
			        gson.toJson(seeeOutputDao.getOutputByMethod_ProcessAndDate(method_process_id, year, month)));
		} else if (flag == 2) {
			ActionContext.getContext().put("Json", gson
			        .toJson(seeeOutputDao.getOutputByMethod_Process_TypeAndDate(method_process_type_id, year, month)));
		}

		return "success";
	}

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getMethod_process_type_id() {
		return method_process_type_id;
	}

	public void setMethod_process_type_id(int method_process_type_id) {
		this.method_process_type_id = method_process_type_id;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
