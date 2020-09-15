package com.otracking.webservice;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.otracking.bean.SEEEOrder;
import com.otracking.dao.OrderDao;
import com.otracking.dao.StaffDao;
import com.otracking.tool.LogUtil;

public class GetPMInfoBySOService {

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	OrderDao orderDao = new OrderDao();
	StaffDao staffDao = new StaffDao();

	public String getPMInfoBySO(String so) {
		String json = "{}";
		SEEEOrder seeeOrder = orderDao.queryBySO(so);
		if (seeeOrder != null) {
			json = gson.toJson(staffDao.findById(seeeOrder.getPm_id()));
		}
		LogUtil.RollingFile.info(json);
		return json;
	}

	@Test
	public void test() {
		System.out.println(getPMInfoBySO("7004313"));
	}
}
