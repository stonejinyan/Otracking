package com.otracking.bean;

import java.util.Date;

public class Edit_Bulk_Log_Table extends Edit_Bulk_Log {
	private String staff_name;

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public Edit_Bulk_Log_Table(int id, int staff_id, String field_name, String new_value, int bulk_id,
	        Date created_time, String staff_name) {
		super(id, staff_id, field_name, new_value, bulk_id, created_time);
		this.staff_name = staff_name;
	}

	public Edit_Bulk_Log_Table() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getField_name() {
		// TODO Auto-generated method stub
		String field_name = super.getField_name();
		System.out.println(field_name);
		switch (field_name) {
		case "smallest_unit":
			return "最小包装单位";
		case "smallest_unit_quantity":
			return "最小包装单位代表数量";
		case "delivery_unit":
			return "最小送货单位";
		case "delivery_quantity":
			return "最小送货单位代表数量";
		default:
			System.out.println("default");
			return field_name;
		}
	}

}
