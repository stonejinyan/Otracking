package com.otracking.action.smalltype;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Product_TypeDao;

public class GetSmallTypeAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Product_TypeDao product_TypeDao = new Product_TypeDao();

	public String execute() throws Exception {

		Gson gson = new Gson();
		ActionContext.getContext().put("Json", gson.toJson(product_TypeDao.getAll()));
		return "success";

	}
}
