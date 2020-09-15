package com.otracking.bean;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;

public class MaterialPullTable {

	@CsvBindByName(column = "ID", required = true)
	private int id;
	@CsvBindByName(column = "mo_id", required = false)
	private int mo_id;
	@CsvBindByName(column = "订单名称", required = false)
	private String order_name;
	@CsvBindByName(column = "Batch", required = false)
	private String batch_name;
	@CsvBindByName(column = "MO", required = false)
	private String name;
	@CsvBindByName(column = "AOP", required = false)
	private String dms_id;
	@CsvBindByName(column = "method_type_id", required = false)
	private int method_type_id;
	@CsvBindByName(column = "", required = false)
	private Date pull_time;
	@CsvBindByName(column = "", required = false)
	private int no;
	@CsvBindByName(column = "", required = false)
	private Date schedule_starttime;
	@CsvBindByName(column = "", required = false)
	private Date schedule_endtime;
	@CsvBindByName(column = "", required = false)
	private Date mechanical_assembly_starttime;
	@CsvBindByName(column = "", required = false)
	private Date cubicle_cabling_starttime;
	@CsvBindByName(column = "flag", required = false)
	private int flag;
	@CsvBindByName(column = "产线", required = true)
	private String processline;
	@CsvBindByName(column = "产品类型", required = false)
	private String family;
	@CsvBindByName(column = "产品型号", required = false)
	private String type;
	@CsvBindByName(column = "物料名称", required = false)
	private String material_name;
	@CsvBindByName(column = "物料描述", required = false)
	private String material_description;
	@CsvBindByName(column = "quantity", required = false)
	private double quantity;

	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getMaterial_name() {
		return material_name;
	}

	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}

	public String getMaterial_description() {
		return material_description;
	}

	public void setMaterial_description(String material_description) {
		this.material_description = material_description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDms_id() {
		return dms_id;
	}

	public void setDms_id(String dms_id) {
		this.dms_id = dms_id;
	}

	public int getMethod_type_id() {
		return method_type_id;
	}

	public void setMethod_type_id(int method_type_id) {
		this.method_type_id = method_type_id;
	}

	public Date getPull_time() {
		return pull_time;
	}

	public void setPull_time(Date pull_time) {
		this.pull_time = pull_time;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public Date getMechanical_assembly_starttime() {
		return mechanical_assembly_starttime;
	}

	public void setMechanical_assembly_starttime(Date mechanical_assembly_starttime) {
		this.mechanical_assembly_starttime = mechanical_assembly_starttime;
	}

	public Date getCubicle_cabling_starttime() {
		return cubicle_cabling_starttime;
	}

	public void setCubicle_cabling_starttime(Date cubicle_cabling_starttime) {
		this.cubicle_cabling_starttime = cubicle_cabling_starttime;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getProcessline() {
		return processline;
	}

	public void setProcessline(String processline) {
		this.processline = processline;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
