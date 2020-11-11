package com.otracking.dao;

import com.otracking.bean.WIP;

public class WIPDao extends IBaseDao<WIP> {

	public double getWIPFlag1(int methodProcessID) {
		String sql = "select count(*) from method_process,production_schedule,mo where production_schedule.method_process_id = method_process.id and production_schedule.mo_id = mo.id and flag = 1 and mo.actual_endtime is null and method_process.id = ?";
		return super.queryForCount(sql, methodProcessID);
	}

	public double getWIPFlag2(int methodProcessID) {
		String sql = "select count(*) from method_process,production_schedule,mo where production_schedule.method_process_id = method_process.id and production_schedule.mo_id = mo.id and flag = 2 and mo.actual_endtime is null and method_process.id = ?";
		return super.queryForCount(sql, methodProcessID);
	}

	public double getWIPFlag3(int methodProcessID) {
		String sql = "select count(*) from method_process,production_schedule,mo where production_schedule.method_process_id = method_process.id and production_schedule.mo_id = mo.id and flag = 3 and mo.actual_endtime is null and method_process.id = ?";
		return super.queryForCount(sql, methodProcessID);
	}

	public double getWIPTotal(int familyID) {
		String sql = "select SUM(mo.quantity) from mo,batch,seeeorder where mo.batch_id = batch.id and batch.order_id = seeeorder.id and mo.actual_endtime is null and mo.scheduling = 1 and seeeorder.familyID = ?";
		return super.queryForCount(sql, familyID);
	}

	public double getAbnormalTotal(int familyID) {
		String sql = "select count(*) from production_scheduletable where production_status = 3 and familyID =?";
		return super.queryForCount(sql, familyID);
	}

	public double getPackageWIP() {
		String sql = "SELECT\r\n" + "COUNT(*)\r\n" + "FROM\r\n" + "mo\r\n"
		        + "INNER JOIN product_type ON mo.product_type_id = product_type.id\r\n"
		        + "INNER JOIN product_model ON product_type.bigtype_id = product_model.id\r\n"
		        + "INNER JOIN product_classify ON product_model.product_classify_id = product_classify.id\r\n"
		        + "WHERE\r\n" + "product_classify_id in (1,2) AND\r\n" + "mo.actual_endtime IS NOT null AND\r\n"
		        + "mo.package_time IS null";
		return super.queryForCount(sql);
	}
}
