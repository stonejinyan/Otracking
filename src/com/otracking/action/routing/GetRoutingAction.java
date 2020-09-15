package com.otracking.action.routing;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.RoutingTable;
import com.otracking.dao.RoutingDao;
import com.otracking.dao.RoutingTableDao;

public class GetRoutingAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	/*
	 * private int limit; private int offset; private String order;
	 */
	RoutingDao routingDao = new RoutingDao();
	RoutingTableDao routingTableDao = new RoutingTableDao();

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {
		List<RoutingTable> routingTables = routingTableDao.getAll();
		ActionContext.getContext().put("Json", gson.toJson(routingTables));
		return "success";
	}
}
