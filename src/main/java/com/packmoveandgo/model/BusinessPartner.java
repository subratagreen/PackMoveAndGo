package com.packmoveandgo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BUSINESS_PARTNER")
public class BusinessPartner {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BUSINESS_PARTNER_SEQ")
	@SequenceGenerator(
		name="BUSINESS_PARTNER_SEQ",
		sequenceName="BUSINESS_PARTNER_SEQ",
		initialValue = 1, allocationSize = 1
	)
	@Column(name = "agent_id")
	private int agent_id;
	
	@Column(name = "agent_name")
	private String agent_name;
	
	@Column(name = "branch_id")
	private int branch_id;
	
	@Column(name = "agent_add", nullable = false)
	private String agent_add;
	
	@Column(name = "agent_ph", nullable = false)
	private String	agent_ph;
	
	@Column(name = "facility", nullable = false)
	private String	facility;
	
	public BusinessPartner() {
		// TODO Auto-generated constructor stub
	}
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "agent_id")
	private  Booking booking ;
	

	public int getAgent_id() {
		return agent_id;
	}

	public void setAgent_id(int agent_id) {
		this.agent_id = agent_id;
	}

	public String getAgent_name() {
		return agent_name;
	}

	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getAgent_add() {
		return agent_add;
	}

	public void setAgent_add(String agent_add) {
		this.agent_add = agent_add;
	}

	public String getAgent_ph() {
		return agent_ph;
	}

	public void setAgent_ph(String agent_ph) {
		this.agent_ph = agent_ph;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	@Override
	public String toString() {
		return "BusinessPartner [agent_id=" + agent_id + ", agent_name=" + agent_name + ", branch_id=" + branch_id
				+ ", agent_add=" + agent_add + ", agent_ph=" + agent_ph + ", facility=" + facility + "]";
	}
	
	
	
	
}
