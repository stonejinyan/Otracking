package com.otracking.service;

import java.util.List;

import com.otracking.bean.Staff;
import com.otracking.dao.StaffDao;

public class StaffService {

	StaffDao staffDao = new StaffDao();

	public Staff userLogin(Staff staff) {
		return staffDao.userLogin(staff.getSesaid(), staff.getPassword());
	}

	public List<Staff> getAllStaff() {
		return staffDao.getAllStaff();
	}
}
