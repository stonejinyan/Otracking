package com.otracking.bean;

import java.util.Date;

public class EKitting {
	private int id;
	private int sap_method_process_id;
	private int method_process_id;
	private int mo_id;
	private int processline_id;
	private int staff_id;
	private Date pull_time;
	private int flag;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSap_method_process_id() {
		return sap_method_process_id;
	}

	public void setSap_method_process_id(int sap_method_process_id) {
		this.sap_method_process_id = sap_method_process_id;
	}

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
	}

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

	public int getProcessline_id() {
		return processline_id;
	}

	public void setProcessline_id(int processline_id) {
		this.processline_id = processline_id;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public Date getPull_time() {
		return pull_time;
	}

	public void setPull_time(Date pull_time) {
		this.pull_time = pull_time;
	}

	public EKitting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EKitting(int id, int sap_method_process_id, int method_process_id, int mo_id, int processline_id,
	        int staff_id, Date pull_time, int flag) {
		super();
		this.id = id;
		this.sap_method_process_id = sap_method_process_id;
		this.method_process_id = method_process_id;
		this.mo_id = mo_id;
		this.processline_id = processline_id;
		this.staff_id = staff_id;
		this.pull_time = pull_time;
		this.flag = flag;
	}

}