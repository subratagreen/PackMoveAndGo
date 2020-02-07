package com.packmoveandgo.request.model;

import java.sql.Date;


public class OrderDetails {


	private int cust_id;
	private String cust_name;
	private String 	cust_address;
	private String cust_ph;
	private String cust_type;
	private int cust_credit_limit;
	private int	order_id;
	private int branch_id;
	private int item_id;
	private int qty;
	private String approx_expend;
	private int agent_id;
	private String agent_name;
	private String agent_add;
	private String	agent_ph;
	private String	facility;
	private int shipment_id;
	private int rate_id ;
	private int charge_per_km;
	private String service_type;
	private String	branch_name;
	private String branch_address;
	private String branch_ph;
	private String branch_email;
	private int booking_id;
	private Date booking_date;
	private String src_branch;
	private String dest_branch;
	private int rate;
	private String pack_load_unload;
	private int dest_agent_id;

	private String statusOfConsignment;
	private String status;
	
	private String item_name;
	
	


	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public OrderDetails( 
			String cust_name,
			String cust_ph,
			int	order_id,
			String agent_name,
			String	branch_name,
			Date booking_date,
			String src_branch,
			String dest_branch,
			String statusOfConsignment,
			 String status
			) 
	{

		this. cust_name=cust_name ;
		this. cust_ph=cust_ph ;
		this.	order_id=order_id ;
		this. agent_name=agent_name ;
		this.	branch_name=branch_name ;
		this. booking_date=booking_date ;
		this. src_branch=src_branch ;
		this. dest_branch=dest_branch ;
		this. statusOfConsignment= statusOfConsignment;
		this.status=status;
	}

	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusOfConsignment() {
		return statusOfConsignment;
	}
	public void setStatusOfConsignment(String statusOfConsignment) {
		this.statusOfConsignment = statusOfConsignment;
	}
	public int getCust_id() {
		return cust_id;
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
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
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
	public String getApprox_expend() {
		return approx_expend;
	}
	public void setApprox_expend(String approx_expend) {
		this.approx_expend = approx_expend;
	}
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
	public int getShipment_id() {
		return shipment_id;
	}
	public void setShipment_id(int shipment_id) {
		this.shipment_id = shipment_id;
	}
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
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
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
		return "OrderDetails [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_address=" + cust_address
				+ ", cust_ph=" + cust_ph + ", cust_type=" + cust_type + ", cust_credit_limit=" + cust_credit_limit
				+ ", order_id=" + order_id + ", branch_id=" + branch_id + ", item_id=" + item_id + ", qty=" + qty
				+ ", approx_expend=" + approx_expend + ", agent_id=" + agent_id + ", agent_name=" + agent_name
				+ ", agent_add=" + agent_add + ", agent_ph=" + agent_ph + ", facility=" + facility + ", shipment_id="
				+ shipment_id + ", rate_id=" + rate_id + ", charge_per_km=" + charge_per_km + ", service_type="
				+ service_type + ", branch_name=" + branch_name + ", branch_address=" + branch_address + ", branch_ph="
				+ branch_ph + ", branch_email=" + branch_email + ", booking_id=" + booking_id + ", booking_date="
				+ booking_date + ", src_branch=" + src_branch + ", dest_branch=" + dest_branch + ", rate=" + rate
				+ ", pack_load_unload=" + pack_load_unload + ", dest_agent_id=" + dest_agent_id
				+ ", statusOfConsignment=" + statusOfConsignment + ", status=" + status + "]";
	}



}
