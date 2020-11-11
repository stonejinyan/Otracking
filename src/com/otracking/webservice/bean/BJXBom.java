package com.otracking.webservice.bean;

import java.util.Arrays;

public class BJXBom {

	private String moString;
	private BJXBom_Material[] bjxBom_Materials = {};

	public String getMoString() {
		return moString;
	}

	public void setMoString(String moString) {
		this.moString = moString;
	}

	public BJXBom_Material[] getBjxBom_Materials() {
		return bjxBom_Materials;
	}

	public void setBjxBom_Materials(BJXBom_Material[] bjxBom_Materials) {
		this.bjxBom_Materials = bjxBom_Materials;
	}

	@Override
	public String toString() {
		return "BJXBom [moString=" + moString + ", bjxBom_Materials=" + Arrays.toString(bjxBom_Materials) + "]";
	}

}
