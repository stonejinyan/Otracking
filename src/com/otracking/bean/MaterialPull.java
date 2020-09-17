package com.otracking.bean;

import java.util.Date;

public class MaterialPull {

	public MaterialPull() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaterialPull(int id, int staff_id, int mo_id, int flag, Date pull_time, int method_type_id, int material_id,
	        double quantity) {
		super();
		this.id = id;
		this.staff_id = staff_id;
		this.mo_id = mo_id;
		this.flag = flag;
		this.pull_time = pull_time;
		this.method_type_id = method_type_id;
		this.material_id = material_id;
		this.quantity = quantity;
	}

	private int id;
	private int staff_id;
	private int mo_id;
	private int flag;
	private Date pull_time;
	private int method_type_id;
	private int material_id;
	private double quantity;

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Date getPull_time() {
		return pull_time;
	}

	public void setPull_time(Date pull_time) {
		this.pull_time = pull_time;
	}

	public int getMethod_type_id() {
		return method_type_id;
	}

	public void setMethod_type_id(int method_type_id) {
		this.method_type_id = method_type_id;
	}

}
