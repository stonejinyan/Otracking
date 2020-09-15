package com.otracking.webservice;

import java.util.List;

import com.otracking.bean.DZPTH;
import com.otracking.dao.DZPTHDao;

public class GetDZPInfoByAOPService {

	DZPTHDao dzpthDao = new DZPTHDao();

	public GetDZPInfoByAOPService() {
		// TODO Auto-generated constructor stub
		super();
	}

	public DZPTH[] getDZPInfoByAOP(String dms_id, int order_id) {
		List<DZPTH> dzpthsList = dzpthDao.getByMO_AOP(dms_id, order_id);
		DZPTH[] dzpths = new DZPTH[dzpthsList.size()];
		for (int i = 0; i < dzpthsList.size(); i++) {
			dzpths[i] = dzpthsList.get(i);
		}
		return dzpths;
	}
}
