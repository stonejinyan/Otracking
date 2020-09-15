package com.otracking.bean;

public class Staff {

	private int id;
	private String sesaid;
	private String name;
	private String password;
	private String sellphone;
	private String email;
	private int role_id;
	private int workstation_id;

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getWorkstation_id() {
		return workstation_id;
	}

	public void setWorkstation_id(int workstation_id) {
		this.workstation_id = workstation_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSesaid() {
		return sesaid;
	}

	public void setSesaid(String sesaid) {
		this.sesaid = sesaid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSellphone() {
		return sellphone;
	}

	public void setSellphone(String sellphone) {
		this.sellphone = sellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(int id, String sesaid, String name, String password, String sellphone, String email, int role_id,
	        int workstation_id) {
		super();
		this.id = id;
		this.sesaid = sesaid;
		this.name = name;
		this.password = password;
		this.sellphone = sellphone;
		this.email = email;
		this.role_id = role_id;
		this.workstation_id = workstation_id;
	}

}
