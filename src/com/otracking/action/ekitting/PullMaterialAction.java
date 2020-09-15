package com.otracking.action.ekitting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.EKittingTable;
import com.otracking.bean.Staff;
import com.otracking.dao.EKittingDao;
import com.otracking.dao.EKittingTableDao;
import com.otracking.webservice.client.SAPEKittingClient;

public class PullMaterialAction extends ActionSupport {

	EKittingTableDao eKittingTableDao = new EKittingTableDao();
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	SAPEKittingClient sapeKittingClient = new SAPEKittingClient();
	EKittingDao eKittingDao = new EKittingDao();
	private int id;

	public String execute() throws Exception {
		Staff staff = (Staff) ActionContext.getContext().getSession().get("staff");
		EKittingTable eKittingTable = eKittingTableDao.findByID(id);
		String returnCode = sapeKittingClient.pullMaterial(eKittingTable.getMo_name(),
		        eKittingTable.getSap_method_process(), eKittingTable.getProcessline_sap(),
		        (int) eKittingTable.getQuantity() + "");
		if (returnCode.equals("S01")) {
			eKittingDao.updateEKittingList(id, staff.getId(), 1);
			ActionContext.getContext().put("Json", gson.toJson("拉动成功:" + returnCode));
		} else {
			ActionContext.getContext().put("Json", gson.toJson("拉动失败：" + returnCode));
		}
		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
