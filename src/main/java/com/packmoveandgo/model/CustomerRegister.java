package com.packmoveandgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "CUSTOMER")
public class CustomerRegister {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_SEQ")
	@SequenceGenerator(
		name="CUSTOMER_SEQ",
		sequenceName="CUSTOMER_SEQ",
		initialValue = 1, allocationSize = 1
	)
	private int cust_id;
	
	@Column(name = "cust_name")
	private String cust_name;

	@Column(name = "cust_address" )
	private String 	cust_address;
	
	@Column(name = "cust_ph")
	private String cust_ph;
	
	@Column(name = "cust_type")
	private String cust_type;
	
	@Column(name = "cust_credit_limit")
	private int cust_credit_limit;

	public int getCust_id() {
		return cust_id;
	}

	@OneToOne(mappedBy = "customerRegister" )
	@Cascade(value = org.hibernate.annotations.CascadeType.ALL)
	private Order order;
	
	@OneToOne(mappedBy = "customerRegister" )
	@Cascade(value = org.hibernate.annotations.CascadeType.ALL)
	private Booking booking;
	
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public CustomerRegister() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_ph() {
		return cust_ph;
	}

	public void setCust_ph(String cust_ph) {
		this.cust_ph = cust_ph;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public int getCust_credit_limit() {
		return cust_credit_limit;
	}

	public void setCust_credit_limit(int cust_credit_limit) {
		this.cust_credit_limit = cust_credit_limit;
	}

	@Override
	public String toString() {
		return "CustomerRegister [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_address=" + cust_address
				+ ", cust_ph=" + cust_ph + ", cust_type=" + cust_type + ", cust_credit_limit=" + cust_credit_limit
				+ "]";
	}
	
	

}
