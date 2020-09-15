package com.otracking.bean;

public class DatabaseMaterial extends Material {
	private int id;
	private String AUFNR;
	private String C_MATNR;
	private int mo_id;
	private int active;
	private String used;

	public DatabaseMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DatabaseMaterial(int id, String aUFNR, String c_MATNR, int mo_id, int active, String used,
	        Material material) {
		R_MATNR = material.getR_MATNR();
		MAKTX = material.getMAKTX();
		MENGE = material.getMENGE();
		WKSTG = material.getWKSTG();
		RGEKZ = material.getRGEKZ();
		this.id = id;
		AUFNR = aUFNR;
		C_MATNR = c_MATNR;
		this.active = active;
		this.used = used;
		this.mo_id = mo_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAUFNR() {
		return AUFNR;
	}

	public void setAUFNR(String aUFNR) {
		AUFNR = aUFNR;
	}

	public String getC_MATNR() {
		return C_MATNR;
	}

	public void setC_MATNR(String c_MATNR) {
		C_MATNR = c_MATNR;
	}

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

}
