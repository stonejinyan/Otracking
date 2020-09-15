package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Interruption_Recover_Department;
import com.otracking.bean.Interruption_Recover_Type;

public class Interruption_Recover_DepartmentDao extends IBaseDao<Interruption_Recover_Department> {

	public static final String tableName = "interruption_recover_department";

	public List<Interruption_Recover_Type> getAll() {
		return super.getAll(tableName);
	}
}
