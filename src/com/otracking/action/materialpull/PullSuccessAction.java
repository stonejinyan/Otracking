package com.otracking.action.materialpull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Staff;
import com.otracking.dao.MaterialPullDao;

public class PullSuccessAction extends ActionSupport {

	private int id;
	private int flag;
	private int method_type_id;
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	@Override
	public String execute() throws Exception {
		Staff staff = (Staff) ActionContext.getContext().getSession().get("staff");
		MaterialPullDao materialPullDao = new MaterialPullDao();
		flag = 2;
		materialPullDao.updateFlag(id, method_type_id, flag, staff.getId());
		ActionContext.getContext().put("Json", gson.toJson("OK"));
		return "success";
	}

	public int getMethod_type_id() {
		return method_type_id;
	}

	public void setMethod_type_id(int method_type_id) {
		this.method_type_id = method_type_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
