package com.otracking.dao;

import java.util.Date;
import java.util.List;

import com.otracking.bean.Batch;
import com.otracking.bean.Production_Schedule;
import com.otracking.tool.DateUtil;
import com.otracking.tool.LogUtil;

public class Production_ScheduleDao extends IBaseDao<Production_Schedule> {

	public static final String tableName = "production_schedule";
	public static final int HH = 0;
	public static final int MM = 0;

	public Date getLastScheduleStartTime(int method_process_id, Date date) {
		// TODO Auto-generated method stub
		String sql = "select IFNULL(MAX(schedule_starttime),?) from production_schedule where schedule_starttime >= ? and schedule_starttime <= ? and method_process_id = ?";
		Date defaultStartTime = DateUtil.getStartDate(date, 0, HH, MM);
		return super.queryForDate(sql, defaultStartTime, date, DateUtil.getTomorrowDate(date), method_process_id);
	}

	public boolean save(Production_Schedule production_Schedule) {
		return super.save(production_Schedule, tableName);
	}

	public Production_Schedule findById(int id) {
		// TODO Auto-generated method stub
		return super.findById(id, tableName);
	}

	public int start(int id) {
		if (findById(id).getActual_starttime() == null) {
			String sql = "update " + tableName + "  set actual_starttime = ? , flag = '2' where id = ?";
			LogUtil.RollingFile.info("开始生产id:" + id);
			return super.update(sql, new Date(), id);
		} else {
			LogUtil.RollingFile.info("已开工，未执行id:" + id);
		}
		return 0;
	}

	public void updateFlag(int production_schedule_id, int flag) {
		String sql = "update " + tableName + "  set flag = ? where id = ?";
		super.update(sql, flag, production_schedule_id);

	}

	public int end(int id) {
		if (findById(id).getActual_endtime() == null) {
			String sql = "update " + tableName + "  set actual_endtime = ? , flag = '4' where id = ?";
			LogUtil.RollingFile.info("生产结束id:" + id);
			return super.update(sql, new Date(), id);
		} else {
			LogUtil.RollingFile.info("已结束，未执行id:" + id);
		}
		return 0;
	}

	public int updateNextMethodProcessFlag(int mo_id, int method_Process_id) {

		String sql1 = "select * from production_schedule WHERE	mo_id = ? AND method_process_id = (SELECT method_process_id FROM routing WHERE type_id = (SELECT product_type_id FROM mo WHERE id = ? ) AND sequence = (SELECT sequence FROM routing WHERE type_id = (SELECT product_type_id FROM mo WHERE id = ?) AND method_process_id = ? ) + 1)";
		String sql = "UPDATE production_schedule SET flag = 1 WHERE	mo_id = ? AND method_process_id = (SELECT method_process_id FROM routing WHERE type_id = (SELECT product_type_id FROM mo WHERE id = ? ) AND sequence = (SELECT sequence FROM routing WHERE type_id = (SELECT product_type_id FROM mo WHERE id = ?) AND method_process_id = ? ) + 1)";
		Production_Schedule production_Schedule = super.queryForSingle(sql1, mo_id, mo_id, mo_id, method_Process_id);
		// 无后工序返回0
		if (method_Process_id == 67 || production_Schedule == null) {
			return 0;
		} else if (production_Schedule != null && production_Schedule.getFlag() == 5) {
			// 已调整后工序状态返回1
			return super.update(sql, mo_id, mo_id, mo_id, method_Process_id);
		}
		// 后工序已开始返回2
		return 2;
	}

	public double getOTR(int id) {
		String sql = "select (SELECT TIMESTAMPDIFF(MINUTE,IFNULL(actual_starttime,NOW()),IFNULL(actual_endtime,NOW())) from production_schedule where id = ?)-(select IFNULL(SUM(TIMESTAMPDIFF(MINUTE,IFNULL(interruption_time,NOW()),IFNULL(recover_time,NOW()))),0) from interruption_recover where production_schedule_id = ? and type = 1)";
		return super.queryForCount(sql, id, id);
	}

	public Production_Schedule findByMO_NameAndMethodProcess_id(String mo_name, int method_process_id) {
		String sql = "select * from production_schedule where method_process_id = ? and mo_id = (select id from mo where name = ?)";
		return super.queryForSingle(sql, method_process_id, mo_name);
	}

