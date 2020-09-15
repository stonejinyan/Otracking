package com.otracking.bean;

import java.util.Date;

public class Batch {

	private int id;
	private String name;
	private Date schedule_starttime;
	private Date schedule_endtime;
	private Date actual_starttime;
	private Date actual_endtime;
	private int order_id;
	private int No;
	private String WBS;
	private String Line;
	private String mo_type;
	private int quantity;
	private int drawer_quantity;
	private String outsource;
	private int accessory_case_quantity;
	private String p_staff;
	private String E_staff;
	private String M_staff;
	private int level_id;
	private Date material_arrive_time;
	private Date fattime;
	private String comments;
	private String batch;

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Date getFattime() {
		return fattime;
	}

	public void setFattime(Date fattime) {
		this.fattime = fattime;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getLevel_id() {
		return level_id;
	}

	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}

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

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	public String getWBS() {
		return WBS;
	}

	public void setWBS(String wBS) {
		WBS = wBS;
	}

	public String getLine() {
		return Line;
	}

	public void setLine(String line) {
		Line = line;
	}

	public String getMo_type() {
		return mo_type;
	}

	public void setMo_type(String mo_type) {
		this.mo_type = mo_type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDrawer_quantity() {
		return drawer_quantity;
	}

	public void setDrawer_quantity(int drawer_quantity) {
		this.drawer_quantity = drawer_quantity;
	}

	public String getOutsource() {
		return outsource;
	}

	public void setOutsource(String outsource) {
		this.outsource = outsource;
	}

	public int getAccessory_case_quantity() {
		return accessory_case_quantity;
	}

	public void setAccessory_case_quantity(int accessory_case_quantity) {
		this.accessory_case_quantity = accessory_case_quantity;
	}

	public String getP_staff() {
		return p_staff;
	}

	public void setP_staff(String p_staff) {
		this.p_staff = p_staff;
	}

	public String getE_staff() {
		return E_staff;
	}

	public void setE_staff(String e_staff) {
		E_staff = e_staff;
	}

	public String getM_staff() {
		return M_staff;
	}

	public void setM_staff(String m_staff) {
		M_staff = m_staff;
	}

	public Date getMaterial_arrive_time() {
		return material_arrive_time;
	}

	public void setMaterial_arrive_time(Date material_arrive_time) {
		this.material_arrive_time = material_arrive_time;
	}

}
