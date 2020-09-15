package com.otracking.bean;

import java.util.ArrayList;
import java.util.List;

public class EChart {

	private List<String> legendData = new ArrayList<>();
	private List<SeriesData> seriesData = new ArrayList<>();
	private List<Boolean> selected = new ArrayList<>();

	public List<String> getLegendData() {
		return legendData;
	}

	public void setLegendData(List<String> legendData) {
		this.legendData = legendData;
	}

	public List<SeriesData> getSeriesData() {
		return seriesData;
	}

	public void setSeriesData(List<SeriesData> seriesData) {
		this.seriesData = seriesData;
	}

	public List<Boolean> getSelected() {
		return selected;
	}

	public void setSelected(List<Boolean> selected) {
		this.selected = selected;
	}

}
