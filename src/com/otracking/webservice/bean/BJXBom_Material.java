package com.otracking.webservice.bean;

public class BJXBom_Material {

	private String AOP;
	private String panel;
	private String material;
	private double quantity;
	private String description;
	private String RGEKZ;

	public String getAOP() {
		return AOP;
	}

	public void setAOP(String aOP) {
		AOP = aOP;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRGEKZ() {
		return RGEKZ;
	}

	public void setRGEKZ(String rGEKZ) {
		RGEKZ = rGEKZ;
	}

	@Override
	public String toString() {
		return "BJXBom_Material [AOP=" + AOP + ", panel=" + panel + ", material=" + material + ", quantity=" + quantity
		        + ", description=" + description + ", RGEKZ=" + RGEKZ + "]";
	}

}
