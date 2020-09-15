package com.otracking.action.smalltype;

import org.apache.logging.log4j.LogManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Product_Type;
import com.otracking.dao.Product_TypeDao;

public class SaveSmallTypeAction extends ActionSupport {
	private String name;
	private int bigtype_id;
	Product_TypeDao product_TypeDao = new Product_TypeDao();

	public String execute() throws Exception {
		if (name != null && name != "" && !name.equals("") && bigtype_id > 0) {
			Product_Type product_Type = new Product_Type();
			product_Type.setName(name);
			product_Type.setBigtype_id(bigtype_id);
			product_TypeDao.save(product_Type);
			LogManager.getLogger()
			        .info(ActionContext.getContext().getSession().get("staff") + " 新增一个产品小类 ：" + product_Type);
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

	public int getBigtype_id() {
		return bigtype_id;
	}

	public void setBigtype_id(int bigtype_id) {
		this.bigtype_id = bigtype_id;
	}

}
