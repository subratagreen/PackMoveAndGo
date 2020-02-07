package com.packmoveandgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SHIPMENT")
public class Shipment {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SHIPMENT_SEQ")
	@SequenceGenerator(
		name="SHIPMENT_SEQ",
		sequenceName="SHIPMENT_SEQ",
		initialValue = 1, allocationSize = 1
	)
	private int shipment_id;
	
	@Column(name = "branch_id", nullable = false)
	private int branch_id;

	@Column(name = "item_id", nullable = false)
	private int item_id;
	
	@Column(name = "qty", nullable = false)
	private int qty;
	
	@Column(name = "booking_id")
	private int booking_id;

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getShipment_id() {
		return shipment_id;
	}

	public void setShipment_id(int shipment_id) {
		this.shipment_id = shipment_id;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Shipment [shipment_id=" + shipment_id + ", branch_id=" + branch_id + ", item_id=" + item_id + ", qty="
				+ qty + "]";
	}
	
	


}
