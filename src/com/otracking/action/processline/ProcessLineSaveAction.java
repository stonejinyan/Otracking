package com.otracking.action.processline;

import org.apache.logging.log4j.LogManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.ProcessLine;
import com.otracking.dao.ProcessLineDao;

public class ProcessLineSaveAction extends ActionSupport {
	private String name;
	ProcessLineDao processLineDao = new ProcessLineDao();

	public String execute() throws Exception {
		if (name != null && name != "" && !name.equals("")) {
			ProcessLine processLine = new ProcessLine();
			processLine.setName(name);
			processLineDao.save(processLine);
			LogManager.getLogger()
			        .info(ActionContext.getContext().getSession().get("staff") + " 新增一条产线 ：" + processLine);
		}
		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
