package com.otracking.dao;

import java.io.Serializable;
import java.util.List;

import com.otracking.bean.Interruption_Recover_Table;

public class Interruption_Recover_TableDao extends IBaseDao<Interruption_Recover_Table> {

	public static final String tableName = "interruption_recover_table";

	@Override
	public <T> List<T> findByForeignId(Serializable id, String columName, String orderColum) {
		// TODO Auto-generated method stub
		return super.findByForeignId(id, tableName, columName, orderColum);
	}
}
