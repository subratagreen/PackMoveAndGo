package com.packmoveandgo.request.model;

import java.sql.Date;

public class FastBooking {

	private String cust_name;

	private String 	cust_address;

	private String cust_ph;

	private String cust_type;
	

	private int branch_id;

	private int cust_id;

	private Date booking_date;

	private String src_branch;

	private String dest_branch;

	private int rate;

	private String pack_load_unload;

	private int dest_agent_id;

	private int item_id;

	private int	service_id;
	
	private int qty;
	
	private String	pack_mat_desc;

	private int cost_per_unit;

	private String	approx_expend;

	

	public String getApprox_expend() {
		return approx_expend;
	}


	public void setApprox_expend(String approx_expend) {
		this.approx_expend = approx_expend;
	}




	@Override
	public String toString() {
		return "FastBooking [cust_name=" + cust_name + ", cust_address=" + cust_address + ", cust_ph=" + cust_ph
				+ ", cust_type=" + cust_type + ", branch_id=" + branch_id + ", cust_id=" + cust_id + ", booking_date="
				+ booking_date + ", src_branch=" + src_branch + ", dest_branch=" + dest_branch + ", rate=" + rate
				+ ", pack_load_unload=" + pack_load_unload + ", dest_agent_id=" + dest_agent_id + ", item_id=" + item_id
				+ ", service_id=" + service_id + ", qty=" + qty + ", pack_mat_desc=" + pack_mat_desc
				+ ", cost_per_unit=" + cost_per_unit + ", approx_expend=" + approx_expend + "]";
	}


	public int getService_id() {
		return service_id;
	}


	public void setService_id(int service_id) {
		this.service_id = service_id;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public String getPack_mat_desc() {
		return pack_mat_desc;
	}


	public void setPack_mat_desc(String pack_mat_desc) {
		this.pack_mat_desc = pack_mat_desc;
	}


	public int getCost_per_unit() {
		return cost_per_unit;
	}


	public void setCost_per_unit(int cost_per_unit) {
		this.cost_per_unit = cost_per_unit;
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


	public int getItem_id() {
		return item_id;
	}


	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

}
