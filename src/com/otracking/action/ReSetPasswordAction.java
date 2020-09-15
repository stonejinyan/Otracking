package com.otracking.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Staff;
import com.otracking.dao.StaffDao;
import com.otracking.tool.LogUtil;

public class ReSetPasswordAction extends ActionSupport {

	private String sesaid;
	private String old_password;
	private String new_password;
	private String confirm_password;
	StaffDao staffDao = new StaffDao();

	public String execute() throws Exception {
		ActionContext.getContext().getSession().remove("login_error");
		Staff staff = ((Staff) ActionContext.getContext().getSession().get("staff"));
		sesaid = staff.getSesaid();
		if (new_password == null || new_password.equals("")) {
			ActionContext.getContext().put("reset_password_error", "密码不能为空！");
			return "success";
		}
		if (staffDao.userLogin(sesaid, old_password) != null) {
			if (new_password.equals(confirm_password)) {
				int i = staffDao.updatePassword(sesaid, new_password);
				if (i == 1) {
					ActionContext.getContext().put("reset_password_error", "密码修改成功！<a href='home'>返回首页</a>");
					ActionContext.getContext().getSession().remove("reset_password_error");
					LogUtil.RollingFile.info(staff.getName() + "修改密码成功！");
				}
			} else {
				ActionContext.getContext().put("reset_password_error", "两次密码不一致！");
			}
		} else {
			ActionContext.getContext().put("reset_password_error", "原密码错误！");
		}
		return "success";
	}

	public String getSesaid() {
		return sesaid;
	}

	public void setSesaid(String sesaid) {
		this.sesaid = sesaid;
	}

	public String getOld_password() {
		return old_password;
	}

	public void setOld_password(String old_password) {
		this.old_password = old_password;
	}

	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

}
