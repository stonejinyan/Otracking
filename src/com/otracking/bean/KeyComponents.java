package com.otracking.bean;

public class KeyComponents {

	private int id;
	private String components_id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComponents_id() {
		return components_id;
	}

	public void setComponents_id(String components_id) {
		this.components_id = components_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "KeyComponents [id=" + id + ", components_id=" + components_id + ", name=" + name + "]";
	}

}
