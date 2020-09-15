package com.otracking.action.keycomponents;

import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.KeyComponents;
import com.otracking.dao.KeyComponentsDao;

public class GetKeyComponentsAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String type;
	KeyComponentsDao keyComponentsDao = new KeyComponentsDao();

	public String execute() throws Exception {
		List<KeyComponents> keyComponents = keyComponentsDao.getAll();
		Gson gson = new Gson();
		ActionContext.getContext().put("Json", gson.toJson(keyComponents));
		return "success";

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
