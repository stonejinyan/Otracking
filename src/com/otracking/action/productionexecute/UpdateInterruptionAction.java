package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Interruption_Recover;
import com.otracking.bean.Production_Schedule;
import com.otracking.dao.Interruption_RecoverDao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.tool.LogUtil;

public class UpdateInterruptionAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int id;
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	Interruption_RecoverDao interruption_RecoverDao = new Interruption_RecoverDao();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();

	public String execute() throws Exception {
		Production_Schedule production_Schedule = production_ScheduleDao.findById(id);
		Interruption_Recover interruption_Recover = interruption_RecoverDao.getCurrent(id);
		if (production_Schedule.getFlag() == 3 && interruption_Recover != null) {
			int isUpdate = interruption_RecoverDao.update(interruption_Recover.getId());
			if (isUpdate == 1) {
				production_ScheduleDao.updateFlag(interruption_Recover.getProduction_schedule_id(), 2);
				LogUtil.RollingFile.info("恢复生产：" + interruption_Recover);
			}
		}
		production_Schedule = production_ScheduleDao.findById(interruption_Recover.getProduction_schedule_id());
		ActionContext.getContext().put("Json", gson.toJson(production_Schedule));
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
