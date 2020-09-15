package com.otracking.dao;

import java.util.List;

import com.otracking.bean.ProcessLine;

public class ProcessLineDao extends IBaseDao<ProcessLine> {

	public static final String tableName = "processline";

	public List<ProcessLine> getAll() {
		return super.getAll(tableName);
	}

	public boolean save(ProcessLine processLine) {
		return super.save(processLine, tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}

	public ProcessLine findById(int process_line_id) {
		// TODO Auto-generated method stub
		return super.findById(process_line_id, tableName);
	}
}
