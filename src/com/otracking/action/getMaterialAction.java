package com.otracking.action;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Material;

public class getMaterialAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		List<Material> materials = new ArrayList<Material>();
		/*
		 * Material material = new Material("LV429515-NPP-R",
		 * "Blue Cord End Terminals 2.5-14", 1, " A13170", "CCKB");
		 * materials.add(material); Material material2 = new Material("LV429516-NPP-R",
		 * "Blue Cord End Terminals 2.0-14", 1.5, " A13180", "KB");
		 * materials.add(material2); Material material3 = new Material("LV429517-NPP-R",
		 * "Blue Cord End Terminals 1.0-14", 3, " A13180", "PICK");
		 * materials.add(material3); Material_MO material_MO = new
		 * Material_MO("125035226", "AODX006180", materials);
		 */
		ActionContext.getContext().put("Json", gson.toJson(1));
		return "success";
	}
}
