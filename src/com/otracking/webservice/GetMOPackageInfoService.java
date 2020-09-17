package com.otracking.webservice;

import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.otracking.bean.DatabaseMaterial;
import com.otracking.bean.MOPackageInfo;
import com.otracking.bean.MOTable;
import com.otracking.dao.DatabaseMaterialDao;
import com.otracking.dao.MODao;
import com.otracking.dao.MOTableDao;
import com.otracking.tool.LogUtil;

public class GetMOPackageInfoService {

	public GetMOPackageInfoService() {
		// TODO Auto-generated constructor stub
	}

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
	DatabaseMaterialDao databaseMaterialDao = new DatabaseMaterialDao();
	MODao moDao = new MODao();

	public String getZXDInfoByMO(String mo) {
		LogUtil.RollingFile.info("接收请求(MO:" + mo + ")");
		MOPackageInfo moPackageInfo;
		MOTableDao moTableDao = new MOTableDao();
		MOTable moTable = moTableDao.getByName(mo);
		if (moTable != null) {
			LogUtil.RollingFile.info("MOTable查询已完成!");
			int no = 1;
			String sale_order = moTable.getSO();
			String order_name = moTable.getOrder_name();
			String wbs = moTable.getWBS();
			String mo_name = moTable.getName();
			String customer_id = moTable.getCustomID();
			String dms_id = moTable.getDms_id();
			String model = moTable.getProduct_bigtype_name();
			String type = moTable.getProduct_type_name();
			double request_quantity = moTable.getQuantity();
			String unit = "台";
			double delivery_quantity = moTable.getQuantity();
			double net_weight = 0;
			double gross_weight = 0;
			String package_info = "";
			List<DatabaseMaterial> databaseMaterial = databaseMaterialDao.queryByMO_id(moTable.getId());
			if (databaseMaterial != null) {
				for (int i = 0; i < databaseMaterial.size(); i++) {
					String materialNO = databaseMaterial.get(i).getR_MATNR();
					String packageDescription = databaseMaterial.get(i).getMAKTX();
					// LogUtil.RollingFile.info("包装信息：" + packageDescription);
					if (materialNO.startsWith("OK9") && !packageDescription.contains("MT")) {
						package_info = packageDescription;
						LogUtil.RollingFile.info("设置包装信息：" + packageDescription);
					}
				}
			}
			String error = "200";
			moPackageInfo = new MOPackageInfo(no, sale_order, order_name + wbs, wbs, mo_name, customer_id, dms_id,
			        model, type, request_quantity, unit, delivery_quantity, net_weight, gross_weight, package_info,
			        error);
		} else {
			moPackageInfo = new MOPackageInfo();
			moPackageInfo.setError("MO不存在，请确认条码信息！");
			LogUtil.RollingFile.info("MO不存在，请确认MO信息！");
		}
		LogUtil.RollingFile.info(moPackageInfo);
		LogUtil.RollingFile.info("返回数据(MO:" + mo + ")");
		System.out.println(gson.toJson(new MOPackageInfo[] { moPackageInfo }));
		moDao.updatePackageTime(mo);
		return gson.toJson(new MOPackageInfo[] { moPackageInfo });
	}

	@Test
	public void test() {
		getZXDInfoByMO("128115963");
	}
}
