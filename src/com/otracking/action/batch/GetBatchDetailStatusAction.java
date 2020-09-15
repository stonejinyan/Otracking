package com.otracking.action.batch;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Batch;
import com.otracking.bean.BatchStatus;
import com.otracking.bean.Production_Schedule;
import com.otracking.dao.BatchDao;
import com.otracking.dao.Interruption_RecoverDao;
import com.otracking.dao.Method_Process_TypeDao;
import com.otracking.dao.OrderDao;
import com.otracking.dao.Production_ScheduleDao;

//废弃
public class GetBatchDetailStatusAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int limit;
	private int offset;
	private String order;
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	OrderDao orderDao = new OrderDao();
	BatchDao batchDao = new BatchDao();
	Method_Process_TypeDao method_Process_TypeDao = new Method_Process_TypeDao();
	Interruption_RecoverDao interruption_RecoverDao = new Interruption_RecoverDao();
	String labelsuccess = "100%<div class='progress'><div class='progress-bar progress-bar-success' role='progressbar' aria-valuenow='100' aria-valuemin='0' aria-valuemax='100' style='width: 100%'></div></div>";
	String labelinfo = "<span class='label label-info'>　5%</span>";
	String labeldanger = "<span class='label label-danger'>　5%</span>";
	String labeldefault = "<span class='label label-default'>100%</span>";
	String labelprimary = "<span class='label label-primary'>100%</span>";
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {
		List<BatchStatus> batchStatuss = new ArrayList<BatchStatus>();
		// ServerPagination serverPagination = new ServerPagination();
		List<Batch> batchs = batchDao.getAll();
		for (int i = 0; i < batchs.size(); i++) {
			BatchStatus batchStatus = new BatchStatus();
			batchStatus.setId(i + 1);
			batchStatus.setOrdername(orderDao.findById(batchs.get(i).getOrder_id()).getName());
			batchStatus.setBatchname(batchs.get(i).getName());
			batchStatus.setMechanical_sub_assembly(checkStatus(production_ScheduleDao
			        .getProduction_ScheduleByBatchAndMethod_Process_Type(batchs.get(i).getId(), 1)));
			batchStatus.setCabling_sub_assembly(checkStatus(production_ScheduleDao
			        .getProduction_ScheduleByBatchAndMethod_Process_Type(batchs.get(i).getId(), 2)));
			batchStatus.setMechanical_assembly(checkStatus(production_ScheduleDao
			        .getProduction_ScheduleByBatchAndMethod_Process_Type(batchs.get(i).getId(), 3)));
			batchStatus.setDoor_assembly(checkStatus(production_ScheduleDao
			        .getProduction_ScheduleByBatchAndMethod_Process_Type(batchs.get(i).getId(), 4)));
			batchStatus.setCubicle_cabling(checkStatus(production_ScheduleDao
			        .getProduction_ScheduleByBatchAndMethod_Process_Type(batchs.get(i).getId(), 5)));
			batchStatus.setFQC(checkStatus(production_ScheduleDao
			        .getProduction_ScheduleByBatchAndMethod_Process_Type(batchs.get(i).getId(), 6)));
			batchStatus.setFinaly_assembly(checkStatus(production_ScheduleDao
			        .getProduction_ScheduleByBatchAndMethod_Process_Type(batchs.get(i).getId(), 7)));
			batchStatus.setFAT(checkStatus(production_ScheduleDao
			        .getProduction_ScheduleByBatchAndMethod_Process_Type(batchs.get(i).getId(), 8)));
			batchStatuss.add(batchStatus);
		}
		/*
		 * serverPagination.setRow(batchStatuss); serverPagination.setTotal(6);
		 */
		ActionContext.getContext().put("Json", gson.toJson(batchStatuss));
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
			return labeldefault;
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

}
