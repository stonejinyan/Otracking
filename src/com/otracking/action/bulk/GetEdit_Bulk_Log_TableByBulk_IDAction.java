package com.otracking.action.bulk;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.dao.Edit_Bulk_Log_TableDao;

public class GetEdit_Bulk_Log_TableByBulk_IDAction extends ActionSupport {

	Gson gson = new Gson();
	Edit_Bulk_Log_TableDao edit_Bulk_Log_TableDao = new Edit_Bulk_Log_TableDao();
	private int bulk_id;

	public String execute() throws Exception {

		ActionContext.getContext().put("Json", gson.toJson(edit_Bulk_Log_TableDao.getByBulk_ID(bulk_id)));
		return "success";
	}

	public int getBulk_id() {
		return bulk_id;
	}

	public void setBulk_id(int bulk_id) {
		this.bulk_id = bulk_id;
	}

}
