package com.otracking.dao;

import com.otracking.bean.Production_ScheduleTable;
import com.otracking.bean.ServerPagination;

public class Production_ScheduleTableDao extends IBaseDao<Production_ScheduleTable> {

	public static final String tableViewName = "production_scheduletable";

	public ServerPagination getAll(String search, int offset, int limit, String order, int method_process_id,
	        int production_status) {
		// TODO Auto-generated method stub
		ServerPagination serverPagination = new ServerPagination();
		String sql = null;
		if (search != null && !search.equals("")) {
			sql = "where method_process_id = ? and production_status = ? and (order_name like ? or batch_name like ? or mo_name like ? or product_type_name like ? or product_bigtype_name like ? or schedule_starttime like binary ? or actual_starttime like binary ? or actual_endtime like binary ? or dms_id like ? or processline like ?)";
			serverPagination.setRow(super.getAll1(tableViewName, offset, limit, order,
			        "actual_endtime desc,mo_schedule_starttime asc,processline asc,no asc,order_name asc,batch_name asc,mo_name",
			        sql, method_process_id, production_status, "%" + search + "%", "%" + search + "%",
			        "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%",
			        "%" + search + "%", "%" + search + "%", "%" + search + "%"));
			serverPagination.setTotal(super.queryForTotal(tableViewName, sql, method_process_id, production_status,
			        "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%",
			        "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%",
			        "%" + search + "%"));
		} else {
			sql = "where method_process_id = ? and production_status = ?";
			serverPagination.setRow(super.getAll1(tableViewName, offset, limit, order,
			        "actual_endtime desc,mo_schedule_starttime asc,processline asc,no asc,order_name asc,batch_name asc,mo_name",
			        sql, method_process_id, production_status));
			serverPagination.setTotal(super.queryForTotal(tableViewName, sql, method_process_id, production_status));
		}
		return serverPagination;
	}

	public Production_ScheduleTable findById(int id) {
		// TODO Auto-generated method stub
		return super.findById(id, tableViewName);
	}

	public ServerPagination getAllBySearchType(String searchType, String date_start, String date_end, int offset,
	        int limit, String order, String orderBy) {
		// TODO Auto-generated method stub
		ServerPagination serverPagination = new ServerPagination();
		String sql = "where date_format(" + searchType + ",'%Y-%m-%d') >= ? and date_format(" + searchType
		        + ",'%Y-%m-%d') <= ?";
		serverPagination.setRow(super.getAll1(tableViewName, offset, limit, order, orderBy, sql, date_start, date_end));
		serverPagination.setTotal(super.queryForTotal(tableViewName, sql, date_start, date_end));
		return serverPagination;
	}
}
