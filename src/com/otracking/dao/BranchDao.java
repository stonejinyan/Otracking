package com.otracking.dao;

import com.otracking.bean.Batch;

public class BranchDao extends IBaseDao<Batch> {

	public static final String tableName = "branch";

	public boolean save(Batch entity) {
		return super.save(entity, tableName);
	}

	public Batch findById(int id) {
		return super.findById(id, tableName);
	}
}
