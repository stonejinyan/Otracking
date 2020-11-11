package com.otracking.service;

import com.otracking.dao.WIPDao;

public class WIPService {
	int method_Process[] = { 11, 12, 13, 3, 5, 22, 24, 31, 33, 40, 42, 49, 51, 58, 60, 71, 72, 65, 67 };
	WIPDao wipDao = new WIPDao();

	public double[] getWIPFlag1() {
		double WIPFlag1[] = new double[19];
		for (int i = 0; i < method_Process.length; i++) {
			WIPFlag1[i] = wipDao.getWIPFlag1(method_Process[i]);
		}
		return WIPFlag1;
	}

	public double[] getWIPFlag2() {
		double WIPFlag2[] = new double[19];
		for (int i = 0; i < method_Process.length; i++) {
			WIPFlag2[i] = wipDao.getWIPFlag2(method_Process[i]);
		}
		return WIPFlag2;
	}

	public double[] getWIPFlag3() {
		double WIPFlag3[] = new double[19];
		for (int i = 0; i < method_Process.length; i++) {
			WIPFlag3[i] = wipDao.getWIPFlag3(method_Process[i]);
		}
		return WIPFlag3;
	}

	public double getTotalWIP() {
		return wipDao.getWIPTotal(1);
	}

	public double getPackageWIP() {
		// TODO Auto-generated method stub
		return wipDao.getPackageWIP();
	}
}
