package com.otracking.dao;

import java.util.List;

import com.otracking.bean.Product_Type;

public class Product_TypeDao extends IBaseDao<Product_Type> {

	public static final String tableName = "product_type";

	public Product_Type findById(int id) {
		// TODO Auto-generated method stub
		return super.findById(id, tableName);
	}

	public boolean save(Product_Type product_Type) {
		// TODO Auto-generated method stub
		return super.save(product_Type, tableName);
	}

	public int update(String sql, int id, String newValue) {
		return super.update("update " + tableName + " " + sql, newValue, id);
	}

	public List<Product_Type> getAll() {
		return super.getAll(tableName);
	}

	public Product_Type query(String myProcesslineName, String product_classify, String type) {
		// TODO Auto-generated method stub
		String sql = "select product_type.id,product_type.name,product_type.bigtype_id,product_type.processline_id from product_type,product_model,product_classify,processline where product_type.bigtype_id = product_model.id and product_model.product_classify_id = product_classify.id and product_type.processline_id = processline.id and product_classify.name = ? and processline.name = ? and product_type.name = ?";
		return super.queryForSingle(sql, product_classify, myProcesslineName, type);
	}

	public Product_Type query(int processline_id, int model_id) {
		String sql = "select * from " + tableName + " where processline_id = ? and bigtype_id = ?";
		return super.queryForSingle(sql, processline_id, model_id);
	}

}
