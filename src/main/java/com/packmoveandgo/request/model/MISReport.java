package com.packmoveandgo.request.model;

import java.sql.Date;

public class MISReport {
	
	private Date datewise;
	private Date monthlyDate;
	private Date startDate;
	private Date endDate;
	
	public Date getDatewise() {
		return datewise;
	}
	public void setDatewise(Date datewise) {
		this.datewise = datewise;
	}
	public Date getMonthlyDate() {
		return monthlyDate;
	}
	public void setMonthlyDate(Date monthlyDate) {
		this.monthlyDate = monthlyDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "MISReport [datewise=" + datewise + ", monthlyDate=" + monthlyDate + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
}
