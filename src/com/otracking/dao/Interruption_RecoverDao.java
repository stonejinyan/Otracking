package com.otracking.dao;

import java.util.Date;

import com.otracking.bean.Interruption_Recover;

public class Interruption_RecoverDao extends IBaseDao<Interruption_Recover> {

	public static final String tableName = "interruption_recover";

	public boolean save(Interruption_Recover interruption_Recover) {
		return super.save(interruption_Recover, tableName);
	}

	public Interruption_Recover getCurrent(int production_schedule_id) {
		// TODO Auto-generated method stub
		String sql = "select * from " + tableName + " where production_schedule_id = ? and recover_time is null";
		return super.queryForSingle(sql, production_schedule_id);
	}

	public int update(int id) {
		// TODO Auto-generated method stub
		String sql = "update " + tableName + " set recover_time = ? where id = ?";
		return super.update(sql, new Date(), id);
	}

	public int updateOpening(int mo_id) {
		// TODO Auto-generated method stub
		String sql = "update interruption_recover,production_schedule set recover_time = ? where interruption_recover.production_schedule_id = production_schedule.id and production_schedule.method_process_id = 67 and mo_id = ?";
		return super.update(sql, new Date(), mo_id);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}
}
