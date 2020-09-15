package com.otracking.service;

import java.util.List;

import com.otracking.bean.Batch;
import com.otracking.dao.BatchDao;
import com.otracking.dao.Production_ScheduleDao;

public class BatchEndTimeUpdate {

	BatchDao batchDao = new BatchDao();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();

	public String update() {
		int update = 0;
		List<Batch> batchs = batchDao.getCurrentBatch();
		for (int i = 0; i < batchs.size(); i++) {
			double openCount = production_ScheduleDao.countOpenMOByBatch(batchs.get(i));
			double closeCount = production_ScheduleDao.countCloseMOByBatch(batchs.get(i));
			System.out.println(batchs.get(i).getId() + ":" + openCount);
			System.out.println(batchs.get(i).getId() + ":" + closeCount + "--" + batchs.get(i).getQuantity());
			if (openCount == 0 && closeCount == batchs.get(i).getQuantity() && batchs.get(i).getQuantity() != 0) {
				batchDao.updateEndTime(batchs.get(i), production_ScheduleDao.getBatchEndTime(batchs.get(i)));
				update++;
			}
		}
		return "更新Batch：" + update + "个，共有OpenBatch：" + batchs.size() + "个。";
	}
}
