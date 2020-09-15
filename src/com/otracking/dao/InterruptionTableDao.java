package com.otracking.dao;

import java.util.List;

import com.otracking.bean.InterruptionTable;

public class InterruptionTableDao extends IBaseDao<InterruptionTable> {

	public static final String tableName = "interruptiontable";

	public List<InterruptionTable> getCurrentInterruption() {
		String sql = "select * from " + tableName + " where type != 100 and recover_time is null";
		return super.queryForMultiple(sql);
	}
}
