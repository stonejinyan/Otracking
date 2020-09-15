package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Product_Big_Type;

public class BigTypeDao extends IBaseDao<Product_Big_Type> {

	public static final String tableName = "product_bigtype";

	public List<Product_Big_Type> getAll() {
		return super.getAll(tableName);
	}

	public boolean save(Product_Big_Type product_Big_Type) {
		return super.save(product_Big_Type, tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}
}
