package com.otracking.webservice;

import com.otracking.bean.DatabaseMaterial;
import com.otracking.bean.MO;
import com.otracking.bean.Material_MO;
import com.otracking.dao.DatabaseMaterialDao;
import com.otracking.dao.MODao;
import com.otracking.tool.LogUtil;

public class BomService {

	DatabaseMaterialDao databaseMaterialDao = new DatabaseMaterialDao();
	MODao moDao = new MODao();

	public BomService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String importBom(Material_MO material_MO, String authentication) throws InterruptedException {
		LogUtil.RollingFile.info(material_MO);
		MO mo = moDao.findByName(material_MO.getAUFNR().substring(3));
		if (mo != null) {
			if (databaseMaterialDao.countByMO_id(mo.getId()) != 0) {
				databaseMaterialDao.updateActiveByMO_id(mo);
			}
			for (int i = 0; i < material_MO.getMaterials().length; i++) {
				databaseMaterialDao.save(new DatabaseMaterial(0, material_MO.getAUFNR(), material_MO.getC_MATNR(),
				        mo.getId(), 1, null, material_MO.getMaterials()[i]));
			}
		} else {
			LogUtil.RollingFile.info("未找到MO" + material_MO);
		}
		return "import success";
	}
}
