package com.otracking.dao;

import java.util.List;

import com.otracking.bean.MOTable;
import com.otracking.bean.ServerPagination;

public class MOTableDao extends IBaseDao<MOTable> {

	public static final String tableViewName = "motable";

	public ServerPagination getAll(int offset, int limit, String sort, String order, String search) {
		// TODO Auto-generated method stub
		ServerPagination serverPagination = new ServerPagination();
		String sql = null;
		if (search != null && !search.equals("")) {
			sql = "where (order_name like ? or batch_name like ? or name like ? or dms_id like ? or product_bigtype_name like ? or schedule_starttime like binary ? or schedule_endtime like binary ? or actual_starttime like binary ? or actual_endtime like binary ? or dms_id like ? or WBS like ? or securityCode = ?)";
			serverPagination.setRow(super.getAll1(tableViewName, offset, limit, order, sort, sql, "%" + search + "%",
			        "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%",
			        "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%",
			        search));
			serverPagination.setTotal(super.queryForTotal(tableViewName, sql, "%" + search + "%", "%" + search + "%",
			        "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%",
			        "%" + search + "%", "%" + search + "%", "%" + search + "%", "%" + search + "%", search));
		} else {
			serverPagination.setRow(super.getAll(tableViewName, offset, limit, order, sort));
			serverPagination.setTotal(super.queryForTotal(tableViewName));
		}
		return serverPagination;
	}

	public ServerPagination getMOStatus(int offset, int limit, String order, int order_id) {
		// TODO Auto-generated method stub
		ServerPagination serverPagination = new ServerPagination();
		serverPagination.setRow(super.getAll(tableViewName, offset, limit, order));
		serverPagination.setTotal(super.queryForTotal(tableViewName));
		return serverPagination;
	}

	public List<MOTable> getAllWhereBatch_EndTimeIsNull() {
		String sql = "select * from " + tableViewName + " where batch_actual_endtime is null order by batch_id,id";
		return super.queryForMultiple(sql);
	}

	public List<MOTable> getAllLVSMO_EndTimeIsNull() {
		String sql = "SELECT \r\n" + "motable.*\r\n" + "FROM\r\n" + "	motable,\r\n" + "	product_type,\r\n"
		        + "	product_model \r\n" + "WHERE\r\n" + "	motable.product_type_id = product_type.id \r\n"
		        + "	AND product_type.bigtype_id = product_model.id \r\n" + "	AND actual_endtime IS NULL \r\n"
		        + "	AND ( product_model.product_classify_id = 3 OR product_model.product_classify_id = 4 OR product_model.product_classify_id = 5 )\r\n"
		        + "	ORDER BY schedule_starttime  desc LIMIT 500";
		return super.queryForMultiple(sql);
	}

	public List<MOTable> getByBatch(int batch_id) {
		String sql = "select * from " + tableViewName + " where batch_id = ? order by schedule_starttime";
		return super.queryForMultiple(sql, batch_id);
	}

	public MOTable getByID(int id) {
		return super.findById(id, tableViewName);
	}

	public MOTable getByName(String name) {
		String sql = "select * from " + tableViewName + " where name = ?";
		return super.queryForSingle(sql, name);
	}
}
