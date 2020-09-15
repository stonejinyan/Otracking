package com.otracking.bean;

import java.util.Date;

public class OffDay {

	private int id;
	private String name;
	private Date starttime;
	private Date endtime;

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

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Override
	public String toString() {
		return "OffDay [id=" + id + ", name=" + name + ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}

}
