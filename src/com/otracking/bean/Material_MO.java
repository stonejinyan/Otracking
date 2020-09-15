package com.otracking.bean;

import java.io.Serializable;

public class Material_MO implements Serializable {

	private String AUFNR;
	private String C_MATNR;
	private Material[] materials = {};

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

	public Material[] getMaterials() {
		return materials;
	}

	public void setMaterials(Material[] materials) {
		this.materials = materials;
	}

	public Material_MO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Material_MO [AUFNR=" + AUFNR + ", C_MATNR=" + C_MATNR + ", materials=" + materials + "]";
	}

}
