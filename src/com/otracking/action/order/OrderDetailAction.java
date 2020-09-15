package com.otracking.action.order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.OrderDao;

public class OrderDetailAction extends ActionSupport {

	OrderDao orderDao = new OrderDao();
	private int order_id;

	public String execute() throws Exception {

		ActionContext.getContext().put("Order", orderDao.findById(order_id));
		ActionContext.getContext().put("active", "Order");
		return "success";
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

}
