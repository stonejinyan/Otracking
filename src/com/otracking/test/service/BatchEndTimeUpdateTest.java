package com.otracking.test.service;

import org.junit.Test;

import com.otracking.dao.Production_ScheduleDao;
import com.otracking.service.BatchEndTimeUpdate;
import com.otracking.tool.LogUtil;

public class BatchEndTimeUpdateTest {

	BatchEndTimeUpdate batchEndTimeUpdate = new BatchEndTimeUpdate();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();

	@Test
	public void testUpdate() {
		LogUtil.RollingFile.info(batchEndTimeUpdate.update());
	}

}
