package com.otracking.bean;

public class Routing {

	private int id;
	private int type_id;
	private int method_process_id;
	private double dt;
	private double tt;
	private int sequence;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
	}

	public double getDt() {
		return dt;
	}

	public void setDt(double dt) {
		this.dt = dt;
	}

	public double getTt() {
		return tt;
	}

	public void setTt(double tt) {
		this.tt = tt;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		return "Routing [type_id=" + type_id + ", method_process_id=" + method_process_id + ", dt=" + dt + ", tt=" + tt
		        + ", sequence=" + sequence + "]";
	}

}
