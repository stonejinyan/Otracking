package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Interruption_Recover_Type;

public class Interruption_Recover_TypeDao extends IBaseDao<Interruption_Recover_Type> {

	public static final String tableName = "interruption_recover_type";

	public List<Interruption_Recover_Type> getAll() {
		return super.getAll(tableName);
	}
}
