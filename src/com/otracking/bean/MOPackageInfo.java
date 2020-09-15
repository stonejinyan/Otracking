package com.otracking.bean;

public class MOPackageInfo {

	public MOPackageInfo() {
		// TODO Auto-generated constructor stub
	}

	public MOPackageInfo(int no, String sale_order, String order_name, String wbs, String mo_name, String customer_id,
	        String dms_id, String model, String type, double request_quantity, String unit, double delivery_quantity,
	        double net_weight, double gross_weight, String package_info, String error) {
		super();
		this.no = no;
		this.sale_order = sale_order;
		this.order_name = order_name;
		this.wbs = wbs;
		this.mo_name = mo_name;
		this.customer_id = customer_id;
		this.dms_id = dms_id;
		this.model = model;
		this.type = type;
		this.request_quantity = request_quantity;
		this.unit = unit;
		this.delivery_quantity = delivery_quantity;
		this.net_weight = net_weight;
		this.gross_weight = gross_weight;
		this.package_info = package_info;
		this.error = error;
	}

	private int no;
	private String sale_order;
	private String order_name;
	private String wbs;
	private String mo_name;
	private String customer_id;
	private String dms_id;
	private String model;
	private String type;
	private double request_quantity;
	private String unit;
	private double delivery_quantity;
	private double net_weight;
	private double gross_weight;
	private String package_info;
	String error;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSale_order() {
		return sale_order;
	}

	public void setSale_order(String sale_order) {
		this.sale_order = sale_order;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getWbs() {
		return wbs;
	}

	public void setWbs(String wbs) {
		this.wbs = wbs;
	}

	public String getMo_name() {
		return mo_name;
	}

	public void setMo_name(String mo_name) {
		this.mo_name = mo_name;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getDms_id() {
		return dms_id;
	}

	public void setDms_id(String dms_id) {
		this.dms_id = dms_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getNet_weight() {
		return net_weight;
	}

	public void setNet_weight(double net_weight) {
		this.net_weight = net_weight;
	}

	public double getGross_weight() {
		return gross_weight;
	}

	public void setGross_weight(double gross_weight) {
		this.gross_weight = gross_weight;
	}

	public String getPackage_info() {
		return package_info;
	}

	public void setPackage_info(String package_info) {
		this.package_info = package_info;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public double getRequest_quantity() {
		return request_quantity;
	}

	public void setRequest_quantity(double request_quantity) {
		this.request_quantity = request_quantity;
	}

	public double getDelivery_quantity() {
		return delivery_quantity;
	}

	public void setDelivery_quantity(double delivery_quantity) {
		this.delivery_quantity = delivery_quantity;
	}

	@Override
	public String toString() {
		return "MOPackageInfo [no=" + no + ", sale_order=" + sale_order + ", order_name=" + order_name + ", wbs=" + wbs
		        + ", mo_name=" + mo_name + ", customer_id=" + customer_id + ", dms_id=" + dms_id + ", type=" + type
		        + ", request_quantity=" + request_quantity + ", unit=" + unit + ", delivery_quantity="
		        + delivery_quantity + ", net_weight=" + net_weight + ", gross_weight=" + gross_weight
		        + ", package_info=" + package_info + ", error=" + error + "]";
	}

}
