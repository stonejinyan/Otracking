package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Edit_Bulk_Log_Table;

public class Edit_Bulk_Log_TableDao extends IBaseDao<Edit_Bulk_Log_Table> {
	public static final String tableName = "edit_bulk_log_table";

	public List<Edit_Bulk_Log_Table> getByBulk_ID(int bulk_id) {
		String sql = "select * from " + tableName + " where bulk_id = ? order by created_time desc";
		return super.queryForMultiple(sql, bulk_id);
	}
}
