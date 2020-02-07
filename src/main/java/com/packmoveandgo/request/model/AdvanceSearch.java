package com.packmoveandgo.request.model;

public class AdvanceSearch {

	private String order_id;
	private String customer_name;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	@Override
	public String toString() {
		return "AdvanceSearch [order_id=" + order_id + ", customer_name=" + customer_name + "]";
	}

	
}
