package com.otracking.bean;

import java.util.Date;

public class BatchStatus {
	private int id;
	private int batch_id;
	private String ordername;
	private String batchname;
	private String mechanical_sub_assembly;
	private String cabling_sub_assembly;
	private String mechanical_assembly;
	private String door_assembly;
	private String cubicle_cabling;
	private String FQC;
	private String finaly_assembly;
	private String FAT;
	private String WBS;
	private int quantity;
	private String level;
	private String comments;
	private Date DeliveryTime;
	private Date fatTime;

	public Date getFatTime() {
		return fatTime;
	}

	public void setFatTime(Date fatTime) {
		this.fatTime = fatTime;
	}

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDeliveryTime() {
		return DeliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		DeliveryTime = deliveryTime;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getWBS() {
		return WBS;
	}

	public void setWBS(String wBS) {
		WBS = wBS;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

}
