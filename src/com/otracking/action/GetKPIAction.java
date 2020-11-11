package com.otracking.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.KPI;
import com.otracking.dao.OutputDao;
import com.otracking.dao.WIPDao;

public class GetKPIAction extends ActionSupport {

	private int familyID;
	WIPDao wipDao = new WIPDao();
	OutputDao outputDao = new OutputDao();

	@Override
	public String execute() throws Exception {
		Gson gson = new Gson();
		KPI kpi = new KPI();
		kpi.setTarget((int) outputDao.getTarget(familyID));
		kpi.setFinishGoods((int) outputDao.getMFG(familyID));
		kpi.setWip((int) wipDao.getWIPTotal(familyID));
		kpi.setAbnormal((int) wipDao.getAbnormalTotal(familyID));
		ActionContext.getContext().put("Json", gson.toJson(kpi));
		return "success";
	}

	public int getFamilyID() {
		return familyID;
	}

	public void setFamilyID(int familyID) {
		this.familyID = familyID;
	}

}
