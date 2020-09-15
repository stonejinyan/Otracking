package com.otracking.action.bigtype;

import org.apache.logging.log4j.LogManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Product_Big_Type;
import com.otracking.dao.BigTypeDao;

public class BigTypeSaveAction extends ActionSupport {
	private String name;
	BigTypeDao bigTypeDao = new BigTypeDao();

	public String execute() throws Exception {
		if (name != null && name != "" && !name.equals("")) {
			Product_Big_Type product_Big_Type = new Product_Big_Type();
			product_Big_Type.setName(name);
			bigTypeDao.save(product_Big_Type);
			LogManager.getLogger()
			        .info(ActionContext.getContext().getSession().get("staff") + " 新增一个产品大类 ：" + product_Big_Type);
		}
		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
