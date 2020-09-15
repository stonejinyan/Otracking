package com.otracking.action.mo;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.MOStatus;
import com.otracking.bean.MOTable;
import com.otracking.bean.Production_Schedule;
import com.otracking.dao.BatchDao;
import com.otracking.dao.Interruption_RecoverDao;
import com.otracking.dao.MOTableDao;
import com.otracking.dao.Method_Process_TypeDao;
import com.otracking.dao.OrderDao;
import com.otracking.dao.Production_ScheduleDao;

public class GetMODetailStatusAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int limit;
	private int offset;
	private String order;
	private int batch_id;
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	OrderDao orderDao = new OrderDao();
	BatchDao batchDao = new BatchDao();
	MOTableDao moTableDao = new MOTableDao();
	Method_Process_TypeDao method_Process_TypeDao = new Method_Process_TypeDao();
	Interruption_RecoverDao interruption_RecoverDao = new Interruption_RecoverDao();
	String labelsuccess = "<span class='label label-success'><span class='text-mysuccess'>已完成</span></span>";
	String labelinfo = "<span class='label label-info'><span class='text-myinfo'>生产中</span></span>";
	String labeldanger = "<span class='label label-danger'><span class='text-mydanger'>异　常</span></span>";
	String labeldefault = "<span class='label label-default'><span class='text-mydefault'>未开工</span></span>";
	String labelprimary = "<span class='label label-primary'>　　</span>";
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {
		List<MOStatus> moStatuss = new ArrayList<MOStatus>();
		// ServerPagination serverPagination = new ServerPagination();
		List<MOTable> moTables = null;
		if (batch_id == 0) {
			moTables = moTableDao.getAllWhereBatch_EndTimeIsNull();
		} else {
			moTables = moTableDao.getByBatch(batch_id);
		}

		for (int i = 0; i < moTables.size(); i++) {
			MOTable moTable = moTables.get(i);
			MOStatus moStatus = new MOStatus();
			moStatus.setId(i + 1);
			moStatus.setOrdername(moTable.getOrder_name());
			moStatus.setBatchname(moTable.getBatch_name());
			moStatus.setMoname(moTable.getName());
			moStatus.setMo_id(moTable.getId());
			moStatus.setDms_id(moTable.getDms_id());
			moStatus.setProcessline(moTable.getProcessline());
			moStatus.setProduct_bigtype_name(moTable.getProduct_bigtype_name());
			moStatus.setProduct_type_name(moTable.getProduct_type_name());
			moStatus.setSchedule_starttime(moTable.getSchedule_starttime());
			moStatus.setSchedule_endtime(moTable.getSchedule_endtime());
			moStatus.setActual_starttime(moTable.getActual_starttime());
			moStatus.setActual_endtime(moTable.getActual_endtime());
			moStatus.setQuantity(moTable.getQuantity());
			moStatus.setMechanical_sub_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByMOAndMethod_Process_Type(moTable.getId(), 1)));
			moStatus.setCabling_sub_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByMOAndMethod_Process_Type(moTable.getId(), 2)));
			moStatus.setMechanical_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByMOAndMethod_Process_Type(moTable.getId(), 3)));
			moStatus.setDoor_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByMOAndMethod_Process_Type(moTable.getId(), 4)));
			moStatus.setCubicle_cabling(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByMOAndMethod_Process_Type(moTable.getId(), 5)));
			moStatus.setFQC(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByMOAndMethod_Process_Type(moTable.getId(), 6)));
			moStatus.setFinaly_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByMOAndMethod_Process_Type(moTable.getId(), 7)));
			moStatus.setFAT(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByMOAndMethod_Process_Type(moTable.getId(), 8)));
			moStatuss.add(moStatus);
		}
		/*
		 * serverPagination.setRow(batchStatuss); serverPagination.setTotal(6);
		 */
		ActionContext.getContext().put("Json", gson.toJson(moStatuss));
		return "success";

	}

	private String checkStatus(List<Production_Schedule> production_Schedules) {
		// TODO Auto-generated method stub
		boolean case1 = false;
		boolean case2 = false;
		boolean case3 = false;
		boolean case4 = false;
		boolean case5 = false;
		if (production_Schedules.size() == 0) {
			return "<span>　　</span>";
		}
		for (int i = 0; i < production_Schedules.size(); i++) {
			switch (production_Schedules.get(i).getFlag()) {
			case 1:
				case1 = true;
				break;
			case 2:
				case2 = true;
				break;
			case 3:
				if (interruption_RecoverDao.getCurrent(production_Schedules.get(i).getId()).getType() != 100) {
					case3 = true;
				} else if (interruption_RecoverDao.getCurrent(production_Schedules.get(i).getId()).getType() == 100) {
					case2 = true;
				}
				break;
			case 4:
				case4 = true;
				break;
			case 5:
				case5 = true;
				break;
			}
			if (case3) {
				return labeldanger;
			}
		}
		if (case2) {
			return labelinfo;
		}
		if ((case1 || case5) && case4) {
			return labelinfo;
		}
		if (case1 || case5) {
			return labeldefault;
		}
		if (case4) {
			return labelsuccess;
		}
		return null;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

}
