package com.otracking.dao;

import java.util.List;

import com.otracking.bean.EasergyPosition;

public class EasergyPositionDao extends IBaseDao<EasergyPosition> {

	public static final String tableName = "easergy";

	public List<EasergyPosition> getNoEasergy_idList(EasergyPosition easergyPosition) {
		// TODO Auto-generated method stub
		String sql = "select * from easergy where so_item = ? and easergy_id is null";
		return super.queryForMultiple(sql, easergyPosition.getSo_item());
	}

	public int insertSecurityCode(String aop, String position, String easergyCode) {
		String sql = "update easergy set easergy_id = ? where aop = ? and assembly_position = ?";

		return super.update(sql, easergyCode, aop, position);
	}

	public List<EasergyPosition> getAll() {
		return super.getAll(tableName);
	}

}
