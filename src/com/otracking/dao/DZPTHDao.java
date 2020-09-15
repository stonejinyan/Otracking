package com.otracking.dao;

import java.util.List;

import com.otracking.bean.DZPTH;

public class DZPTHDao extends IBaseDao<DZPTH> {

	public static final String tableName = "dzpth";

	public int[] saveBatch(List<DZPTH> dzpths) {
		String sql = "delete from " + tableName + " where order_id = ?";
		super.update(sql, dzpths.get(0).getOrder_id());
		return super.saveBatch(dzpths, tableName);
	}

	public List<DZPTH> getByOrder_ID(int order_id) {
		return super.findByForeignId(order_id, tableName, "order_id");
	}

	public List<DZPTH> getByMO_AOP(String dms_id, int order_id) {
		String sql = "select * from " + tableName + " where order_id = ? and dms_id = ? order by sequence";
		return super.queryForMultiple(sql, order_id, dms_id);
	}
}
