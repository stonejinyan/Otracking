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
import com.otracking.dao.BatchLevelDao;
import com.otracking.dao.Interruption_RecoverDao;
import com.otracking.dao.MODao;
import com.otracking.dao.Method_Process_TypeDao;
import com.otracking.dao.OrderDao;
import com.otracking.dao.Production_ScheduleDao;

public class GetBatchStatusAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int limit;
	private int offset;
	private String order;
	private int familyID;
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	OrderDao orderDao = new OrderDao();
	BatchDao batchDao = new BatchDao();
	MODao moDao = new MODao();
	BatchLevelDao batchLevelDao = new BatchLevelDao();
	Method_Process_TypeDao method_Process_TypeDao = new Method_Process_TypeDao();
	Interruption_RecoverDao interruption_RecoverDao = new Interruption_RecoverDao();
	String labelsuccess = "<span class='label label-success'>　　　</span>";
	String labelinfo = "<span class='label label-info'>　";
	String labeldanger = "<span class='label label-danger'>　";
	String labeldefault = "<span class='label label-default'>　";
	String labelprimary = "<span class='label label-primary'>　　　</span>";
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

	public String execute() throws Exception {
		List<BatchStatus> batchStatuss = new ArrayList<BatchStatus>();
		// ServerPagination serverPagination = new ServerPagination();
		List<Batch> batchs = batchDao.getCurrentBatch(familyID);
		for (int i = 0; i < batchs.size(); i++) {
			Batch batch = batchs.get(i);
			BatchStatus batchStatus = new BatchStatus();
			batchStatus.setId(i + 1);
			batchStatus.setBatch_id(batch.getId());
			batchStatus.setOrdername(orderDao.findById(batch.getOrder_id()).getName());
			batchStatus.setBatchname(batch.getName());
			batchStatus.setQuantity(batch.getQuantity());
			batchStatus.setWBS(batch.getWBS());
			batchStatus.setComments(batch.getComments());
			batchStatus.setDeliveryTime(moDao.getBatchDeliveryDate(batch.getId()));
			batchStatus.setFatTime(batch.getFattime());
			batchStatus.setLevel(batchLevelDao.findById(batch.getLevel_id()).getName());
			batchStatus.setMechanical_sub_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByBatchAndMethod_Process_Type(batch.getId(), 1)));
			batchStatus.setCabling_sub_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByBatchAndMethod_Process_Type(batch.getId(), 2)));
			batchStatus.setMechanical_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByBatchAndMethod_Process_Type(batch.getId(), 3)));
			batchStatus.setDoor_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByBatchAndMethod_Process_Type(batch.getId(), 4)));
			batchStatus.setCubicle_cabling(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByBatchAndMethod_Process_Type(batch.getId(), 5)));
			batchStatus.setFQC(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByBatchAndMethod_Process_Type(batch.getId(), 6)));
			batchStatus.setFinaly_assembly(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByBatchAndMethod_Process_Type(batch.getId(), 7)));
			batchStatus.setFAT(checkStatus(
			        production_ScheduleDao.getProduction_ScheduleByBatchAndMethod_Process_Type(batch.getId(), 8)));
			batchStatus.setReleaseQuantity((int) moDao.getReleaseQuantity(batch.getId()));
			batchStatus.setFinishGoodsQuantity((int) moDao.getFGQuantity(batch.getId()));
			batchStatus.setPackageQuantity((int) moDao.getPackagesQuantity(batch.getId()));
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
		int WIP = 0;
		for (int i = 0; i < production_Schedules.size(); i++) {
			if (production_Schedules.get(i).getFlag() == 1 || production_Schedules.get(i).getFlag() == 2
			        || production_Schedules.get(i).getFlag() == 3) {
				WIP++;
			}
		}

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
				return labeldanger + WIP + "　</span>";
			}
		}
		if (case2) {
			return labelinfo + WIP + "　</span>";
		}
		if ((case1 || case5) && case4) {
			return labelinfo + WIP + "　</span>";
		}
		if (case1 || case5) {
			return labeldefault + WIP + "　</span>";
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

	public int getFamilyID() {
		return familyID;
	}

	public void setFamilyID(int familyID) {
		this.familyID = familyID;
	}

}
