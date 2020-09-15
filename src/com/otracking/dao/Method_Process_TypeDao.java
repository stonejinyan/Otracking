package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Method_Process_Type;

public class Method_Process_TypeDao extends IBaseDao<Method_Process_Type> {

	public static final String tableName = "method_process_type";

	public List<Method_Process_Type> getAll() {
		return super.getAll(tableName);
	}
}
