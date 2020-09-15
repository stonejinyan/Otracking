package com.otracking.service;

import com.otracking.bean.Production_Schedule;
import com.otracking.bean.Routing;
import com.otracking.dao.MODao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.dao.RoutingDao;

public class Production_ScheduleService {

	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	MODao moDao = new MODao();
	RoutingDao routingDao = new RoutingDao();

	public void endProduction_Schedule(int id) {
		Production_Schedule production_Schedule = production_ScheduleDao.findById(id);
		if (production_Schedule.getFlag() == 2) {
			int isUpdate = production_ScheduleDao.end(id);
			Routing routing = routingDao.getRouting(production_Schedule.getMethod_process_id(),
			        moDao.findById(production_Schedule.getMo_id()).getProduct_type_id());
			if (isUpdate == 1 && routing.getSequence() > 0) {
				System.out.println(2);
				int isUpdateNext = production_ScheduleDao.updateNextMethodProcessFlag(production_Schedule.getMo_id(),
				        production_Schedule.getMethod_process_id());
				if (isUpdateNext == 0) {
					moDao.end(production_Schedule.getMo_id());
				}
			}
		}
	}

}
