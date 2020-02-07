package com.packmoveandgo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SEND_ENQUIRY")
public class SendEnquiry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEND_ENQUIRY_SEQ")
	@SequenceGenerator(
		name="SEND_ENQUIRY_SEQ",
		sequenceName="SEND_ENQUIRY_SEQ",
		initialValue = 1, allocationSize = 1
	)
	private int sendEnquiryId;
	
	@Column(name = "name")
	private String name;

	@Column(name = "mobile" )
	private String 	mobile;
	
	@Column(name = "moveFrom")
	private String moveFrom;
	
	@Column(name = "moveTo")
	private String moveTo;
	
	@Column(name = "moveDate")
	private Date moveDate;
	
	@Column(name = "message")
	private String message;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "status")
	private String status;

	public int getSendEnquiryId() {
		return sendEnquiryId;
	}

	public void setSendEnquiryId(int sendEnquiryId) {
		this.sendEnquiryId = sendEnquiryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMoveFrom() {
		return moveFrom;
	}

	public void setMoveFrom(String moveFrom) {
		this.moveFrom = moveFrom;
	}

	public String getMoveTo() {
		return moveTo;
	}

	public void setMoveTo(String moveTo) {
		this.moveTo = moveTo;
	}

	public Date getMoveDate() {
		return moveDate;
	}

	public void setMoveDate(Date moveDate) {
		this.moveDate = moveDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SendEnquiry [sendEnquiryId=" + sendEnquiryId + ", name=" + name + ", mobile=" + mobile + ", moveFrom="
				+ moveFrom + ", moveTo=" + moveTo + ", moveDate=" + moveDate + ", message=" + message + ", email="
				+ email + "]";
	}
	

	
	
	
}
