package com.otracking.bean;

public class Product_Type {

	private int id;
	private String name;
	private int bigtype_id;
	private int processline_id;

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

	public int getBigtype_id() {
		return bigtype_id;
	}

	public void setBigtype_id(int bigtype_id) {
		this.bigtype_id = bigtype_id;
	}

	public int getProcessline_id() {
		return processline_id;
	}

	public void setProcessline_id(int processline_id) {
		this.processline_id = processline_id;
	}

}
