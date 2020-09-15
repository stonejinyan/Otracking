package com.otracking.dao;

import com.otracking.bean.Bulk;
import com.otracking.bean.ServerPagination;

public class BulkDao extends IBaseDao<Bulk> {

	public static final String tableName = "bulk";

	public ServerPagination getBulkList(int offset, int limit, String sort, String order, String search) {
		ServerPagination serverPagination = new ServerPagination();
		String sql1 = "select * from " + tableName;
		String sql3 = " order by " + sort + " " + order + " limit " + offset + "," + limit;
		String sql4 = "select count(*) from " + tableName;

		if (search != null && !search.equals("")) {
			String sql2 = " where (name like ? or description_zh like ? or description_en like ?)";
			serverPagination.setRow(super.queryForMultiple(sql1 + sql2 + sql3, "%" + search + "%", "%" + search + "%",
			        "%" + search + "%"));
			serverPagination.setTotal((long) super.queryForCount(sql4 + sql2, "%" + search + "%", "%" + search + "%",
			        "%" + search + "%"));
		} else {

			serverPagination.setRow(super.queryForMultiple(sql1 + sql3));
			serverPagination.setTotal((long) super.queryForCount(sql4));
		}
		return serverPagination;
	}

	public int update(int id, String fieldName, String newValue) {
		String sql = "update " + tableName + " set " + fieldName + " = ? where id = ?";
		return super.update(sql, newValue, id);
	}
}
