package com.otracking.dao;

import java.util.Date;
import java.util.List;

import com.otracking.bean.MO;
import com.otracking.tool.DateUtil;
import com.otracking.tool.LogUtil;

public class MODao extends IBaseDao<MO> {

	public static final String tableName = "mo";

	public boolean save(MO mo) {
		return super.save(mo, tableName);
	}

	public List<MO> getAll() {
		// TODO Auto-generated method stub
		return super.getAll(tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}

	public List<MO> getTodaySchedule() {
		// TODO Auto-generated method stub
		String sql = "select * from " + tableName
		        + " where schedule_starttime <= ? and actual_starttime is null and scheduling = 0";
		return super.queryForMultiple(sql, DateUtil.getNowDateShort());
	}

	public List<MO> getTomorrowSchedule() {
		// TODO Auto-generated method stub
		String sql = "select * from " + tableName
		        + " where schedule_starttime <= ? and actual_starttime is null and ekitting = 0";
		return super.queryForMultiple(sql, DateUtil.getTomorrowDateShort());
	}

	public MO findById(int mo_id) {
		// TODO Auto-generated method stub
		return super.findById(mo_id, tableName);
	}

	public int updatePackageTime(String name) {
		// TODO Auto-generated method stub
		String sql = "update " + tableName + " set package_time = now() where name = ?";
		return super.update(sql, name);
	}

	public int updateDeliveryTime(String name) {
		// TODO Auto-generated method stub
		String sql = "update " + tableName + " set delivery_time = now() where dms_id = ?";
		return super.update(sql, name);
	}

	public int updateScheduling(MO mo) {
		// TODO Auto-generated method stub
		String sql = "update " + tableName + " set scheduling = 1 where id = ?";
		return super.update(sql, mo.getId());
	}

	public int updateEKitting(MO mo) {
		// TODO Auto-generated method stub
		String sql = "update " + tableName + " set ekitting = 1 where id = ?";
		return super.update(sql, mo.getId());
	}

	public MO getfindById(int id) {
		// TODO Auto-generated method stub
		return super.findById(id, tableName);
	}

	public int start(int id) {
		if (findById(id).getActual_starttime() == null) {
			String sql = "update " + tableName + "  set actual_starttime = ? where id = ?";
			LogUtil.RollingFile.info("开始生产mo_id:" + id);
			return super.update(sql, new Date(), id);
		} else {
			LogUtil.RollingFile.info("已开工，未执行mo_id:" + id);
		}
		return 0;
	}

	public int end(int id) {
		if (findById(id).getActual_endtime() == null) {
			String sql = "update " + tableName + "  set actual_endtime = ? where id = ?";
			LogUtil.RollingFile.info("生产结束mo_id:" + id);
			return super.update(sql, new Date(), id);
		} else {
			LogUtil.RollingFile.info("已结束，未执行mo_id:" + id);
		}
		return 0;
	}

	public int insertSecurityCode(String mo_name, String securityCode) {
		// TODO Auto-generated method stub
		String sql = "update " + tableName + "  set securityCode = ?,actual_endtime = ? where name = ?";
		LogUtil.RollingFile.info(mo_name + "插入防伪码：" + securityCode);
		return super.update(sql, securityCode, new Date(), mo_name);
	}

	public MO findByName(String name) {
		String sql = "select * from " + tableName + " where name = ?";
		return super.queryForSingle(sql, name);
	}

	public int saveOrUpdate(MO mo) {
		// TODO Auto-generated method stub
		MO databaseMO = findByName(mo.getName());
		if (databaseMO == null) {
			if (save(mo)) {
				return 1;
			}
		} else if (databaseMO.getScheduling() == 0) {
			mo.setId(databaseMO.getId());
			mo.setScheduling(databaseMO.getScheduling());
			mo.setScheduling(databaseMO.getEkitting());
			mo.setSecurityCode(databaseMO.getSecurityCode());
			if (super.update(mo, tableName, new String[] {}) == 1) {
				return 2;
			}
		}
		return 0;
	}

	public Date getBatchDeliveryDate(int batch_id) {
		String sql = "select MAX(schedule_endtime) from mo where batch_id = ?";
		return super.queryForDateDirect(sql, batch_id);
	}

	public int getProductClassify(int id) {
		String sql = "SELECT\r\n" + "product_model.product_classify_id\r\n" + "FROM\r\n" + "mo\r\n"
		        + "INNER JOIN product_type ON mo.product_type_id = product_type.id\r\n"
		        + "INNER JOIN product_model ON product_type.bigtype_id = product_model.id\r\n" + "where mo.id = ?";
		return (int) super.queryForCount(sql, id);
	}

	public int getProductModel(int id) {
		String sql = "SELECT\r\n" + "product_type.bigtype_id\r\n" + "FROM\r\n" + "mo\r\n"
		        + "INNER JOIN product_type ON mo.product_type_id = product_type.id\r\n" + "where mo.id = ?";
		return (int) super.queryForCount(sql, id);
	}
}
