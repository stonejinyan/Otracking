package com.otracking.webservice;

import com.otracking.dao.BJXBomDao;
import com.otracking.tool.LogUtil;
import com.otracking.webservice.bean.BJXBom;

public class BJXBomService {

	BJXBomDao bjxBomDao = new BJXBomDao();

	public BJXBomService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String importBJXBom(BJXBom bjxBom, String authentication) {
		LogUtil.RollingFile.info(authentication + "---BJXBOM:" + bjxBom);
		return "success";
	}
}
