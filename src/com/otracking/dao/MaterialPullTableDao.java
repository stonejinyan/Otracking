package com.otracking.dao;

import java.util.List;

import com.otracking.bean.MaterialPullTable;
import com.otracking.bean.ServerPagination;

public class MaterialPullTableDao extends IBaseDao<MaterialPullTable> {

	public static final String tableName = "materialpulltable";

	public List<MaterialPullTable> getMaterialPullList(int method_type_id, int flag) {
		String sql = "select * from " + tableName + " where method_type_id = ? and flag = ?";
		return super.queryForMultiple(sql, method_type_id, flag);
	}

	public ServerPagination getMaterialPullList(int method_type_id, int flag, int offset, int limit, String sort,
	        String order, String search) {
		ServerPagination serverPagination = new ServerPagination();
		String sql1 = "select * from " + tableName + " where method_type_id = ? and flag = ?";
		String sql3 = " order by " + sort + " " + order + " limit " + offset + "," + limit;
		String sql4 = "select count(*) from " + tableName + " where method_type_id = ? and flag = ?";
		if (search != null && !search.equals("")) {
			String sql2 = " and (order_name like ? or batch_name like ? or name like ? or processline like ? or family like ? or type like ?)";
			serverPagination.setRow(super.queryForMultiple(sql1 + sql2 + sql3, method_type_id, flag, "%" + search + "%",
			        "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%",
			        "%" + search + "%"));
			serverPagination.setTotal((long) super.queryForCount(sql4 + sql2, method_type_id, flag, "%" + search + "%",
			        "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%",
			        "%" + search + "%"));
		} else {
			serverPagination.setRow(super.queryForMultiple(sql1 + sql3, method_type_id, flag));
			serverPagination.setTotal((long) super.queryForCount(sql4, method_type_id, flag));
		}
		return serverPagination;
	}

}
