package com.otracking.action.bigtype;

import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Product_Big_Type;
import com.otracking.dao.BigTypeDao;

public class GetBigTypeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	BigTypeDao bigTypeDao = new BigTypeDao();

	public String execute() throws Exception {
		List<Product_Big_Type> product_Big_Types = bigTypeDao.getAll();
		Gson gson = new Gson();
		ActionContext.getContext().put("Json", gson.toJson(product_Big_Types));
		return "success";

	}
}
