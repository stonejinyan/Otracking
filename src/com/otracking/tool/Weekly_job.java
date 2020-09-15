package com.otracking.tool;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.otracking.dao.OutputDao;

public class Weekly_job implements Job {
	OutputDao outputDao = new OutputDao();

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		LogUtil.RollingFile.info("Otracking-Quartz-Job-Execute:Weekly定时器：" + new Date());
	}
}