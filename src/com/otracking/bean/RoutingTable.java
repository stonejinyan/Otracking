package com.otracking.bean;

public class RoutingTable extends Routing {

	private String processline_name;
	private String method_process;
	private String product_type_name;
	private String product_classify_name;

	public String getProcessline_name() {
		return processline_name;
	}

	public void setProcessline_name(String processline_name) {
		this.processline_name = processline_name;
	}

	public String getMethod_process() {
		return method_process;
	}

	public void setMethod_process(String method_process) {
		this.method_process = method_process;
	}

	public String getProduct_type_name() {
		return product_type_name;
	}

	public void setProduct_type_name(String product_type_name) {
		this.product_type_name = product_type_name;
	}

	public String getProduct_classify_name() {
		return product_classify_name;
	}

	public void setProduct_classify_name(String product_classify_name) {
		this.product_classify_name = product_classify_name;
	}

}
