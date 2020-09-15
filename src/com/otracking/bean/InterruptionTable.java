package com.otracking.bean;

import java.util.Date;

public class InterruptionTable {

	private String description;
	private String method_process_name;
	private String processline_name;
	private String mo_name;
	private String batch_name;
	private String seeeorder_name;
	private String type_name;
	private String interruption_recover_type;
	private String interruption_recover_department_name;
	private String owner;
	private Date interruption_time;
	private Date schedule_endtime;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMethod_process_name() {
		return method_process_name;
	}

	public void setMethod_process_name(String method_process_name) {
		this.method_process_name = method_process_name;
	}

	public String getProcessline_name() {
		return processline_name;
	}

	public void setProcessline_name(String processline_name) {
		this.processline_name = processline_name;
	}

	public String getMo_name() {
		return mo_name;
	}

	public void setMo_name(String mo_name) {
		this.mo_name = mo_name;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public String getSeeeorder_name() {
		return seeeorder_name;
	}

	public void setSeeeorder_name(String seeeorder_name) {
		this.seeeorder_name = seeeorder_name;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public Date getInterruption_time() {
		return interruption_time;
	}

	public void setInterruption_time(Date interruption_time) {
		this.interruption_time = interruption_time;
	}

	public Date getSchedule_endtime() {
		return schedule_endtime;
	}

	public void setSchedule_endtime(Date schedule_endtime) {
		this.schedule_endtime = schedule_endtime;
	}

	public String getInterruption_recover_department_name() {
		return interruption_recover_department_name;
	}

	public void setInterruption_recover_department_name(String interruption_recover_department_name) {
		this.interruption_recover_department_name = interruption_recover_department_name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getInterruption_recover_type() {
		return interruption_recover_type;
	}

	public void setInterruption_recover_type(String interruption_recover_type) {
		this.interruption_recover_type = interruption_recover_type;
	}

}
