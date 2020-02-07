package com.packmoveandgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEM_SEQ")
	@SequenceGenerator(
		name="ITEM_SEQ",
		sequenceName="ITEM_SEQ",
		initialValue = 1, allocationSize = 1
	)
	private int item_id;
	
	@Column(name = "item_name", nullable = false)
	private String item_name;
	
	@Column(name = "item_type", nullable = false)
	private String  item_type;

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

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

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_type=" + item_type + "]";
	}

	
	
	
	
}
