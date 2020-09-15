package com.otracking.dao;

import java.util.List;

import com.otracking.bean.KeyComponents;

public class KeyComponentsDao extends IBaseDao<KeyComponents> {

	public static final String tableName = "key_components";

	public List<KeyComponents> getAll() {
		return super.getAll(tableName);
	}

	public boolean save(KeyComponents keyComponents) {
		return super.save(keyComponents, tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}
}