	public List<Production_Schedule> getProduction_ScheduleByBatchAndMethod_Process_Type(int batch_id,
	        int Method_Process_Type_id) {
		String sql = "SELECT production_schedule.id, production_schedule.flag "
		        + "FROM production_schedule INNER JOIN method_process ON production_schedule.method_process_id = method_process.id INNER JOIN method_process_type ON method_process.method_process_type_id = method_process_type.id INNER JOIN mo ON production_schedule.mo_id = mo.id INNER JOIN batch ON mo.batch_id = batch.id INNER JOIN seeeorder ON batch.order_id = seeeorder.id "
		        + "WHERE method_process_type.id = ? AND batch_id = ?";
		return super.queryForMultiple(sql, Method_Process_Type_id, batch_id);
	}

	public Production_Schedule getProduction_ScheduleByMo_NameAndMethod_Process_Type(String mo_name,
	        int Method_Process_Type_id) {
		String sql = "SELECT production_schedule.id, production_schedule.flag, production_schedule.method_process_id, production_schedule.mo_id "
		        + "FROM production_schedule INNER JOIN method_process ON production_schedule.method_process_id = method_process.id INNER JOIN method_process_type ON method_process.method_process_type_id = method_process_type.id INNER JOIN mo ON production_schedule.mo_id = mo.id "
		        + "WHERE method_process_type.id = ? AND mo.name = ?";
		return super.queryForSingle(sql, Method_Process_Type_id, mo_name);
	}

	public Production_Schedule getProduction_ScheduleByMo_IDAndMethod_Process_Type(int mo_id,
	        int Method_Process_Type_id) {
		String sql = "SELECT\r\n" + "production_schedule.id,\r\n" + "production_schedule.flag,\r\n"
		        + "production_schedule.method_process_id,\r\n" + "production_schedule.mo_id,\r\n"
		        + "production_schedule.schedule_starttime,\r\n" + "production_schedule.schedule_endtime,\r\n"
		        + "production_schedule.actual_starttime,\r\n" + "production_schedule.actual_endtime\r\n" + "FROM\r\n"
		        + "production_schedule\r\n"
		        + "INNER JOIN method_process ON production_schedule.method_process_id = method_process.id\r\n"
		        + "INNER JOIN method_process_type ON method_process.method_process_type_id = method_process_type.id\r\n"
		        + "INNER JOIN mo ON production_schedule.mo_id = mo.id\r\n" + "WHERE\r\n"
		        + "method_process_type.id = ? AND\r\n" + "mo.id = ?";
		return super.queryForSingle(sql, Method_Process_Type_id, mo_id);
	}

	public int updateMethodProcess(int methodprocessID, int id) {
		String sql = "update " + tableName + " set method_process_id = ? where id = ?";
		return super.update(sql, methodprocessID, id);
	}

	public List<Production_Schedule> getProduction_ScheduleByMOAndMethod_Process_Type(int mo_id,
	        int Method_Process_Type_id) {
		String sql = "SELECT production_schedule.id, production_schedule.flag "
		        + "FROM production_schedule INNER JOIN method_process ON production_schedule.method_process_id = method_process.id INNER JOIN method_process_type ON method_process.method_process_type_id = method_process_type.id "
		        + "WHERE method_process_type.id = ? AND mo_id = ?";
		return super.queryForMultiple(sql, Method_Process_Type_id, mo_id);
	}

	public double countOpenMOByBatch(Batch batch) {
		String sql = "select IFNULL(SUM(mo.quantity),0) as quality from mo,batch where batch.id = mo.batch_id and batch_id = ? and mo.actual_endtime is null";
		System.out.println(batch.getId());
		return super.queryForCount(sql, batch.getId());
	}

	public Date getBatchEndTime(Batch batch) {
		String sql = "SELECT max(production_schedule.actual_endtime) FROM production_schedule INNER JOIN mo ON production_schedule.mo_id = mo.id where batch_id = ? and method_process_id = 67";
		return super.queryForDateDirect(sql, batch.getId());
	}

	public double countCloseMOByBatch(Batch batch) {
		String sql = "select IFNULL(SUM(mo.quantity),0) from mo,batch where batch.id = mo.batch_id and batch_id = ? and mo.actual_endtime is not null";
		return super.queryForCount(sql, batch.getId());
	}
}
