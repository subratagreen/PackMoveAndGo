package com.packmoveandgo.request.model;

public class ItemDetail {

	private String item_name;

	private String  item_type;

	private int service_id;

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_type() {
		return item_type;
	}

	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	@Override
	public String toString() {
		return "ItemDetail [item_name=" + item_name + ", item_type=" + item_type + ", service_id=" + service_id + "]";
	}

}
