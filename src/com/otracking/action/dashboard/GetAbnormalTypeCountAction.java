package com.otracking.action.dashboard;

import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.EChart;
import com.otracking.bean.SeriesData;
import com.otracking.dao.EChartDao;

public class GetAbnormalTypeCountAction extends ActionSupport {
	Gson gson = new Gson();

	public String execute() throws Exception {
		EChart eChart = new EChart();
		EChartDao eChartDao = new EChartDao();
		List<SeriesData> seriesDatas = eChartDao.GetAbnormalTypeCount();
		for (int i = 0; i < seriesDatas.size(); i++) {
			eChart.getLegendData().add(seriesDatas.get(i).getName());
			eChart.getSeriesData().add(seriesDatas.get(i));
			eChart.getSelected().add(true);
		}
		ActionContext.getContext().put("Json", gson.toJson(eChart));
		return "success";
	}
}
