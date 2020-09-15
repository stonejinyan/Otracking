package com.otracking.action.mo;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Method_Process;
import com.otracking.bean.Product_Type;
import com.otracking.bean.Staff;
import com.otracking.dao.MODao;
import com.otracking.dao.Method_ProcessDao;
import com.otracking.dao.Product_TypeDao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.tool.LogUtil;

public class EditMOAction extends ActionSupport {

	private int id;
	private String fieldName;
	private String oldValue;
	private String newValue;
	MODao moDao = new MODao();
	Product_TypeDao product_TypeDao = new Product_TypeDao();
	Method_ProcessDao method_ProcessDao = new Method_ProcessDao();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	Gson gson = new Gson();

	public String execute() throws Exception {
		Staff staff = (Staff) ActionContext.getContext().getSession().get("staff");

		if (fieldName.equals("processline_id")) {
			// 目前只支持OKKEN Blokset 产线修改
			int product_classify = moDao.getProductClassify(id);
			LogUtil.RollingFile.info(staff.getName() + "产线修改(MO_id:" + id + " oldProcess_id:" + oldValue
			        + " newProcess_id:" + newValue + " product_classify:" + product_classify);
			if ((product_classify == 1 || product_classify == 2)
			        && (newValue.equals("1") || newValue.equals("2") || newValue.equals("3") || newValue.equals("4")
			                || newValue.equals("5") || newValue.equals("6") || newValue.equals("16"))) {
				// change MO Type
				int product_model = moDao.getProductModel(id);
				LogUtil.RollingFile.info(staff.getName() + "产线修改(MO_id:" + id + " oldproduct_model:" + product_model);
				Product_Type product_Type = product_TypeDao.query(Integer.parseInt(newValue), product_model);
				LogUtil.RollingFile
				        .info(staff.getName() + "产线修改(MO_id:" + id + " newproduct_Type:" + product_Type.getId());
				String sql = "set product_type_id = ? where id = ?";
				int status = moDao.update(sql, id, product_Type.getId() + "");
				LogUtil.RollingFile.info(staff.getName() + "产线修改(MO_id:" + id + " ProcessChange" + status);
				// change Method_Process ID
				Method_Process method_Process = method_ProcessDao.getByProcessLineIDAndType(newValue, 3);
				production_ScheduleDao.updateMethodProcess(method_Process.getId(),
				        production_ScheduleDao.getProduction_ScheduleByMo_IDAndMethod_Process_Type(id, 3).getId());
				LogUtil.RollingFile.info(staff.getName() + "计划修改(id:"
				        + production_ScheduleDao.getProduction_ScheduleByMo_IDAndMethod_Process_Type(id, 3).getId()
				        + " Method_Process" + method_Process.getId());
				method_Process = method_ProcessDao.getByProcessLineIDAndType(newValue, 5);
				production_ScheduleDao.updateMethodProcess(method_Process.getId(),
				        production_ScheduleDao.getProduction_ScheduleByMo_IDAndMethod_Process_Type(id, 5).getId());
				LogUtil.RollingFile.info(staff.getName() + "计划修改(id:"
				        + production_ScheduleDao.getProduction_ScheduleByMo_IDAndMethod_Process_Type(id, 3).getId()
				        + " Method_Process" + method_Process.getId());
				ActionContext.getContext().put("Json", gson.toJson(1));
			} else {
				ActionContext.getContext().put("Json", gson.toJson(0));
			}

		} else {
			String sql = "set " + fieldName + " = ? where id = ?";
			int status = moDao.update(sql, id, newValue);
			LogUtil.RollingFile.info(staff.getName() + "修改MO---id:" + id + " fieldName:" + newValue);
			ActionContext.getContext().put("Json", gson.toJson(status));
		}
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
