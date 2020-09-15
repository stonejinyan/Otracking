package com.otracking.action.order;

import org.apache.logging.log4j.LogManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.SEEEOrder;
import com.otracking.dao.OrderDao;
import com.otracking.tool.DateUtil;

public class SaveOrderAction extends ActionSupport {
	SEEEOrder order = new SEEEOrder();
	OrderDao orderDao = new OrderDao();

	public String execute() throws Exception {
		if (order.getSchedule_starttime() == null) {
			order.setSchedule_starttime(DateUtil.getNowDateShort());
		}
		if (order.getSchedule_starttime() != null && order.getName() != null && order.getName() != ""
		        && !order.getName().equals("")) {
			orderDao.save(order);
			LogManager.getLogger().info(ActionContext.getContext().getSession().get("staff") + " 新增一个Order ：" + order);
		}
		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

	public SEEEOrder getOrder() {
		return order;
	}

	public void setOrder(SEEEOrder order) {
		this.order = order;
	}

}
