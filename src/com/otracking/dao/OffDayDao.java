package com.otracking.dao;

import java.util.List;

import com.otracking.bean.OffDay;

public class OffDayDao extends IBaseDao<OffDay> {

	public static final String tableName = "offday";

	public boolean save(OffDay offDay) {
		return super.save(offDay, tableName);
	}

	public List<OffDay> getAll() {
		// TODO Auto-generated method stub
		return super.getAll(tableName, "starttime");
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}
}
