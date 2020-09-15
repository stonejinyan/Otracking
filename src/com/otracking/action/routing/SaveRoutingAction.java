package com.otracking.action.routing;

import org.apache.logging.log4j.LogManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Routing;
import com.otracking.dao.RoutingDao;

public class SaveRoutingAction extends ActionSupport {
	Routing routing = new Routing();
	RoutingDao routingDao = new RoutingDao();

	public String execute() throws Exception {
		if (routing.getDt() >= 0 && routing.getMethod_process_id() > 0 && routing.getSequence() >= 0
		        && routing.getTt() >= 0 && routing.getType_id() >= 0) {
			routingDao.save(routing);
			LogManager.getLogger()
			        .info(ActionContext.getContext().getSession().get("staff") + " 新增一个batch ：" + routing);
		}
		ActionContext.getContext().put("active", "Maintain");
		return "success";

	}

	public Routing getRouting() {
		return routing;
	}

	public void setRouting(Routing routing) {
		this.routing = routing;
	}

}
