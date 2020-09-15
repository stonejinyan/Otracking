package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Routing;

public class RoutingDao extends IBaseDao<Routing> {

	public static final String tableName = "routing";

	public boolean save(Routing routing) {
		return super.save(routing, tableName);
	}

	public List<Routing> getAll() {
		// TODO Auto-generated method stub
		return super.getAll(tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}

	public List<Routing> getByProductType_Id(int product_type_id) {
		// TODO Auto-generated method stub
		return super.findByForeignId(product_type_id, tableName, "type_id", "sequence");
	}

	public Routing getRouting(int methodProcess_id, int product_type_id) {
		// TODO Auto-generated method stub
		String sql = "select * from " + tableName + " where method_process_id = ? and type_id = ?";
		return super.queryForSingle(sql, methodProcess_id, product_type_id);
	}

	public Routing findById(int id) {
		// TODO Auto-generated method stub
		return super.findById(id, tableName);
	}
}
