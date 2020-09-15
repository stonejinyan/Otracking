package com.otracking.test.dao;

import org.junit.Test;

import com.otracking.dao.MODao;

public class BranchDaoTest {

	MODao mODao = new MODao();

	@Test
	public void test() {
		System.out.println(mODao.insertSecurityCode("124912599", "13131"));
	}
}
