package com.otracking.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Production_ScheduleTable {

	private int id;
	private Date schedule_starttime;
	private Date schedule_endtime;
	private Date actual_starttime;
	private Date actual_endtime;
	private Date deliver_time;
	private Date mo_schedule_starttime;
	private String mo_name;
	private String batch_name;
	private String order_name;
	private String product_type_name;
	private int product_type_id;
	private String product_bigtype_name;
	private String flag;
	private int production_status;
	private int no;
	private double quantity;
	private String dms_id;
	private String processline;
	private String main_line;
	private String method_process;
	private String cubicle_cabling;
	private BigDecimal plt;

	public String getMain_line() {
		return main_line;
	}

	public void setMain_line(String main_line) {
		this.main_line = main_line;
	}

	

	public String getMethod_process() {
		return method_process;
	}

	public void setMethod_process(String method_process) {
		this.method_process = method_process;
	}

	public String getCubicle_cabling() {
		return cubicle_cabling;
	}

	public void setCubicle_cabling(String cubicle_cabling) {
		this.cubicle_cabling = cubicle_cabling;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getProcessline() {
		return processline;
	}

	public void setProcessline(String processline) {
		this.processline = processline;
	}

	public String getDms_id() {
		return dms_id;
	}

	public void setDms_id(String dms_id) {
		this.dms_id = dms_id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getSchedule_starttime() {
		return schedule_starttime;
	}

	public void setSchedule_starttime(Date schedule_starttime) {
		this.schedule_starttime = schedule_starttime;
	}

	public Date getSchedule_endtime() {
		return schedule_endtime;
	}

	public void setSchedule_endtime(Date schedule_endtime) {
		this.schedule_endtime = schedule_endtime;
	}

	public Date getActual_starttime() {
		return actual_starttime;
	}

	public void setActual_starttime(Date actual_starttime) {
		this.actual_starttime = actual_starttime;
	}

	public Date getActual_endtime() {
		return actual_endtime;
	}

	public void setActual_endtime(Date actual_endtime) {
		this.actual_endtime = actual_endtime;
	}

	public String getMo_name() {
		return mo_name;
	}

	public void setMo_name(String mo_name) {
		this.mo_name = mo_name;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getProduction_status() {
		return production_status;
	}

	public void setProduction_status(int production_status) {
		this.production_status = production_status;
	}

	public int getProduct_type_id() {
		return product_type_id;
	}

	public void setProduct_type_id(int product_type_id) {
		this.product_type_id = product_type_id;
	}

	public Date getDeliver_time() {
		return deliver_time;
	}

	public void setDeliver_time(Date deliver_time) {
		this.deliver_time = deliver_time;
	}

	public Date getMo_schedule_starttime() {
		return mo_schedule_starttime;
	}

	public void setMo_schedule_starttime(Date mo_schedule_starttime) {
		this.mo_schedule_starttime = mo_schedule_starttime;
	}

	public BigDecimal getPlt() {
		return plt;
	}

	public void setPlt(BigDecimal plt) {
		this.plt = plt;
	}

}
