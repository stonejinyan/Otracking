package com.otracking.dao;

/*------------------------------------------------------
 * StaffDao.java 
 * 数据库接口
 * @author  songjinyan
 * @version 1.0, 2018/7/24
 * 
 *-----------------------------------------------------*/
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.otracking.bean.Staff;
import com.otracking.tool.JDBCUtils;
import com.otracking.tool.MD5Utils;

public class StaffDao extends IBaseDao<Staff> {

	public static final String tableName = "staff";

	public Staff getStaffBySESAID(String sesaid) {
		return super.findById(sesaid, tableName);
	}

	public Staff userLogin(String sesaid, String password) {
		String sql = "select id,sesaid,name,sellphone,role_id from staff where sesaid = ? and password = ?";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		Staff staff;
		try {
			staff = queryRunner.query(sql, new BeanHandler<Staff>(Staff.class), sesaid, MD5Utils.md5(password));
			if (staff != null) {
				return staff;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		String sql = "select id,sesaid,name,sellphone from staff";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			List<Staff> list = queryRunner.query(sql, new BeanListHandler<Staff>(Staff.class));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Staff findById(int id) {
		// TODO Auto-generated method stub
		String sql = "select id,sesaid,name,sellphone,email,role_id,workstation_id from staff where id = ?";
		return super.queryForSingle(sql, id);
	}

	public int updatePassword(String sesaid, String new_password) {
		String sql = "update staff set password = ? where sesaid = ?";
		return super.update(sql, MD5Utils.md5(new_password), sesaid);

	}

}
