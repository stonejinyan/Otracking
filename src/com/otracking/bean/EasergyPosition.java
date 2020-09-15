package com.otracking.bean;

import java.io.Serializable;

public class EasergyPosition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8249425185243240331L;
	public int id;
	public String customer_id;
	public String model;
	public String aop;
	public String so_item;
	public String zbrn32_imput_port;
	public String assembly_position;
	public String easergy_id;
	public String sequence;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAop() {
		return aop;
	}

	public void setAop(String aop) {
		this.aop = aop;
	}

	public String getSo_item() {
		return so_item;
	}

	public void setSo_item(String so_item) {
		this.so_item = so_item;
	}

	public String getZbrn32_imput_port() {
		return zbrn32_imput_port;
	}

	public void setZbrn32_imput_port(String zbrn32_imput_port) {
		this.zbrn32_imput_port = zbrn32_imput_port;
	}

	public String getAssembly_position() {
		return assembly_position;
	}

	public void setAssembly_position(String assembly_position) {
		this.assembly_position = assembly_position;
	}

	public String getEasergy_id() {
		return easergy_id;
	}

	public void setEasergy_id(String easergy_id) {
		this.easergy_id = easergy_id;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

}
