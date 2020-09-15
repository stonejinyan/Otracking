package com.otracking.dao;

import com.otracking.bean.BatchLevel;

public class BatchLevelDao extends IBaseDao<BatchLevel> {

	public static final String tableName = "batchlevel";

	public BatchLevel findById(int id) {
		return super.findById(id, tableName);
	}
}
