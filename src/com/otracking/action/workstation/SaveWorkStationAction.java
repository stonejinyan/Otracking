package com.otracking.action.workstation;

import org.apache.logging.log4j.LogManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.WorkStation;
import com.otracking.dao.WorkStationDao;

public class SaveWorkStationAction extends ActionSupport {
	private String name;
	private int methodprocess_id;
	private String workstation_id;
	WorkStationDao workStationDao = new WorkStationDao();

	public String execute() throws Exception {
		if (workstation_id != null && workstation_id != "" && !workstation_id.equals("") && name != null && name != ""
		        && !name.equals("") && methodprocess_id > 0) {
			WorkStation workStation = new WorkStation();
			workStation.setName(name);
			workStation.setMethod_process_id(methodprocess_id);
			workStation.setWorkstation_id(workstation_id);
			workStationDao.save(workStation);
			LogManager.getLogger()
			        .info(ActionContext.getContext().getSession().get("staff") + " 新增一个工艺过程 ：" + workStation);
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

	public int getMethodprocess_id() {
		return methodprocess_id;
	}

	public void setMethodprocess_id(int methodprocess_id) {
		this.methodprocess_id = methodprocess_id;
	}

	public String getWorkstation_id() {
		return workstation_id;
	}

	public void setWorkstation_id(String workstation_id) {
		this.workstation_id = workstation_id;
	}

}
