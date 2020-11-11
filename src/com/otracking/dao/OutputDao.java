package com.otracking.dao;

import com.otracking.bean.SEEEOutput;

public class OutputDao extends IBaseDao<SEEEOutput> {

	public static final String tableName = "output";

	public int updateDayToZero() {
		String sql = "update " + tableName + " set output_num = 0 where id = 1";
		return super.update(sql);
	}

	public int updateMonthToZero() {
		String sql = "update " + tableName + " set output_num = 0 where id = 2";
		return super.update(sql);
	}

	public int updateMonthTarget(int familtID, int target) {
		String sql = "update target set target = ? where id = ?";
		return super.update(sql, target, familtID);
	}

	public SEEEOutput getById(int id) {
		return super.findById(id, tableName);
	}

	public int getMFG(int familyID) {
		String sql = "SELECT\r\n" + "	SUM(mo.quantity)\r\n" + "FROM\r\n" + "	mo\r\n"
		        + "	INNER JOIN batch ON mo.batch_id = batch.id\r\n"
		        + "	INNER JOIN seeeorder ON batch.order_id = seeeorder.id\r\n"
		        + "	INNER JOIN product_type ON mo.product_type_id = product_type.id\r\n"
		        + "	INNER JOIN product_model ON product_type.bigtype_id = product_model.id\r\n"
		        + "	INNER JOIN product_classify ON product_model.product_classify_id = product_classify.id \r\n"
		        + "WHERE\r\n" + "	seeeorder.familyID = ?\r\n" + "	AND YEAR ( mo.actual_endtime ) = YEAR (\r\n"
		        + "	NOW()) \r\n" + "	AND MONTH ( mo.actual_endtime ) = MONTH (\r\n" + "	NOW())";
		return (int) super.queryForCount(sql, familyID);
	}

	public int getTarget(int familyID) {
		// TODO Auto-generated method stub
		String sql = "select target from target where id = ?";
		return (int) super.queryForCount(sql, familyID);
	}
}
