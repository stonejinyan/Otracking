package com.otracking.dao;

import java.util.List;

import com.otracking.bean.R_Method_Process_SAP_Method_Process;

public class R_Method_Process_SAP_Method_ProcessDao extends IBaseDao<R_Method_Process_SAP_Method_Process> {

	public static final String tableName = "r_method_process_sap_method_process";

	public List<R_Method_Process_SAP_Method_Process> findByMethod_ProcessID(int method_process_id) {
		String sql = "select * from " + tableName + " where method_process_id = ? and available = 1";
		return super.queryForMultiple(sql, method_process_id);
	}
}
