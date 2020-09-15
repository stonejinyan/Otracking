package com.otracking.dao;

import java.util.List;

import com.otracking.bean.SEEEOrder;
import com.otracking.bean.ServerPagination;

public class OrderDao extends IBaseDao<SEEEOrder> {

	public static final String tableName = "seeeorder";

	public boolean save(SEEEOrder order) {
		return super.save(order, tableName);
	}

	public ServerPagination getAll(int offset, int limit, String sort, String order, String search) {
		// TODO Auto-generated method stub
		ServerPagination serverPagination = new ServerPagination();
		String sql = null;
		if (search != null && !search.equals("")) {
			sql = "where (name like ? or SO like ?)";
			serverPagination.setRow(
			        super.getAll1(tableName, offset, limit, order, sort, sql, "%" + search + "%", "%" + search + "%"));
			serverPagination.setTotal(super.queryForTotal(tableName, sql, "%" + search + "%", "%" + search + "%"));
		} else {
			serverPagination.setRow(super.getAll(tableName, offset, limit, order, sort));
			serverPagination.setTotal(super.queryForTotal(tableName));
		}
		return serverPagination;
	}

	public List<SEEEOrder> getAll() {
		// TODO Auto-generated method stub
		return super.getAll(tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}

	public SEEEOrder findById(int order_id) {
		// TODO Auto-generated method stub
		return super.findById(order_id, tableName);
	}

	public SEEEOrder queryByName(String name) {
		// TODO Auto-generated method stub
		String sql = "select * from " + tableName + " where name = ?";
		return queryForSingle(sql, name);
	}

	public SEEEOrder queryBySO(String SO) {
		// TODO Auto-generated method stub
		String sql = "select * from " + tableName + " where SO = ?";
		return queryForSingle(sql, SO);
	}
}
