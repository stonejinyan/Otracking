package com.otracking.dao;

import com.otracking.bean.Edit_Bulk_Log;

public class Edit_Bulk_LogDao extends IBaseDao<Edit_Bulk_Log> {
	public static final String tableName = "edit_bulk_log";

	public boolean save(Edit_Bulk_Log edit_Bulk_Log) {
		return super.save(edit_Bulk_Log, tableName);
	}

}
