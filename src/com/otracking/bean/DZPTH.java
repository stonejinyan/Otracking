package com.otracking.bean;

public class DZPTH {

	private String dms_id;
	private String headingline;
	private String description;
	private int sequence;
	private int order_id;

	public String getDms_id() {
		return dms_id;
	}

	public void setDms_id(String dms_id) {
		this.dms_id = dms_id;
	}

	public String getHeadingline() {
		return headingline;
	}

	public void setHeadingline(String headingline) {
		this.headingline = headingline;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public DZPTH() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DZPTH(String dms_id, String headingline, String description, int sequence, int order_id) {
		super();
		this.dms_id = dms_id;
		this.headingline = headingline;
		this.description = description;
		this.sequence = sequence;
		this.order_id = order_id;
	}

}
