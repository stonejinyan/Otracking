package com.otracking.bean;

import java.util.Date;

public class Edit_Bulk_Log {

	private int id;
	private int staff_id;
	private String field_name;
	private String new_value;
	private int bulk_id;
	private Date created_time;

	public int getBulk_id() {
		return bulk_id;
	}

	public void setBulk_id(int bulk_id) {
		this.bulk_id = bulk_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public Edit_Bulk_Log() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNew_value() {
		return new_value;
	}

	public void setNew_value(String new_value) {
		this.new_value = new_value;
	}

	public Edit_Bulk_Log(int id, int staff_id, String field_name, String new_value, int bulk_id, Date created_time) {
		super();
		this.id = id;
		this.staff_id = staff_id;
		this.field_name = field_name;
		this.new_value = new_value;
		this.bulk_id = bulk_id;
		this.created_time = created_time;
	}

}
