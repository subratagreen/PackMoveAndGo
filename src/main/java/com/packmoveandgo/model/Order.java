package com.packmoveandgo.model;

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
@Table(name = "ORDERS")
public class Order {


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORDERS_SEQ")
	@SequenceGenerator(
			name="ORDERS_SEQ",
			sequenceName="ORDERS_SEQ",
			initialValue = 1, allocationSize = 1
			)
	private int	order_id;

	@Column(name = "cust_id", nullable = false)
	private int cust_id;

	@Column(name = "branch_id", nullable = false)
	private int branch_id;

	@Column(name = "item_id", nullable = false)
	private int item_id;

	@Column(name = "qty", nullable = false)
	private int qty;

	@Column(name = "approx_expend")
	private String approx_expend;


	@Column(name = "status")
	private String status;


	
	@OneToOne
	@JoinColumn(name="cust_id", nullable=false,insertable = false,updatable = false)
	private CustomerRegister customerRegister;
	

	
	
	public CustomerRegister getCustomerRegister() {
		return customerRegister;
	}

	public void setCustomerRegister(CustomerRegister customerRegister) {
		this.customerRegister = customerRegister;
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
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

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", cust_id=" + cust_id + ", branch_id=" + branch_id + ", item_id="
				+ item_id + ", qty=" + qty + ", approx_expend=" + approx_expend + ", status=" + status + "]";
	}




}
