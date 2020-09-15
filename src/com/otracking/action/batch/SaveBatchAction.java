package com.otracking.action.batch;

import org.apache.logging.log4j.LogManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Batch;
import com.otracking.dao.BatchDao;
import com.otracking.tool.DateUtil;

public class SaveBatchAction extends ActionSupport {
	Batch batch = new Batch();
	BatchDao batchDao = new BatchDao();

	public String execute() throws Exception {
		if (batch.getSchedule_starttime() == null) {
			batch.setSchedule_starttime(DateUtil.getNowDateShort());
		}
		if (batch.getSchedule_starttime() != null && batch.getName() != null && batch.getName() != ""
		        && !batch.getName().equals("")) {
			batchDao.save(batch);
			LogManager.getLogger().info(ActionContext.getContext().getSession().get("staff") + " 新增一个batch ：" + batch);
		}
		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

}
