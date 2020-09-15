package com.otracking.bean;

import java.io.Serializable;

public class ProductionMaterial implements Serializable {

	private int id;
	private String AUFNR;
	private String C_MATNR;
	private String R_MATNR;
	private String MAKTX;
	private double MENGE;
	private String WKSTG;
	private String RGEKZ;
	private int mo_id;
	private int active;

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

	public String getR_MATNR() {
		return R_MATNR;
	}

	public void setR_MATNR(String r_MATNR) {
		R_MATNR = r_MATNR;
	}

	public String getMAKTX() {
		return MAKTX;
	}

	public void setMAKTX(String mAKTX) {
		MAKTX = mAKTX;
	}

	public double getMENGE() {
		return MENGE;
	}

	public void setMENGE(double mENGE) {
		MENGE = mENGE;
	}

	public String getWKSTG() {
		return WKSTG;
	}

	public void setWKSTG(String wKSTG) {
		WKSTG = wKSTG;
	}

	public String getRGEKZ() {
		return RGEKZ;
	}

	public void setRGEKZ(String rGEKZ) {
		RGEKZ = rGEKZ;
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

}
