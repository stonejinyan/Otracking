package com.otracking.action.productionexecute;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.EasergyPositionDao;
import com.otracking.tool.LogUtil;

public class SentEasergyCodeAction extends ActionSupport {
	private String aop;
	private String easergyCode;
	private String position;
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	EasergyPositionDao EasergyPositionDao = new EasergyPositionDao();

	@Override
	public String execute() throws Exception {
		LogUtil.RollingFile.info("insert:" + aop + "?" + easergyCode);
		int is = EasergyPositionDao.insertSecurityCode(aop, position, easergyCode);
		ActionContext.getContext().put("Json", gson.toJson(is));
		return "success";
	}

	public String getAop() {
		return aop;
	}

	public void setAop(String aop) {
		this.aop = aop;
	}

	public String getEasergyCode() {
		return easergyCode;
	}

	public void setEasergyCode(String easergyCode) {
		this.easergyCode = easergyCode;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
