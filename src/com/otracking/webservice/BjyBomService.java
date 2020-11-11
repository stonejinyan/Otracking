package com.otracking.webservice;

import com.otracking.dao.BJXBomDao;
import com.otracking.tool.LogUtil;
import com.otracking.webservice.bean.BJXBom;

public class BjyBomService {

	BJXBomDao bjxBomDao = new BJXBomDao();

	public BjyBomService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String importBjyBom(BJXBom bjxBom, String authentication) {
		LogUtil.RollingFile.info(authentication + "---BJXBOM:" + bjxBom);
		return "success";
	}
}
