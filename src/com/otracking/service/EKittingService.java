package com.otracking.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.otracking.bean.EKitting;
import com.otracking.bean.MO;
import com.otracking.bean.Product_Type;
import com.otracking.bean.R_Method_Process_SAP_Method_Process;
import com.otracking.bean.Routing;
import com.otracking.dao.EKittingDao;
import com.otracking.dao.MODao;
import com.otracking.dao.Product_TypeDao;
import com.otracking.dao.R_Method_Process_SAP_Method_ProcessDao;
import com.otracking.dao.RoutingDao;

public class EKittingService {

	MODao moDao = new MODao();
	Product_TypeDao product_TypeDao = new Product_TypeDao();
	RoutingDao routingDao = new RoutingDao();
	R_Method_Process_SAP_Method_ProcessDao r_Method_Process_SAP_Method_ProcessDao = new R_Method_Process_SAP_Method_ProcessDao();
	EKittingDao eKittingDao = new EKittingDao();

	public String setPullPlan() {
		// TODO Auto-generated method stub
		List<MO> mos = moDao.getTomorrowSchedule();
		List<EKitting> eKittings = new ArrayList<EKitting>();
		for (int i = 0; i < mos.size(); i++) {
			MO mo = mos.get(i);
			Product_Type product_Type = product_TypeDao.findById(mo.getProduct_type_id());
			List<Routing> routings = routingDao.getByProductType_Id(product_Type.getId());
			for (int j = 0; j < routings.size(); j++) {
				Routing routing = routings.get(j);
				List<R_Method_Process_SAP_Method_Process> r_Method_Process_SAP_Method_Processes = r_Method_Process_SAP_Method_ProcessDao
				        .findByMethod_ProcessID(routing.getMethod_process_id());
				for (int k = 0; k < r_Method_Process_SAP_Method_Processes.size(); k++) {
					R_Method_Process_SAP_Method_Process r_Method_Process_SAP_Method_Process = r_Method_Process_SAP_Method_Processes
					        .get(k);
					eKittings.add(new EKitting(0, r_Method_Process_SAP_Method_Process.getSap_method_process_id(),
					        r_Method_Process_SAP_Method_Process.getMethod_process_id(), mo.getId(),
					        product_Type.getProcessline_id(), 1, null, 0));
				}
			}
			moDao.updateEKitting(mo);
		}
		int[] saves = eKittingDao.saveBatch(eKittings);
		return "EKitting设置完成：" + eKittings.size() + ";";
	}

	@Test
	public void test() {
		setPullPlan();
	}
}
