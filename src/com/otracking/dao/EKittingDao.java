package com.otracking.dao;

import java.util.Date;
import java.util.List;

import com.otracking.bean.EKitting;

public class EKittingDao extends IBaseDao<EKitting> {

	public static final String tableName = "ekittinglist";

	public int[] saveBatch(List<EKitting> eKittings) {
		return super.saveBatch(eKittings, tableName);
	}

	public int updateEKittingList(int id, int staff_id, int flag) {
		String sql = "update " + tableName + " set pull_time = ?,staff_id = ?,flag = ? where id = ?";
		return super.update(sql, new Date(), staff_id, flag, id);
	}
}
