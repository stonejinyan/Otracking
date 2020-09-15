package com.otracking.dao;

import java.util.List;

import com.otracking.bean.ProcessLine;
import com.otracking.bean.WorkStationTable;

public class WorkStationTableDao extends IBaseDao<WorkStationTable> {

	public static final String tableName = "workstationtable";

	public List<ProcessLine> getAll() {
		return super.getAll(tableName);
	}
}
