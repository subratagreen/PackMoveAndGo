package com.packmoveandgo.request.model;

import com.packmoveandgo.model.Booking;
import com.packmoveandgo.model.Branch;
import com.packmoveandgo.model.BusinessPartner;
import com.packmoveandgo.model.CustomerRegister;
import com.packmoveandgo.model.Order;

public class MyJoinTableData {

	private CustomerRegister customerRegister;
	private Order order;
	private	Booking booking;
	private BusinessPartner businessPartner;
	private Branch branch;

	public MyJoinTableData() {
		// TODO Auto-generated constructor stub
	}

	public MyJoinTableData(
			CustomerRegister customerRegister,
			Order order,
			Booking booking,
			BusinessPartner businessPartner,
			Branch branch) {
		this.customerRegister=customerRegister;
		this.order=order;
		this.booking=booking;
		this.businessPartner=businessPartner;
		this.branch=branch;
	}

	public CustomerRegister getCustomerRegister() {
		return customerRegister;
	}

	public void setCustomerRegister(CustomerRegister customerRegister) {
		this.customerRegister = customerRegister;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public BusinessPartner getBusinessPartner() {
		return businessPartner;
	}

	public void setBusinessPartner(BusinessPartner businessPartner) {
		this.businessPartner = businessPartner;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
	
}
