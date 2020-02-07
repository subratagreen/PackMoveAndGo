package com.packmoveandgo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKING")
public class Booking {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BOOKING_SEQ")
	@SequenceGenerator(
		name="BOOKING_SEQ",
		sequenceName="BOOKING_SEQ",
		initialValue = 1, allocationSize = 1
	)
	private int booking_id;

	@Column(name = "branch_id", nullable = false)
	private int branch_id;
	
	@Column(name = "cust_id", nullable = false)
	private int cust_id;
	
	@Column(name = "booking_date", nullable = false)
	private Date booking_date;
	
	@Column(name = "src_branch", nullable = false)
	private String src_branch;
	
	@Column(name = "dest_branch", nullable = false)
	private String dest_branch;
	
	@Column(name = "rate", nullable = false)
	private int rate;
	
	@Column(name = "pack_load_unload", nullable = false)
	private String pack_load_unload;
	
	@Column(name = "dest_agent_id", nullable = false)
	private int dest_agent_id;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	
	@OneToOne
//	@PrimaryKeyJoinColumn
	@JoinColumn(name="cust_id", nullable=false,insertable = false,updatable = false)
	private CustomerRegister customerRegister;
	
	
	public CustomerRegister getCustomerRegister() {
		return customerRegister;
	}

	public void setCustomerRegister(CustomerRegister customerRegister) {
		this.customerRegister = customerRegister;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public Date getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}

	public String getSrc_branch() {
		return src_branch;
	}

	public void setSrc_branch(String src_branch) {
		this.src_branch = src_branch;
	}

	public String getDest_branch() {
		return dest_branch;
	}

	public void setDest_branch(String dest_branch) {
		this.dest_branch = dest_branch;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getPack_load_unload() {
		return pack_load_unload;
	}

	public void setPack_load_unload(String pack_load_unload) {
		this.pack_load_unload = pack_load_unload;
	}

	public int getDest_agent_id() {
		return dest_agent_id;
	}

	public void setDest_agent_id(int dest_agent_id) {
		this.dest_agent_id = dest_agent_id;
	}

	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", branch_id=" + branch_id + ", cust_id=" + cust_id
				+ ", booking_date=" + booking_date + ", src_branch=" + src_branch + ", dest_branch=" + dest_branch
				+ ", rate=" + rate + ", pack_load_unload=" + pack_load_unload + ", dest_agent_id=" + dest_agent_id
				+ "]";
	}
	
	
	
	
}
