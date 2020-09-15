package com.otracking.dao;

import java.util.List;

import com.otracking.bean.OrderTechnicalInfo;

public class OrderTechnicalInfoDao extends IBaseDao<OrderTechnicalInfo> {

	public static final String tableName = "ordertechnicalinfo";

	public boolean Save(OrderTechnicalInfo orderTechnicalInfo) {
		return super.save(orderTechnicalInfo, tableName);
	}

	public List<OrderTechnicalInfo> getByRoleAndOrder(int role_id, int order_id) {
		String sql = "select * from " + tableName + " where role_id = ? and order_id = ?";
		return super.queryForMultiple(sql, role_id, order_id);
	}
}
