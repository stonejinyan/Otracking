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

	public int updateMonthTarget(int num) {
		String sql = "update " + tableName + " set output_num = ? where id = 4";
		return super.update(sql, num);
	}

	public SEEEOutput getById(int id) {
		return super.findById(id, tableName);
	}

	public int getMFG() {
		String sql = "SELECT\r\n" + "COUNT(*)\r\n" + "FROM\r\n" + "production_schedule\r\n"
		        + "INNER JOIN method_process ON production_schedule.method_process_id = method_process.id\r\n"
		        + "INNER JOIN mo ON production_schedule.mo_id = mo.id\r\n"
		        + "INNER JOIN batch ON mo.batch_id = batch.id\r\n"
		        + "INNER JOIN seeeorder ON batch.order_id = seeeorder.id\r\n"
		        + "INNER JOIN product_type ON mo.product_type_id = product_type.id\r\n"
		        + "INNER JOIN product_model ON product_type.bigtype_id = product_model.id\r\n"
		        + "INNER JOIN product_classify ON product_model.product_classify_id = product_classify.id\r\n"
		        + "WHERE\r\n" + "production_schedule.method_process_id = 67 AND\r\n"
		        + "YEAR(production_schedule.actual_endtime) = YEAR(NOW()) AND\r\n"
		        + "MONTH(production_schedule.actual_endtime) = MONTH(NOW())";
		return (int) super.queryForCount(sql);
	}
}
