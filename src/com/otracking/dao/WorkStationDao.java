package com.otracking.dao;

import java.util.List;

import com.otracking.bean.WorkStation;

public class WorkStationDao extends IBaseDao<WorkStation> {

	public static final String tableName = "workstation";

	public boolean save(WorkStation workStation) {
		// TODO Auto-generated method stub
		return super.save(workStation, tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}

	public List<WorkStation> getAll() {
		return super.getAll(tableName);
	}
}
