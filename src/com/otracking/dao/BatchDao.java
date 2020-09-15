package com.otracking.dao;

import java.util.Date;
import java.util.List;

import com.otracking.bean.Batch;
import com.otracking.tool.LogUtil;

public class BatchDao extends IBaseDao<Batch> {

	public static final String tableName = "batch";

	public boolean save(Batch batch) {
		return super.save(batch, tableName);
	}

	public List<Batch> getAll() {
		// TODO Auto-generated method stub
		return super.getAll(tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}

	public List<Batch> getCurrentBatch() {
		String sql = "select * from " + tableName + " where actual_starttime is not null and actual_endtime is null";
		return super.queryForMultiple(sql);
	}

	public int start(int id) {
		if (findById(id).getActual_starttime() == null) {
			String sql = "update " + tableName + "  set actual_starttime = ? where id = ?";
			LogUtil.RollingFile.info("开始生产Batch_id:" + id);
			return super.update(sql, new Date(), id);
		} else {
			LogUtil.RollingFile.info("已开工，未执行Batch_id:" + id);
		}
		return 0;
	}

	public Batch findById(int id) {
		// TODO Auto-generated method stub
		return super.findById(id, tableName);
	}

	public Batch queryByname(String batchName, int orderID) {
		// TODO Auto-generated method stub
		String sql = "select * from " + tableName + " where name = ? and order_id = ?";
		return super.queryForSingle(sql, batchName, orderID);
	}

	public Batch queryByname(String batchName) {
		// TODO Auto-generated method stub
		String sql = "select * from " + tableName + " where name = ?";
		return super.queryForSingle(sql, batchName);
	}

	public int updateEndTime(Batch batch, Date batchEndTime) {
		// TODO Auto-generated method stub
		String sql = "update " + tableName + " set actual_endtime = ? where id = ?";
		return super.update(sql, batchEndTime, batch.getId());
	}

	public int saveOrUpdate(Batch batch) {
		// TODO Auto-generated method stub
		Batch databaseBatch = queryByname(batch.getName());
		if (databaseBatch == null) {
			if (save(batch)) {
				return 1;
			}
		} else {
			batch.setId(databaseBatch.getId());
			if (super.update(batch, tableName,
			        new String[] { "actual_starttime", "actual_endtime", "fattime", "comments" }) == 1) {
				return 2;
			}
		}
		return 0;
	}

}
