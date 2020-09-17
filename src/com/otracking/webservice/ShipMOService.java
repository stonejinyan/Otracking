package com.otracking.webservice;

import com.otracking.dao.MODao;
import com.otracking.tool.LogUtil;

public class ShipMOService {

	MODao moDao = new MODao();

	public String ship(String mo) {
		moDao.updateDeliveryTime(mo);
		LogUtil.RollingFile.info("ship:" + mo);
		return "success";
	}
}
