package com.packmoveandgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ENQUIRY")
public class Enquiry {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ENQUIRY_SEQ")
	@SequenceGenerator(
		name="ENQUIRY_SEQ",
		sequenceName="ENQUIRY_SEQ",
		initialValue = 1, allocationSize = 1
	)
	private int enq_id;
	
	@Column(name = "branch_id", nullable = false)
	private int branch_id;
	@Column(name = "service_id", nullable = false)
	private int service_id;
	@Column(name = "person_name", nullable = false)
	private String person_name;
	@Column(name = "person_address", nullable = false)
	private String person_address;
	@Column(name = "person_ph", nullable = false)
	private String person_ph;
	public int getEnq_id() {
		return enq_id;
	}
	public void setEnq_id(int enq_id) {
		this.enq_id = enq_id;
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_address() {
		return person_address;
	}
	public void setPerson_address(String person_address) {
		this.person_address = person_address;
	}
	public String getPerson_ph() {
		return person_ph;
	}
	public void setPerson_ph(String person_ph) {
		this.person_ph = person_ph;
	}
	@Override
	public String toString() {
		return "Enquiry [enq_id=" + enq_id + ", branch_id=" + branch_id + ", service_id=" + service_id
				+ ", person_name=" + person_name + ", person_address=" + person_address + ", person_ph=" + person_ph
				+ "]";
	}
	
	
}
