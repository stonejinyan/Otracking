package com.otracking.bean;

import java.util.Date;

public class MOStatus {
	private int id;
	private int mo_id;
	private String ordername;
	private String batchname;
	private String moname;
	private String mechanical_sub_assembly;
	private String cabling_sub_assembly;
	private String mechanical_assembly;
	private String door_assembly;
	private String cubicle_cabling;
	private String FQC;
	private String finaly_assembly;
	private String LVS;
	private String FAT;
	private String warehouse_received;
	private String warehouse_typing;
	private String product_type_name;
	private String product_bigtype_name;
	private Date schedule_starttime;
	private Date schedule_endtime;
	private Date actual_starttime;
	private Date actual_endtime;
	private String dms_id;
	private String processline;
	private double quantity;
	private Date fat_datetime;

	public Date getFat_datetime() {
		return fat_datetime;
	}

	public void setFat_datetime(Date fat_datetime) {
		this.fat_datetime = fat_datetime;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

	public String getProcessline() {
		return processline;
	}

	public void setProcessline(String processline) {
		this.processline = processline;
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

	public String getDms_id() {
		return dms_id;
	}

	public void setDms_id(String dms_id) {
		this.dms_id = dms_id;
	}

	public Date getSchedule_starttime() {
		return schedule_starttime;
	}

	public void setSchedule_starttime(Date schedule_starttime) {
		this.schedule_starttime = schedule_starttime;
	}

	public String getProduct_type_name() {
		return product_type_name;
	}

	public void setProduct_type_name(String product_type_name) {
		this.product_type_name = product_type_name;
	}

	public String getProduct_bigtype_name() {
		return product_bigtype_name;
	}

	public void setProduct_bigtype_name(String product_bigtype_name) {
		this.product_bigtype_name = product_bigtype_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getBatchname() {
		return batchname;
	}

	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}

	public String getMechanical_sub_assembly() {
		return mechanical_sub_assembly;
	}

	public void setMechanical_sub_assembly(String mechanical_sub_assembly) {
		this.mechanical_sub_assembly = mechanical_sub_assembly;
	}

	public String getCabling_sub_assembly() {
		return cabling_sub_assembly;
	}

	public void setCabling_sub_assembly(String cabling_sub_assembly) {
		this.cabling_sub_assembly = cabling_sub_assembly;
	}

	public String getMechanical_assembly() {
		return mechanical_assembly;
	}

	public void setMechanical_assembly(String mechanical_assembly) {
		this.mechanical_assembly = mechanical_assembly;
	}

	public String getDoor_assembly() {
		return door_assembly;
	}

	public void setDoor_assembly(String door_assembly) {
		this.door_assembly = door_assembly;
	}

	public String getCubicle_cabling() {
		return cubicle_cabling;
	}

	public void setCubicle_cabling(String cubicle_cabling) {
		this.cubicle_cabling = cubicle_cabling;
	}

	public String getFinaly_assembly() {
		return finaly_assembly;
	}

	public void setFinaly_assembly(String finaly_assembly) {
		this.finaly_assembly = finaly_assembly;
	}

	public String getMoname() {
		return moname;
	}

	public void setMoname(String moname) {
		this.moname = moname;
	}

	public String getFQC() {
		return FQC;
	}

	public void setFQC(String fQC) {
		FQC = fQC;
	}

	public String getFAT() {
		return FAT;
	}

	public void setFAT(String fAT) {
		FAT = fAT;
	}

	public String getLVS() {
		return LVS;
	}

	public void setLVS(String lVS) {
		LVS = lVS;
	}

	public String getWarehouse_received() {
		return warehouse_received;
	}

	public void setWarehouse_received(String warehouse_received) {
		this.warehouse_received = warehouse_received;
	}

	public String getWarehouse_typing() {
		return warehouse_typing;
	}

	public void setWarehouse_typing(String warehouse_typing) {
		this.warehouse_typing = warehouse_typing;
	}

}
