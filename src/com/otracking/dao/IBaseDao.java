/**
 * <p>Title: IBaseImpl.java</p>
 * <p>Copyright: stonejinyan 2013</p>
 * <p>Company: 指尖创维</p>
 * @date 2013-7-3
 * @version 1.0
 */
package com.otracking.dao;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.otracking.tool.DateUtil;
import com.otracking.tool.JDBCUtils;
import com.otracking.tool.LogUtil;

/**
 * <p>
 * Title: IBaseImpl
 * </p>
 * <p>
 * Description: IBaseDao的实现类
 * </p>
 * 
 * @author songjinyan @date   2013-7-3
 */
public class IBaseDao<T> {

	private Class<T> entityClass;
	protected DataSource DATA_SOURCE = JDBCUtils.getDataSource();

	// 利用构造函数获取实体的class
	@SuppressWarnings("unchecked")
	public IBaseDao() {
		entityClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
		        .getActualTypeArguments()[0];
	}

	/*
	 * （非 Javadoc） <p>Title: findById</p> <p>Description: </p>
	 * 
	 * @param <T>
	 * 
	 * @param id
	 * 
	 * @param tableName
	 * 
	 * @return
	 * 
	 * @throws SQLException
	 * 
	 * @see com.zjcw.dao.IBaseDao#findById(java.io.Serializable, java.lang.String)
	 */
	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> T findById(Serializable id, String tableName) {
		String sql = "select * from " + tableName + " where id = ?";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());

		T t;
		try {
			t = queryRunner.query(sql, new BeanHandler<T>((Class<T>) entityClass), id);
			return t;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;

	}

	/*
	 * （非 Javadoc） <p>Title: delete</p> <p>Description: </p>
	 * 
	 * @param id
	 * 
	 * @param tableName
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#delete(java.io.Serializable, java.lang.String)
	 */
	public int delete(Serializable id, String tableName) {
		String sql = "delete from " + tableName + " where id = ?";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			int i = queryRunner.update(sql, id);
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return 0;
	}

