package com.otracking.dao;

import java.util.List;

import com.otracking.bean.RestTime;

public class RestTimeDao extends IBaseDao<RestTime> {

	public static final String tableName = "resttime";

	public boolean save(RestTime restTime) {
		return super.save(restTime, tableName);
	}

	public List<RestTime> getAll() {
		// TODO Auto-generated method stub
		return super.getAll(tableName, "starttime");
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}
}
