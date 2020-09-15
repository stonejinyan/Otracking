package com.otracking.webservice;

import java.util.List;

import com.otracking.bean.EasergyPosition;
import com.otracking.dao.EasergyPositionDao;

public class GetEasergyPositionListService {

	EasergyPositionDao easergyPositionDao = new EasergyPositionDao();

	public EasergyPosition[] getEasergyPositionList(EasergyPosition easergyPosition) {
		List<EasergyPosition> dbEasergyPositions = easergyPositionDao.getNoEasergy_idList(easergyPosition);
		EasergyPosition[] easergyPositions = new EasergyPosition[dbEasergyPositions.size()];
		for (int i = 0; i < dbEasergyPositions.size(); i++) {
			easergyPositions[i] = dbEasergyPositions.get(i);
		}
		return easergyPositions;
	}

	public GetEasergyPositionListService() {
		super();
		// TODO Auto-generated constructor stub
	}

}
