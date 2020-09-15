package com.otracking.action.productionexecute;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Interruption_Recover;
import com.otracking.bean.Production_Schedule;
import com.otracking.dao.Interruption_RecoverDao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.tool.LogUtil;

public class SaveInterruptionAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	Interruption_Recover interruption_Recover = new Interruption_Recover();
	Interruption_RecoverDao interruption_RecoverDao = new Interruption_RecoverDao();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();

	public String execute() throws Exception {
		Production_Schedule production_Schedule = production_ScheduleDao
		        .findById(interruption_Recover.getProduction_schedule_id());
		boolean isSave = false;
		if (production_Schedule.getFlag() == 2 && !interruption_Recover.getDescription().equals("")) {
			interruption_Recover.setInterruption_time(new Date());
			isSave = interruption_RecoverDao.save(interruption_Recover);
		}
		if (isSave) {
			production_ScheduleDao.updateFlag(interruption_Recover.getProduction_schedule_id(), 3);
		}
		LogUtil.RollingFile.info(interruption_Recover);
		production_Schedule = production_ScheduleDao.findById(interruption_Recover.getProduction_schedule_id());
		ActionContext.getContext().put("Json", gson.toJson(production_Schedule));
		return "success";
	}

	public Interruption_Recover getInterruption_Recover() {
		return interruption_Recover;
	}

	public void setInterruption_Recover(Interruption_Recover interruption_Recover) {
		this.interruption_Recover = interruption_Recover;
	}

}
