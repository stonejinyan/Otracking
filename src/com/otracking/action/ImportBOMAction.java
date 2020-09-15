package com.otracking.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.StatusCode;
import com.otracking.tool.LogUtil;

public class ImportBOMAction extends ActionSupport {

	private String JSON;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		LogUtil.RollingFile.info(JSON + "Bom导入成功");
		ActionContext.getContext().put("Json", gson.toJson(new StatusCode("success!")));
		return "success";
	}

	public String getJSON() {
		return JSON;
	}

	public void setJSON(String jSON) {
		JSON = jSON;
	}

}
