package com.otracking.dao;

import java.util.List;

import com.otracking.bean.RoutingTable;
import com.otracking.bean.ServerPagination;

public class RoutingTableDao extends IBaseDao<RoutingTable> {

	public static final String tableViewName = "routingtable";

	public ServerPagination getAll(int offset, int limit, String order) {
		// TODO Auto-generated method stub
		ServerPagination serverPagination = new ServerPagination();
		serverPagination.setRow(super.getAll(tableViewName, offset, limit, order, "sequence"));
		serverPagination.setTotal(super.queryForTotal(tableViewName));
		return serverPagination;
	}

	public List<RoutingTable> getAll() {
		return super.getAll(tableViewName);
	}
}
