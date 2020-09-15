package com.otracking.bean;

import java.util.Date;

public class Production_Schedule {

	private int id;
	private Date schedule_starttime;
	private Date schedule_endtime;
	private Date actual_starttime;
	private Date actual_endtime;
	private int method_process_id;
	private int mo_id;
	private int flag;

	public Production_Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Production_Schedule(int id, Date schedule_starttime, Date schedule_endtime, Date actual_starttime,
	        Date actual_endtime, int method_process_id, int mo_id, int flag) {
		super();
		this.id = id;
		this.schedule_starttime = schedule_starttime;
		this.schedule_endtime = schedule_endtime;
		this.actual_starttime = actual_starttime;
		this.actual_endtime = actual_endtime;
		this.method_process_id = method_process_id;
		this.mo_id = mo_id;
		this.flag = flag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getSchedule_starttime() {
		return schedule_starttime;
	}

	public void setSchedule_starttime(Date schedule_starttime) {
		this.schedule_starttime = schedule_starttime;
	}

	public Date getSchedule_endtime() {
		return schedule_endtime;
	}

	public void setSchedule_endtime(Date schedule_endtime) {
		this.schedule_endtime = schedule_endtime;
	}

	public Date getActual_starttime() {
		return actual_starttime;
	}

	public void setActual_starttime(Date actual_starttime) {
		this.actual_starttime = actual_starttime;
	}

	public Date getActual_endtime() {
		return actual_endtime;
	}

	public void setActual_endtime(Date actual_endtime) {
		this.actual_endtime = actual_endtime;
	}

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
