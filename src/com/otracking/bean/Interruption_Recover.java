package com.otracking.bean;

import java.util.Date;

public class Interruption_Recover {

	private int id;
	private Date interruption_time;
	private Date recover_time;
	private String description;
	private int production_schedule_id;
	private int type;
	private int interruption_recover_department;
	private String owner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getInterruption_time() {
		return interruption_time;
	}

	public void setInterruption_time(Date interruption_time) {
		this.interruption_time = interruption_time;
	}

	public Date getRecover_time() {
		return recover_time;
	}

	public void setRecover_time(Date recover_time) {
		this.recover_time = recover_time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProduction_schedule_id() {
		return production_schedule_id;
	}

	public void setProduction_schedule_id(int production_schedule_id) {
		this.production_schedule_id = production_schedule_id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getInterruption_recover_department() {
		return interruption_recover_department;
	}

	public void setInterruption_recover_department(int interruption_recover_department) {
		this.interruption_recover_department = interruption_recover_department;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
