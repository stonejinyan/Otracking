package com.otracking.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Staff;
import com.otracking.service.StaffService;
import com.otracking.tool.LogUtil;

public class UserLoginAction extends ActionSupport {
	StaffService staffService = new StaffService();
	Staff loginStaff = new Staff();
	private String error = "123";
	private String prePage;
	
	public String execute() throws Exception {

		Staff staff = staffService.userLogin(loginStaff);
		if (staff != null) {
			// ActionContext.getContext().getSession().remove("error");
			ActionContext.getContext().getSession().put("staff", staff);
			LogUtil.RollingFile.info(staff.getName() + "登录成功");
			ActionContext.getContext().getSession().remove("login_error");
			if (loginStaff.getPassword().equals("123") || loginStaff.getPassword().equals("123456")) {
				ActionContext.getContext().getSession().put("reset_password_error", "请勿使用初始密码！");
				return "ResetPassword";
			} else {
				// 获取跳转到登陆界面之前的页面地址，由拦截器提供
				prePage = (String) ActionContext.getContext().getSession().get("prePage");
				// 清除session中的数据
				ActionContext.getContext().getSession().remove("prePage");
				if (prePage == null) {
					// 不是拦截器跳转到登陆页面的，直接访问的登陆页面
					return "home";
				} else {
					return SUCCESS;
				}
			}
		} else {
			// System.out.println("save error message");
			error = "账号或密码错误";
			ActionContext.getContext().getSession().put("login_error", error);
			return Action.LOGIN;
		}
	}

	public Staff getLoginStaff() {
		return loginStaff;
	}

	public void setLoginStaff(Staff loginStaff) {
		this.loginStaff = loginStaff;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPrePage() {
		return prePage;
	}

	public void setPrePage(String prePage) {
		this.prePage = prePage;
	}

}
