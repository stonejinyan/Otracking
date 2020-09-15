package com.otracking.action.keycomponents;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.KeyComponentsDao;

public class EditKeyComponentsAction extends ActionSupport {

	private int id;
	private String fieldName;
	private String oldValue;
	private String newValue;
	KeyComponentsDao keyComponentsDao = new KeyComponentsDao();
	Gson gson = new Gson();

	public String execute() throws Exception {
		String sql = "set " + fieldName + " = ? where id = ?";
		int status = keyComponentsDao.update(sql, id, newValue);
		ActionContext.getContext().put("Json", gson.toJson(status));
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

}
