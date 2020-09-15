package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Method_Process;
import com.otracking.bean.Method_Process_Table;

public class Method_ProcessTableDao extends IBaseDao<Method_Process_Table> {

	public static final String tableName = "method_process_table";

	public List<Method_Process> getAll() {
		return super.getAll(tableName);
	}
}
