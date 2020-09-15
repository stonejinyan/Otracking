package com.otracking.bean;

public class Bulk {

	private int id;
	private String name;
	private String description_zh;
	private String description_en;
	private double price;
	private double mpq;
	private String smallest_unit;
	private double smallest_unit_quantity;
	private String delivery_unit;
	private double delivery_quantity;
	private int type;
	private String image;

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

	public String getDescription_zh() {
		return description_zh;
	}

	public void setDescription_zh(String description_zh) {
		this.description_zh = description_zh;
	}

	public String getDescription_en() {
		return description_en;
	}

	public void setDescription_en(String description_en) {
		this.description_en = description_en;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMpq() {
		return mpq;
	}

	public void setMpq(double mpq) {
		this.mpq = mpq;
	}

	public String getSmallest_unit() {
		return smallest_unit;
	}

	public void setSmallest_unit(String smallest_unit) {
		this.smallest_unit = smallest_unit;
	}

	public double getSmallest_unit_quantity() {
		return smallest_unit_quantity;
	}

	public void setSmallest_unit_quantity(double smallest_unit_quantity) {
		this.smallest_unit_quantity = smallest_unit_quantity;
	}

	public String getDelivery_unit() {
		return delivery_unit;
	}

	public void setDelivery_unit(String delivery_unit) {
		this.delivery_unit = delivery_unit;
	}

	public double getDelivery_quantity() {
		return delivery_quantity;
	}

	public void setDelivery_quantity(double delivery_quantity) {
		this.delivery_quantity = delivery_quantity;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
