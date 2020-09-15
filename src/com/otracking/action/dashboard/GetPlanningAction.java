package com.otracking.action.dashboard;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.SEEEOutputDao;

public class GetPlanningAction extends ActionSupport {

	private String classify;
	private String year;
	private String month;

	@Override
	public String execute() throws Exception {
		Gson gson = new Gson();
		SEEEOutputDao seeeOutputDao = new SEEEOutputDao();
		if (classify.equals("PTEQP")) {
			ActionContext.getContext().put("Json", gson.toJson(seeeOutputDao.getPTEQPPlanning(year, month)));
		} else {
			ActionContext.getContext().put("Json", gson.toJson(seeeOutputDao.getOthersPlanning(year, month, classify)));
		}

		return "success";
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
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

}
