package com.otracking.webservice.bean;

import java.util.Date;

public class MO {

	private int id;
	private String name;
	private Date schedule_starttime;
	private Date schedule_endtime;
	private Date actual_starttime;
	private Date actual_endtime;
	private int batch_id;
	private int product_type_id;
	private int scheduling;
	private String securityCode;
	private double quantity;
	private String dms_id;
	private int no;
	private String description;
	private String customID;
	private int ekitting;

	public int getEkitting() {
		return ekitting;
	}

	public void setEkitting(int ekitting) {
		this.ekitting = ekitting;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomID() {
		return customID;
	}

	public void setCustomID(String customID) {
		this.customID = customID;
	}

	public String getDms_id() {
		return dms_id;
	}

	public void setDms_id(String dms_id) {
		this.dms_id = dms_id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getSchedule_starttime() {
		return schedule_starttime;
	}

	public void setSchedule_starttime(Date schedule_starttime) {
		this.schedule_starttime = schedule_starttime;
	}

	public Date getSchedule_endtime() {
		return schedule_endtime;
	}

	public void setSchedule_endtime(Date schedule_endtime) {
		this.schedule_endtime = schedule_endtime;
	}

	public Date getActual_starttime() {
		return actual_starttime;
	}

	public void setActual_starttime(Date actual_starttime) {
		this.actual_starttime = actual_starttime;
	}

	public Date getActual_endtime() {
		return actual_endtime;
	}

	public void setActual_endtime(Date actual_endtime) {
		this.actual_endtime = actual_endtime;
	}

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public int getProduct_type_id() {
		return product_type_id;
	}

	public void setProduct_type_id(int product_type_id) {
		this.product_type_id = product_type_id;
	}

	public int getScheduling() {
		return scheduling;
	}

	public void setScheduling(int scheduling) {
		this.scheduling = scheduling;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public MO(int id, String name, Date schedule_starttime, Date schedule_endtime, Date actual_starttime,
	        Date actual_endtime, int batch_id, int product_type_id, int scheduling, String securityCode,
	        double quantity, String dms_id, int no, String description, String customID, int ekitting) {
		super();
		this.id = id;
		this.name = name;
		this.schedule_starttime = schedule_starttime;
		this.schedule_endtime = schedule_endtime;
		this.actual_starttime = actual_starttime;
		this.actual_endtime = actual_endtime;
		this.batch_id = batch_id;
		this.product_type_id = product_type_id;
		this.scheduling = scheduling;
		this.securityCode = securityCode;
		this.quantity = quantity;
		this.dms_id = dms_id;
		this.no = no;
		this.description = description;
		this.customID = customID;
		this.ekitting = ekitting;
	}

	public MO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
