package com.otracking.action.OrderTechnicalInfo;

import java.util.Date;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.OrderTechnicalInfo;
import com.otracking.bean.Staff;
import com.otracking.dao.OrderTechnicalInfoDao;

public class SaveOrderTechnicalInfoAction extends ActionSupport {
	private int order_id;
	private int role_id;
	private String description;
	OrderTechnicalInfoDao orderTechnicalInfoDao = new OrderTechnicalInfoDao();

	public String execute() throws Exception {
		OrderTechnicalInfo orderTechnicalInfo = new OrderTechnicalInfo();
		orderTechnicalInfo.setDescription(description);
		orderTechnicalInfo.setOrder_id(order_id);
		orderTechnicalInfo.setRole_id(role_id);
		orderTechnicalInfo.setStaff_id(((Staff) ActionContext.getContext().getSession().get("staff")).getId());
		orderTechnicalInfo.setTimestamp(new Date());
		orderTechnicalInfoDao.Save(orderTechnicalInfo);
		ActionContext.getContext().put("order_id", order_id);
		ActionContext.getContext().put("active", "Order");
		return "success";
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	};

}
