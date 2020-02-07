package com.packmoveandgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")
public class Login {
	
	
	  @Id
	  
	  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOGIN_SEQ")
	  
	  @SequenceGenerator( name="LOGIN_SEQ", sequenceName="LOGIN_SEQ",initialValue = 1, allocationSize = 1)
	  
	  private int login_serial_no;
	 
	
	@Column(name = "cust_id", nullable = false)
	private int cust_id;

	@Column(name = "password")
	private String 	password;
	
	@Column(name = "cust_type")
	private String cust_type;


	public int getLogin_serial_no() {
		return login_serial_no;
	}

	public void setLogin_serial_no(int login_serial_no) {
		this.login_serial_no = login_serial_no;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	@Override
	public String toString() {
		return "Login [login_serial_no=" + login_serial_no + ", cust_id=" + cust_id + ", password=" + password
				+ ", cust_type=" + cust_type + "]";
	}
	
	
	

}
