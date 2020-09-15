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

	public double getWIPTotal() {
		String sql = "SELECT Count(*) FROM production_schedule INNER JOIN mo ON production_schedule.mo_id = mo.id INNER JOIN method_process ON production_schedule.method_process_id = method_process.id WHERE mo.actual_endtime IS null AND (production_schedule.flag = 1 OR production_schedule.flag = 2 OR production_schedule.flag = 3 OR production_schedule.flag = 5) AND method_process.id = 67";
		return super.queryForCount(sql);
	}

	public double getAbnormalTotal() {
		String sql = "select count(*) from production_schedule where flag = 3";
		return super.queryForCount(sql);
	}
}
