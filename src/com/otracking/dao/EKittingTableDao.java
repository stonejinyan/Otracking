package com.otracking.dao;

import org.junit.Test;

import com.otracking.bean.EKittingTable;
import com.otracking.bean.ServerPagination;

public class EKittingTableDao extends IBaseDao<EKittingTable> {

	public static final String tableName = "ekittingtable";

	public ServerPagination getEKittingList(int method_process_id, int flag, int offset, int limit, String order,
	        String orderBy) {
		ServerPagination serverPagination = new ServerPagination();
		String sql = "where method_process_id = ? and flag = ?";
		String sql1 = "";
		if (flag == 1 || flag == 0) {
			serverPagination
			        .setRow(super.getAll1(tableName, offset, limit, order, orderBy, sql, method_process_id, flag));
			serverPagination.setTotal(super.queryForTotal(tableName, sql, method_process_id, flag));
		} else {
			serverPagination.setRow(super.getAll1(tableName, offset, limit, "DESC", "schedule_starttime", sql1));
			serverPagination.setTotal(super.queryForTotal(tableName, sql1));
		}

		return serverPagination;
	}

	public EKittingTable findByID(int id) {
		return super.findById(id, tableName);
	}

	@Test
	public void test() {
		System.out.println(findByID(1261).getProcessline_sap());
	}
}
