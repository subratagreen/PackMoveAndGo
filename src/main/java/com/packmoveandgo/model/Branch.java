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
@Table(name = "BRANCH")
public class Branch {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BRANCH_SEQ")
	@SequenceGenerator(
			name="BRANCH_SEQ",
			sequenceName="BRANCH_SEQ",
			initialValue = 1, allocationSize = 1
			)
	private int branch_id;

	@Column(name = "branch_name", nullable = false)
	private String	branch_name;

	@Column(name = "branch_address", nullable = false)
	private String branch_address;

	@Column(name = "branch_ph", nullable = false)
	private String branch_ph;

	@Column(name = "branch_email", nullable = false)
	private String branch_email;

	public Branch() {
		// TODO Auto-generated constructor stub
	}

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "branch_id")
	private  Booking booking ;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "branch_id")
	private  Order order ;
	
	
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getBranch_address() {
		return branch_address;
	}

	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}

	public String getBranch_ph() {
		return branch_ph;
	}

	public void setBranch_ph(String branch_ph) {
		this.branch_ph = branch_ph;
	}

	public String getBranch_email() {
		return branch_email;
	}

	public void setBranch_email(String branch_email) {
		this.branch_email = branch_email;
	}

	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address
				+ ", branch_ph=" + branch_ph + ", branch_email=" + branch_email + "]";
	}





}
