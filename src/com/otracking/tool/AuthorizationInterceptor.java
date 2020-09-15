package com.otracking.tool;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorizationInterceptor extends AbstractInterceptor {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String ignoreActions;

	// ignoreActions属性的getter方法
	public String getIgnoreActios() {
		return ignoreActions;
	}

	// ignoreActions属性的setter方法
	public void setIgnoreActions(String ignoreActions) {
		this.ignoreActions = ignoreActions;
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = invocation.getInvocationContext();
		Map<String, Object> session = ctx.getSession();
		Object user = session.get("staff");
		boolean ignore = false;
		String currentAction = invocation.getProxy().getActionName();
		String[] actions = ignoreActions.split(",");

		for (String action : actions) {
			if (currentAction.matches(action.trim())) {
				ignore = true;
				break;
			}
		}
		if (user != null || ignore == true) {
			return invocation.invoke();
		} else {
			// System.out.println("执行拦截器");
			// 获取HttpServletRequest对象
			HttpServletRequest req = ServletActionContext.getRequest();
			// 获取此请求的地址，请求地址包含application name，进行subString操作，去除application name
			// System.out.println(req.getRequestURI());
			String path = req.getRequestURI().substring(11);
			// 获得请求中的参数
			String queryString = req.getQueryString();
			// 预防空指针
			if (queryString == null) {
				queryString = "";
			}
			// 拼凑得到登陆之前的地址
			String realPath = path + "?" + queryString;
			// System.out.println(realPath);
			// 存入session，方便调用
			session.put("prePage", realPath);
			return Action.LOGIN;
		}
	}
}
