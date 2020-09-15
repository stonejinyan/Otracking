package com.otracking.bean;

public class Interruption_Recover_Table extends Interruption_Recover {

	private String type_name;
	private int mo_id;
	private String interruption_recover_department_name;
	private String method_process;

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getInterruption_recover_department_name() {
		return interruption_recover_department_name;
	}

	public void setInterruption_recover_department_name(String interruption_recover_department_name) {
		this.interruption_recover_department_name = interruption_recover_department_name;
	}

	public String getMethod_process() {
		return method_process;
	}

	public void setMethod_process(String method_process) {
		this.method_process = method_process;
	}

}