	/*
	 * （非 Javadoc） <p>Title: findByForeignId</p> <p>Description: </p>
	 * 
	 * @param <T>
	 * 
	 * @param id
	 * 
	 * @param tableName
	 * 
	 * @param columName
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#findByForeignId(java.io.Serializable,
	 * java.lang.String, java.lang.String)
	 */
	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> List<T> findByForeignId(Serializable id, String tableName, String columName) {
		String sql = "select * from " + tableName + " where " + columName + " = ?";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<T> list;
		try {
			list = queryRunner.query(sql, new BeanListHandler<T>((Class<T>) entityClass), id);
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> List<T> findByForeignId(Serializable id, String tableName, String columName, String orderColum) {
		String sql = "select * from " + tableName + " where " + columName + " = ? order by ?";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<T> list;
		try {
			list = queryRunner.query(sql, new BeanListHandler<T>((Class<T>) entityClass), id, orderColum);
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> List<T> getAll(String tableName) {
		String sql = "select * from " + tableName;
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<T> list;
		try {
			list = queryRunner.query(sql, new BeanListHandler<T>((Class<T>) entityClass));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> List<T> getAll(String tableName, String orderBy) {
		String sql = "select * from " + tableName + " order by " + orderBy;
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<T> list;
		try {
			list = queryRunner.query(sql, new BeanListHandler<T>((Class<T>) entityClass));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> List<T> getAll(String tableName, int offset, int limit, String order) {
		String sql = "select * from " + tableName + " order by id " + order + " limit " + offset + "," + limit;
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<T> list;
		try {
			list = queryRunner.query(sql, new BeanListHandler<T>((Class<T>) entityClass));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> List<T> getAll(String tableName, int offset, int limit, String order, String orderBy) {
		String sql = "select * from " + tableName + " order by " + orderBy + " " + order + " limit " + offset + ","
		        + limit;
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<T> list;
		try {
			list = queryRunner.query(sql, new BeanListHandler<T>((Class<T>) entityClass));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> getAll1(String tableName, int offset, int limit, String order, String orderBy, String sql,
	        Object... params) {
		String mysql = "select * from " + tableName + " " + sql + " order by " + orderBy + " " + order + " limit "
		        + offset + "," + limit;
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<T> list;
		try {
			list = queryRunner.query(mysql, new BeanListHandler<T>((Class<T>) entityClass), params);
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	/*
	 * （非 Javadoc） <p>Title: queryForMultiple</p> <p>Description: </p>
	 * 
	 * @param <T>
	 * 
	 * @param sql
	 * 
	 * @param params
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#queryForMultiple(java.lang.String,
	 * java.lang.Object[])
	 */
	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> List<T> queryForMultiple(String sql, Object... params) {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<T> list;
		try {
			list = queryRunner.query(sql, new BeanListHandler<T>((Class<T>) entityClass), params);
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	/*
	 * （非 Javadoc） <p>Title: queryForSingle</p> <p>Description: </p>
	 * 
	 * @param <T>
	 * 
	 * @param sql
	 * 
	 * @param params
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#queryForSingle(java.lang.String,
	 * java.lang.Object[])
	 */
	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> T queryForSingle(String sql, Object... params) {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			T t = queryRunner.query(sql, new BeanHandler<T>((Class<T>) entityClass), params);
			return t;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	/*
	 * （非 Javadoc） <p>Title: save</p> <p>Description: </p>
	 * 
	 * @param entity
	 * 
	 * @param tableName
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#save(java.lang.Object, java.lang.String)
	 */
	public boolean save(Object entity, String tableName) {

		Object myentity = entity;
		StringBuilder phn = new StringBuilder("("); // 占位符构造器
		StringBuilder columnnames = new StringBuilder("("); // 列名构造器
		Object[] params = null; // 占位符对应参数
		try {
			// 利用反射获取实体描述符
			BeanInfo beanInfo = Introspector.getBeanInfo(myentity.getClass());
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			params = new Object[descriptors.length - 1];// 根据实体中字段的数量创建params -1
			// 去掉class
			int flag = 0; // params使用标志
			for (int i = 0; i < descriptors.length; i++) {
				if (!descriptors[i].getName().equals("class")) { // 获取实体中的非class字段
					Method readMethod = descriptors[i].getReadMethod(); // 获取get方法
					if (!descriptors[i].getName().equals("id")) { // id主键自动生成，设成null
						params[flag] = readMethod.invoke(myentity);
					} else {
						params[flag] = null;
					}
					flag++;
					columnnames.append(descriptors[i].getName()).append(",");
					phn.append("?").append(",");
				}
			}
		} catch (IllegalArgumentException e1) {
			LogUtil.RollingFile.error(e1.getMessage());
			e1.printStackTrace();
		} catch (IntrospectionException e1) {
			LogUtil.RollingFile.error(e1.getMessage());
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			LogUtil.RollingFile.error(e1.getMessage());
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			LogUtil.RollingFile.error(e1.getMessage());
			e1.printStackTrace();
		}
		columnnames.deleteCharAt(columnnames.length() - 1);// 删除多余的","
		columnnames.append(")");
		phn.deleteCharAt(phn.length() - 1);// 删除多余的","
		phn.append(")");

		String sql = "insert into " + tableName + columnnames + " values" + phn;
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			queryRunner.update(sql, params);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
			return false;
		}

	}

	public int[] saveBatch(List entitys, String tableName) {

		List myentitys = entitys;
		StringBuilder phn = new StringBuilder("("); // 占位符构造器
		StringBuilder columnnames = new StringBuilder("("); // 列名构造器
		Object[][] params = null; // 占位符对应参数
		if (myentitys.size() != 0) {

			try {
				// 利用反射获取实体描述符
				BeanInfo beanInfo = Introspector.getBeanInfo(myentitys.get(0).getClass());
				PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
				params = new Object[myentitys.size()][descriptors.length - 1];// 根据实体中字段的数量创建params -1
				// 去掉class
				int flag = 0; // params使用标志
				for (int i = 0; i < descriptors.length; i++) {
					if (!descriptors[i].getName().equals("class")) { // 获取实体中的非class字段
						Method readMethod = descriptors[i].getReadMethod(); // 获取get方法
						if (!descriptors[i].getName().equals("id")) { // id主键自动生成，设成null
							for (int j = 0; j < params.length; j++) {
								params[j][flag] = readMethod.invoke(myentitys.get(j));
							}
						} else {
							for (int j = 0; j < params.length; j++) {
								params[j][flag] = null;
							}
						}
						flag++;
						columnnames.append(descriptors[i].getName()).append(",");
						phn.append("?").append(",");
					}
				}
			} catch (IllegalArgumentException e1) {
				LogUtil.RollingFile.error(e1.getMessage());
				e1.printStackTrace();
			} catch (IntrospectionException e1) {
				LogUtil.RollingFile.error(e1.getMessage());
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				LogUtil.RollingFile.error(e1.getMessage());
				e1.printStackTrace();
			} catch (InvocationTargetException e1) {
				LogUtil.RollingFile.error(e1.getMessage());
				e1.printStackTrace();
			}
			columnnames.deleteCharAt(columnnames.length() - 1);// 删除多余的","
			columnnames.append(")");
			phn.deleteCharAt(phn.length() - 1);// 删除多余的","
			phn.append(")");

			String sql = "insert into " + tableName + columnnames + " values" + phn;
			QueryRunner queryRunner = new QueryRunner(DATA_SOURCE);
			try {
				int[] f = queryRunner.batch(sql, params);
				return f;
			} catch (SQLException e) {
				e.printStackTrace();
				LogUtil.RollingFile.error(e.getMessage());
				return null;
			}
		} else {
			return null;
		}

	}

	/*
	 * （非 Javadoc） <p>Title: update</p> <p>Description: </p>
	 * 
	 * @param entity
	 * 
	 * @param tableName
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#update(java.lang.Object, java.lang.String)
	 */
	public int update(Object entity, String tableName, String[] noUpdates) {
		Object myentity = entity;
		StringBuilder columnnames = new StringBuilder("");// 列名构造器
		Object[] params = null; // 占位符对应参数
		try {
			// 利用反射获取实体描述符
			BeanInfo beanInfo = Introspector.getBeanInfo(myentity.getClass());
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			params = new Object[descriptors.length - 1 - noUpdates.length];// 根据实体中字段的数量创建params -1
			// 去掉class
			int flag = 0;// params使用标志
			for (int i = 0; i < descriptors.length; i++) {
				if (!descriptors[i].getName().equals("class")) {// 获取实体中的非class字段
					Method readMethod = descriptors[i].getReadMethod();
					if (!descriptors[i].getName().equals("id")) { // 将id放在params的最后
						if (!noUpdateequals(descriptors[i].getName(), noUpdates)) {
							params[flag] = readMethod.invoke(myentity);
							columnnames.append(descriptors[i].getName()).append(" = ?,");
							flag++;
						}
					} else {
						params[descriptors.length - 2 - noUpdates.length] = readMethod.invoke(myentity);
					}
				}
			}
		} catch (IllegalArgumentException e1) {
			LogUtil.RollingFile.error(e1.getMessage());
			e1.printStackTrace();
		} catch (IntrospectionException e1) {
			LogUtil.RollingFile.error(e1.getMessage());
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			LogUtil.RollingFile.error(e1.getMessage());
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			LogUtil.RollingFile.error(e1.getMessage());
			e1.printStackTrace();
		}
		columnnames.deleteCharAt(columnnames.length() - 1);

		String sql = "update " + tableName + " set " + columnnames + " where id = ?";
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			queryRunner.update(sql, params);
			return queryRunner.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return 0;
	}

	public boolean noUpdateequals(String param, String[] noUpdates) {
		for (int i = 0; i < noUpdates.length; i++) {
			if (param.equals(noUpdates[i])) {
				return true;
			}
		}
		return false;

	}

	/*
	 * （非 Javadoc） <p>Title: update</p> <p>Description: </p>
	 * 
	 * @param sql
	 * 
	 * @param params
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#update(java.lang.String, java.lang.Object[])
	 */
	public int update(String sql, Object... params) {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			return queryRunner.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return 0;
	}

	// /* （非 Javadoc）
	// * <p>Title: queryForCount</p>
	// * <p>Description: </p>
	// * @param tableName
	// * @return
	// * @see com.zjcw.dao.IBaseDao#queryForCount(java.lang.String)
	// */
	// public long queryForCount(String tableName) {
	// return 0;
	// }

	/*
	 * （非 Javadoc） <p>Title: queryForCount</p> <p>Description: </p>
	 * 
	 * @param sql
	 * 
	 * @param args
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#queryForCount(java.lang.String,
	 * java.lang.Object[])
	 */
	public double queryForCount(String sql, Object... args) {

		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			Object object = queryRunner.query(sql, new ScalarHandler(1), args);
			if (object == null) {
				return 0;
			}
			return Double.parseDouble(object.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return 0;
	}

	/*
	 * （非 Javadoc） <p>Title: queryForSum</p> <p>Description: </p>
	 * 
	 * @param sql
	 * 
	 * @param args
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#queryForSum(java.lang.String, java.lang.Object[])
	 */
	public double queryForSum(String sql, Object... args) {
		return 0;
	}

	public Long queryForTotal(String tableName) {
		String sql = "select count(*) from " + tableName;
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			return (Long) queryRunner.query(sql, new ScalarHandler(1));
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return (long) 0;
	}

	public Long queryForTotal(String tableName, String sql, Object... args) {
		String mysql = "select count(*) from " + tableName + " " + sql;
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			return (Long) queryRunner.query(mysql, new ScalarHandler(1), args);
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return (long) 0;
	}

	public Date queryForDate(String sql, Object... args) {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			return DateUtil.strToDateLong((String) queryRunner.query(sql, new ScalarHandler(1), args));
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	public Date queryForDateDirect(String sql, Object... args) {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			return (Date) queryRunner.query(sql, new ScalarHandler(1), args);
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}

	/*
	 * （非 Javadoc） <p>Title: queryForSinglecolumn</p> <p>Description: </p>
	 * 
	 * @param sql
	 * 
	 * @param args
	 * 
	 * @return
	 * 
	 * @see com.zjcw.dao.IBaseDao#queryForSinglecolumn(java.lang.String,
	 * java.lang.Object[])
	 */
	public Integer queryForSingleColumn(String sql, Object... args) {
		// TODO Auto-generated method stub
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		try {
			return (Integer) queryRunner.query(sql, new ScalarHandler(1), args);
		} catch (SQLException e) {
			e.printStackTrace();
			LogUtil.RollingFile.error(e.getMessage());
		}
		return null;
	}
}
