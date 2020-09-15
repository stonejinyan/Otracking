package com.otracking.webservice.bean;

import java.util.Date;

public class MOTable extends MO {

	private String order_name;
	private String batch_name;
	private String product_type_name;
	private String product_bigtype_name;
	private String processline;
	private String WBS;
	private String SO;
	private int processline_id;
	private int order_id;

	public String getSO() {
		return SO;
	}

	public void setSO(String sO) {
		SO = sO;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProcessline_id() {
		return processline_id;
	}

	public void setProcessline_id(int processline_id) {
		this.processline_id = processline_id;
	}

	public String getProcessline() {
		return processline;
	}

	public void setProcessline(String processline) {
		this.processline = processline;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public String getProduct_type_name() {
		return product_type_name;
	}

	public void setProduct_type_name(String product_type_name) {
		this.product_type_name = product_type_name;
	}

	public String getProduct_bigtype_name() {
		return product_bigtype_name;
	}

	public void setProduct_bigtype_name(String product_bigtype_name) {
		this.product_bigtype_name = product_bigtype_name;
	}

	public String getWBS() {
		return WBS;
	}

	public void setWBS(String wBS) {
		WBS = wBS;
	}

	public MOTable(int id, String name, Date schedule_starttime, Date schedule_endtime, Date actual_starttime,
	        Date actual_endtime, int batch_id, int product_type_id, int scheduling, String securityCode,
	        double quantity, String dms_id, int no, String description, String customID, int ekitting,
	        String order_name, String batch_name, String product_type_name, String product_bigtype_name,
	        String processline, String wBS, String sO, int processline_id, int order_id) {
		super(id, name, schedule_starttime, schedule_endtime, actual_starttime, actual_endtime, batch_id,
		        product_type_id, scheduling, securityCode, quantity, dms_id, no, description, customID, ekitting);
		this.order_name = order_name;
		this.batch_name = batch_name;
		this.product_type_name = product_type_name;
		this.product_bigtype_name = product_bigtype_name;
		this.processline = processline;
		WBS = wBS;
		SO = sO;
		this.processline_id = processline_id;
		this.order_id = order_id;
	}

	public MOTable() {
		super();
		// TODO Auto-generated constructor stub
	}

}
