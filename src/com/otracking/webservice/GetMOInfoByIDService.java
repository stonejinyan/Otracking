package com.otracking.webservice;

import com.otracking.dao.MOTableDao;
import com.otracking.webservice.bean.MOTable;

public class GetMOInfoByIDService {

	MOTableDao moTableDao = new MOTableDao();

	public GetMOInfoByIDService() {
		super();
		// TODO Auto-generated constructor stub
	}

	// MOTable有风险
	public MOTable getMOByID(int id) {
		com.otracking.bean.MOTable mo = moTableDao.getByID(id);
		return new MOTable(mo.getId(), mo.getName(), mo.getSchedule_starttime(), mo.getSchedule_endtime(),
		        mo.getActual_starttime(), mo.getActual_endtime(), mo.getBatch_id(), mo.getProduct_type_id(),
		        mo.getScheduling(), mo.getSecurityCode(), mo.getQuantity(), mo.getDms_id(), mo.getNo(),
		        mo.getDescription(), mo.getCustomID(), mo.getEkitting(), mo.getOrder_name(), mo.getBatch_name(),
		        mo.getProduct_type_name(), mo.getProduct_bigtype_name(), mo.getProcessline(), mo.getWBS(), mo.getSO(),
		        mo.getProcessline_id(), mo.getOrder_id());
	}

}
