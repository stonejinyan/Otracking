package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Method_Process;

public class Method_ProcessDao extends IBaseDao<Method_Process> {

	public static final String tableName = "method_process";

	public boolean save(Method_Process method_Process) {
		// TODO Auto-generated method stub
		return super.save(method_Process, tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}

	public List<Method_Process> getAll() {
		return super.getAll(tableName);
	}

	public List<Method_Process> getMethod_ProcessByProcessLine_id(int process_line_id) {
		// TODO Auto-generated method stub
		return super.findByForeignId(process_line_id, tableName, "processline_id");
	}

	public Method_Process findById(int id) {
		// TODO Auto-generated method stub
		return super.findById(id, tableName);
	}

	public Method_Process getByProcessLineIDAndType(String processlineID, int typeID) {
		// TODO Auto-generated method stub
		String sql = "select * from " + tableName + " where processline_id = ? and method_process_type_id = ?";
		return super.queryForSingle(sql, processlineID, typeID);
	}

}
