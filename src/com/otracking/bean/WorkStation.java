package com.otracking.bean;

public class WorkStation {

	private int id;
	private String workstation_id;
	private String name;
	private int method_process_id;

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

	public int getMethod_process_id() {
		return method_process_id;
	}

	public void setMethod_process_id(int method_process_id) {
		this.method_process_id = method_process_id;
	}

	public String getWorkstation_id() {
		return workstation_id;
	}

	public void setWorkstation_id(String workstation_id) {
		this.workstation_id = workstation_id;
	}

	@Override
	public String toString() {
		return "WorkStation [id=" + id + ", workstation_id=" + workstation_id + ", name=" + name
		        + ", method_process_id=" + method_process_id + "]";
	}

}
