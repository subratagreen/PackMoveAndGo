package com.packmoveandgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICES")
public class Services {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICES_SEQ")
	@SequenceGenerator(
			name="SERVICES_SEQ",
			sequenceName="SERVICES_SEQ",
			initialValue = 1, allocationSize = 1
			)

	private int	service_id;


	@Column(name = "service_name")
	private String	service_name;

	@Column(name = "service_type")
	private String service_type;

	@Column(name = "charge_per_km")
	private int charge_per_km;

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public int getCharge_per_km() {
		return charge_per_km;
	}

	public void setCharge_per_km(int charge_per_km) {
		this.charge_per_km = charge_per_km;
	}

	@Override
	public String toString() {
		return "Services [service_id=" + service_id + ", service_name=" + service_name + ", service_type="
				+ service_type + ", charge_per_km=" + charge_per_km + "]";
	}
	
	


}
