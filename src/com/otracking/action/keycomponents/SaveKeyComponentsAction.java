package com.otracking.action.keycomponents;

import org.apache.logging.log4j.LogManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.KeyComponents;
import com.otracking.dao.KeyComponentsDao;

public class SaveKeyComponentsAction extends ActionSupport {
	private String name;
	private String components_id;
	KeyComponentsDao keyComponentsDao = new KeyComponentsDao();

	public String execute() throws Exception {
		if (name != null && name != "" && !name.equals("")) {
			KeyComponents keyComponents = new KeyComponents();
			keyComponents.setName(name);
			keyComponents.setComponents_id(components_id);
			keyComponentsDao.save(keyComponents);
			LogManager.getLogger()
			        .info(ActionContext.getContext().getSession().get("staff") + " 新增一个关键物料 ：" + keyComponents);
		}
		ActionContext.getContext().put("active", "Maintain");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComponents_id() {
		return components_id;
	}

	public void setComponents_id(String components_id) {
		this.components_id = components_id;
	}

}
