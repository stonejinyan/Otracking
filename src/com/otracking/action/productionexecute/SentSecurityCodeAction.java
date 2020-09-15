package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Interruption_RecoverDao;
import com.otracking.dao.MODao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.tool.LogUtil;

public class SentSecurityCodeAction extends ActionSupport {
	private String mo_name;
	private String securityCode;
	MODao moDao = new MODao();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	Interruption_RecoverDao interruption_RecoverDao = new Interruption_RecoverDao();

	@Override
	public String execute() throws Exception {
		int is = moDao.insertSecurityCode(mo_name, securityCode);
		if (is == 1) {
			production_ScheduleDao.end(production_ScheduleDao.findByMO_NameAndMethodProcess_id(mo_name, 66).getId());
			production_ScheduleDao.end(production_ScheduleDao.findByMO_NameAndMethodProcess_id(mo_name, 67).getId());
			int iq = interruption_RecoverDao.updateOpening(moDao.findByName(mo_name).getId());
			LogUtil.RollingFile.info(mo_name + "挂单自动关闭异常：" + iq);
		}
		ActionContext.getContext().put("Json", gson.toJson(is));
		return "success";
	}

	public String getMo_name() {
		return mo_name;
	}

	public void setMo_name(String mo_name) {
		this.mo_name = mo_name;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

}
