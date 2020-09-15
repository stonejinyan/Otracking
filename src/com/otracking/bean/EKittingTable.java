package com.otracking.bean;

import java.util.Date;

public class EKittingTable {

	private int id;
	private String method_process;
	private int method_process_id;
	private Date pull_time;
	private String mo_name;
	private Date schedule_starttime;
	private double quantity;
	private String dms_id;
	private String processline;
	private String processline_sap;
	private String mo_type;
	private String mo_classify;
	private String sap_method_process;
	private String batch;
	private String seeeorder;
	private String staff;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMethod_process() {
		return method_process;
	}

	public void setMethod_process(String method_process) {
		this.method_process = method_process;
	}

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
	}

	public Date getPull_time() {
		return pull_time;
	}

	public void setPull_time(Date pull_time) {
		this.pull_time = pull_time;
	}

	public String getMo_name() {
		return mo_name;
	}

	public void setMo_name(String mo_name) {
		this.mo_name = mo_name;
	}

	public Date getSchedule_starttime() {
		return schedule_starttime;
	}

	public void setSchedule_starttime(Date schedule_starttime) {
		this.schedule_starttime = schedule_starttime;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getDms_id() {
		return dms_id;
	}

	public void setDms_id(String dms_id) {
		this.dms_id = dms_id;
	}

	public String getProcessline() {
		return processline;
	}

	public void setProcessline(String processline) {
		this.processline = processline;
	}

	public String getProcessline_sap() {
		return processline_sap;
	}

	public void setProcessline_sap(String processline_sap) {
		this.processline_sap = processline_sap;
	}

	public String getMo_type() {
		return mo_type;
	}

	public void setMo_type(String mo_type) {
		this.mo_type = mo_type;
	}

	public String getMo_classify() {
		return mo_classify;
	}

	public void setMo_classify(String mo_classify) {
		this.mo_classify = mo_classify;
	}

	public String getSap_method_process() {
		return sap_method_process;
	}

	public void setSap_method_process(String sap_method_process) {
		this.sap_method_process = sap_method_process;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getSeeeorder() {
		return seeeorder;
	}

	public void setSeeeorder(String seeeorder) {
		this.seeeorder = seeeorder;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

}
