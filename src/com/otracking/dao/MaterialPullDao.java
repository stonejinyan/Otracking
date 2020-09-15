package com.otracking.dao;

import java.util.Date;

import com.otracking.bean.MaterialPull;

public class MaterialPullDao extends IBaseDao<MaterialPull> {

	public static final String tableName = "materialpull";

	public boolean save(MaterialPull materialPull) {
		// TODO Auto-generated method stub
		return super.save(materialPull, tableName);
	}

	public int updateFlag(int id, int method_type_id, int flag, int staff_id) {
		String sql = "update " + tableName
		        + " set flag = ?,pull_time = ?,staff_id = ? where id = ? and method_type_id = ? and flag <> ?";
		return super.update(sql, flag, new Date(), staff_id, id, method_type_id, flag);
	}
}
