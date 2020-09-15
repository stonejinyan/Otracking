package com.otracking.bean;

import java.io.Serializable;

public class Material implements Serializable {

	protected String R_MATNR;
	protected String MAKTX;
	protected double MENGE;
	protected String WKSTG;
	protected String RGEKZ;

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

	public Material() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Material [R_MATNR=" + R_MATNR + ", MAKTX=" + MAKTX + ", MENGE=" + MENGE + ", WKSTG=" + WKSTG
		        + ", RGEKZ=" + RGEKZ + "]";
	}

}
