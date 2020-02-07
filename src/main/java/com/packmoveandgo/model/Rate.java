package com.packmoveandgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "RATES")
public class Rate {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RATES_SEQ")
	@SequenceGenerator(
		name="RATES_SEQ",
		sequenceName="RATES_SEQ",
		initialValue = 1, allocationSize = 1
	)
	private int rate_id ;
	
	@Column(name = "charge_per_km", nullable = false)
	private int charge_per_km;
	@Column(name = "service_type", nullable = false)
	private String service_type;
	@Column(name = "item_id", nullable = false)
	private int item_id ;
	public int getRate_id() {
		return rate_id;
	}
	public void setRate_id(int rate_id) {
		this.rate_id = rate_id;
	}
	public int getCharge_per_km() {
		return charge_per_km;
	}
	public void setCharge_per_km(int charge_per_km) {
		this.charge_per_km = charge_per_km;
	}
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	@Override
	public String toString() {
		return "Rate [rate_id=" + rate_id + ", charge_per_km=" + charge_per_km + ", service_type=" + service_type
				+ ", item_id=" + item_id + "]";
	}
	
	
	
}
