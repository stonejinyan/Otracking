package com.otracking.bean;

public class ProcessLineStatus {

	private int id;
	private String process_name;
	private String sub_wiring;
	private String mechanical_sub_assembly;
	private String mechanical_assembly;
	private String door_assembly;
	private String cubicle_cabling;
	private String FQC_FAT;
	private String finaly_assembly;
	private String packing_delivery;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProcess_name() {
		return process_name;
	}

	public void setProcess_name(String process_name) {
		this.process_name = process_name;
	}

	public String getSub_wiring() {
		return sub_wiring;
	}

	public void setSub_wiring(String sub_wiring) {
		this.sub_wiring = sub_wiring;
	}

	public String getMechanical_sub_assembly() {
		return mechanical_sub_assembly;
	}

	public void setMechanical_sub_assembly(String mechanical_sub_assembly) {
		this.mechanical_sub_assembly = mechanical_sub_assembly;
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

	public String getFQC_FAT() {
		return FQC_FAT;
	}

	public void setFQC_FAT(String fQC_FAT) {
		FQC_FAT = fQC_FAT;
	}

	public String getFinaly_assembly() {
		return finaly_assembly;
	}

	public void setFinaly_assembly(String finaly_assembly) {
		this.finaly_assembly = finaly_assembly;
	}

	public String getPacking_delivery() {
		return packing_delivery;
	}

	public void setPacking_delivery(String packing_delivery) {
		this.packing_delivery = packing_delivery;
	}

	public ProcessLineStatus(int id, String process_name, String sub_wiring, String mechanical_sub_assembly,
	        String mechanical_assembly, String door_assembly, String cubicle_cabling, String fQC_FAT,
	        String finaly_assembly, String packing_delivery) {
		super();
		this.id = id;
		this.process_name = process_name;
		this.sub_wiring = sub_wiring;
		this.mechanical_sub_assembly = mechanical_sub_assembly;
		this.mechanical_assembly = mechanical_assembly;
		this.door_assembly = door_assembly;
		this.cubicle_cabling = cubicle_cabling;
		FQC_FAT = fQC_FAT;
		this.finaly_assembly = finaly_assembly;
		this.packing_delivery = packing_delivery;
	}

}
