package com.otracking.tool;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.otracking.service.BatchEndTimeUpdate;
import com.otracking.service.EKittingService;
import com.otracking.service.productionexecute.ProductionExecute;

public class Daily_job implements Job {
	ProductionExecute productionExecuteService = new ProductionExecute();
	BatchEndTimeUpdate batchEndTimeUpdate = new BatchEndTimeUpdate();
	// OutputDao outputDao = new OutputDao();
	EKittingService eKittingService = new EKittingService();

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		LogUtil.RollingFile.info("Otracking-Quartz-Job-Execute:Daily定时器：" + new Date());
		LogUtil.RollingFile.info(new Date() + "  " + productionExecuteService.setMOPlan());
		LogUtil.RollingFile.info(batchEndTimeUpdate.update());
		LogUtil.RollingFile.info("E-Kitting定时器执行：" + eKittingService.setPullPlan());
	}
}