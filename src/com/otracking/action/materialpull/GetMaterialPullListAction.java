package com.otracking.action.materialpull;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.MaterialPullTable;
import com.otracking.bean.ServerPagination;
import com.otracking.dao.MaterialPullTableDao;
import com.otracking.dao.Production_ScheduleDao;

public class GetMaterialPullListAction extends ActionSupport {

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	private int method_type_id;
	private int flag;
	private int limit;
	private int offset;
	private String order;
	private String search;
	private String sort;
	MaterialPullTableDao materialPullTableDao = new MaterialPullTableDao();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();

	@Override
	public String execute() throws Exception {
		if (sort == null || sort.equals("")) {
			sort = "id";
		}
		ServerPagination serverPagination = materialPullTableDao.getMaterialPullList(method_type_id, flag, offset,
		        limit, sort, order, search);
		List<MaterialPullTable> materialPullTables = serverPagination.getRow();
		List<MaterialPullTable> responsematerialPullTables = new ArrayList<>();

		for (int i = 0; i < materialPullTables.size(); i++) {
			MaterialPullTable materialPullTable = materialPullTables.get(i);
			materialPullTable.setMechanical_assembly_starttime(production_ScheduleDao
			        .getProduction_ScheduleByMo_IDAndMethod_Process_Type(materialPullTable.getMo_id(), 3)
			        .getActual_starttime());
			materialPullTable.setCubicle_cabling_starttime(production_ScheduleDao
			        .getProduction_ScheduleByMo_IDAndMethod_Process_Type(materialPullTable.getMo_id(), 5)
			        .getActual_starttime());
		}
		ActionContext.getContext().put("Json", gson.toJson(serverPagination));
		return "success";
	}

	public int getMethod_type_id() {
		return method_type_id;
	}

	public void setMethod_type_id(int method_type_id) {
		this.method_type_id = method_type_id;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

}
