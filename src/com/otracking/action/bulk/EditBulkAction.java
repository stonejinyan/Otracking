package com.otracking.action.bulk;

import java.util.Date;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Edit_Bulk_Log;
import com.otracking.bean.Staff;
import com.otracking.dao.BulkDao;
import com.otracking.dao.Edit_Bulk_LogDao;

public class EditBulkAction extends ActionSupport {

	private int id;
	private String fieldName;
	private String oldValue;
	private String newValue;
	BulkDao bulkDao = new BulkDao();
	Edit_Bulk_LogDao edit_Bulk_LogDao = new Edit_Bulk_LogDao();
	Staff staff = (Staff) ActionContext.getContext().getSession().get("staff");
	Gson gson = new Gson();

	public String execute() throws Exception {
		String sql = "set " + fieldName + " = ? where id = ?";
		int status = bulkDao.update(id, fieldName, newValue);
		String field_Name = "";
		switch (fieldName) {
		case "smallest_unit":
			field_Name = "最小包装单位";
			break;
		case "smallest_unit_quantity":
			field_Name = "最小包装单位代表数量";
			break;
		case "delivery_unit":
			field_Name = "最小送货单位";
			break;
		case "delivery_quantity":
			field_Name = "最小送货单位代表数量";
			break;
		default:
			System.err.println("default");
			field_Name = fieldName;
			break;
		}
		edit_Bulk_LogDao.save(new Edit_Bulk_Log(0, staff.getId(), field_Name, newValue, id, new Date()));
		ActionContext.getContext().put("Json", gson.toJson(status));
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

}
