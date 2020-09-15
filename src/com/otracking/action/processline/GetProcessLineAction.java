package com.otracking.action.processline;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.ProcessLine;
import com.otracking.bean.Source;
import com.otracking.dao.ProcessLineDao;

public class GetProcessLineAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String type;
	ProcessLineDao processLineDao = new ProcessLineDao();

	public String execute() throws Exception {
		List<ProcessLine> processLines = processLineDao.getAll();
		Gson gson = new Gson();
		if (type == null || !type.equals("source")) {
			ActionContext.getContext().put("Json", gson.toJson(processLines));
		} else {
			List<Source> sources = new ArrayList<Source>();
			for (int i = 0; i < processLines.size(); i++) {
				Source source = new Source();
				source.setValue(processLines.get(i).getId());
				source.setText(processLines.get(i).getName());
				sources.add(source);
			}
			ActionContext.getContext().put("Json", gson.toJson(sources));
		}
		return "success";

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
