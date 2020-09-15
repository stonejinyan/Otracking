package com.otracking.dao;

import java.util.List;

import com.otracking.bean.BatchTable;
import com.otracking.bean.ServerPagination;

public class BatchTableDao extends IBaseDao<BatchTable> {

	public static final String tableViewName = "batchtable";

	public ServerPagination getAll(int offset, int limit, String order) {
		// TODO Auto-generated method stub
		ServerPagination serverPagination = new ServerPagination();
		serverPagination.setRow(super.getAll(tableViewName, offset, limit, order));
		serverPagination.setTotal(super.queryForTotal(tableViewName));
		return serverPagination;
	}

	public List<BatchTable> getAll() {
		String sql = "select * from " + tableViewName + " order by id DESC limit 500";
		return super.queryForMultiple(sql);
	}
}
