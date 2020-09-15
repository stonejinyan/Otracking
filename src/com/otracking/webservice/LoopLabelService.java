package com.otracking.webservice;

import com.otracking.dao.MODao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.dao.RoutingDao;
import com.otracking.tool.LogUtil;

public class LoopLabelService {

	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	RoutingDao routingDao = new RoutingDao();
	MODao moDao = new MODao();

	public LoopLabelService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int importBom(String mo_name, String authentication) throws InterruptedException {
		LogUtil.RollingFile.info(mo_name);
		/*
		 * Production_Schedule production_Schedule = production_ScheduleDao
		 * .getProduction_ScheduleByMo_NameAndMethod_Process_Type(mo_name, 5); int
		 * isUpdate = production_ScheduleDao.end(production_Schedule.getId()); Routing
		 * routing = routingDao.getRouting(production_Schedule.getMethod_process_id(),
		 * moDao.findById(production_Schedule.getMo_id()).getProduct_type_id()); if
		 * (isUpdate == 1 && routing.getSequence() > 0) { int isUpdateNext =
		 * production_ScheduleDao.updateNextMethodProcessFlag(production_Schedule.
		 * getMo_id(), production_Schedule.getMethod_process_id()); if (isUpdateNext ==
		 * 0) { moDao.end(production_Schedule.getMo_id()); } return 1; }
		 */
		return 1;
	}
}