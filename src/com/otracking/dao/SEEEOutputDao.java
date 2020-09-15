package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Output;

public class SEEEOutputDao extends IBaseDao<Output> {

	public List<Output> getOutputByMethod_ProcessAndDate(int method_process_id, String year, String month) {
		String sql = "SELECT\r\n" + "	SUM( mo.quantity ) AS quantity,\r\n"
		        + "	DAY (production_schedule.actual_endtime) AS outputDate\r\n" + "FROM\r\n"
		        + "	production_schedule,mo \r\n" + "WHERE\r\n" + "	production_schedule.mo_id = mo.id \r\n"
		        + "	AND production_schedule.method_process_id = ? \r\n"
		        + "	AND YEAR ( production_schedule.actual_endtime ) = ?\r\n"
		        + "	AND MONTH ( production_schedule.actual_endtime ) = ? \r\n" + "GROUP BY\r\n" + "	outputDate \r\n"
		        + "ORDER BY\r\n" + "	outputDate ASC";
		return super.queryForMultiple(sql, method_process_id, year, month);
	}

	public List<Output> getOutputByMethod_Process_TypeAndDate(int method_process_type_id, String year, String month) {
		String sql = "SELECT\r\n" + "SUM(mo.quantity) AS quantity,\r\n"
		        + "DAY (production_schedule.actual_endtime) AS outputDate\r\n" + "FROM\r\n" + "production_schedule\r\n"
		        + "INNER JOIN method_process ON production_schedule.method_process_id = method_process.id\r\n"
		        + "INNER JOIN mo ON production_schedule.mo_id = mo.id\r\n"
		        + "INNER JOIN method_process_type ON method_process.method_process_type_id = method_process_type.id\r\n"
		        + "WHERE\r\n" + "method_process_type.id = ? AND\r\n"
		        + "YEAR ( production_schedule.actual_endtime ) = ? AND\r\n"
		        + "MONTH ( production_schedule.actual_endtime ) = ?\r\n" + "GROUP BY\r\n" + "outputDate\r\n"
		        + "ORDER BY\r\n" + "outputDate ASC";
		return super.queryForMultiple(sql, method_process_type_id, year, month);
	}

	public List<Output> getPTEQPPlanning(String year, String month) {
		// TODO Auto-generated method stub
		String sql = "select day(schedule_starttime) as outputDate,sum(quantity) as quantity from motable where year(schedule_starttime) = ? and month(schedule_starttime) = ? and product_bigtype_name in ('OKKEN','Blokset') GROUP BY outputDate";
		return super.queryForMultiple(sql, year, month);
	}

	public List<Output> getOthersPlanning(String year, String month, String classify) {
		// TODO Auto-generated method stub
		String sql = "select day(schedule_starttime) as outputDate,sum(quantity) as quantity from motable where year(schedule_starttime) = ? and month(schedule_starttime) = ? and product_bigtype_name = ? GROUP BY outputDate";
		return super.queryForMultiple(sql, year, month, classify);
	}
}
