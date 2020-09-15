package com.otracking.dao;

import com.otracking.bean.MaterialPullList;

public class MaterialPullListDao extends IBaseDao<MaterialPullList> {

	public static final String tableName = "materialpulllist";

	public MaterialPullList findByNameAndMethod_Process_ID(String name, int Method_Process_ID) {
		String sql = "select * from " + tableName + " where name = ? and method_process_id = ?";
		return super.queryForSingle(sql, name, Method_Process_ID);
	}
}
