package com.otracking.dao;

import java.util.List;

import com.otracking.bean.SeriesData;

public class EChartDao extends IBaseDao<SeriesData> {

	public List<SeriesData> GetAbnormalTypeCount() {
		String sql = "select interruption_recover_type as name,count(*) as value from interruptiontable where recover_time is null GROUP BY interruption_recover_type";
		return super.queryForMultiple(sql);
	}
}
