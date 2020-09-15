package com.otracking.dao;

import java.util.List;

import com.otracking.bean.DatabaseMaterial;
import com.otracking.bean.MO;

public class DatabaseMaterialDao extends IBaseDao<DatabaseMaterial> {

	public static final String tableName = "material";

	public boolean save(DatabaseMaterial databaseMaterial) {
		return super.save(databaseMaterial, tableName);
	}

	public double countByMO_id(int mo_id) {
		String sql = "select count(*) from " + tableName + " where active = 1 and mo_id = ?";
		return super.queryForCount(sql, mo_id);
	}

	public List<DatabaseMaterial> queryByMO_id(int mo_id) {
		String sql = "select * from " + tableName + " where active = 1 and mo_id = ?";
		return super.queryForMultiple(sql, mo_id);
	}

	public int updateActiveByMO_id(MO mo) {
		// TODO Auto-generated method stub
		String sql = "update " + tableName + " set active = 0 where mo_id = ?";
		return update(sql, mo.getId());
	}
}
