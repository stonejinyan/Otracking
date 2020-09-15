package com.otracking.webservice;

import com.otracking.tool.LogUtil;

public class ShipMOService {

	public String ship(String mo) {
		LogUtil.RollingFile.info("ship:" + mo);
		return "success";
	}
}
