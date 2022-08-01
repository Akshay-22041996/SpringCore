package com.nt.dto;

import java.io.Serializable;

public class GuestDTO implements Serializable{
	
	private String guestName;
	private String guestAddress;
	private Double perDayCharge;
	private Integer noOfDayStays;
	private Double totalBillAmt;
	
	
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestAddress() {
		return guestAddress;
	}
	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}
	public Double getPerDayCharge() {
		return perDayCharge;
	}
	public void setPerDayCharge(Double perDayCharge) {
		this.perDayCharge = perDayCharge;
	}
	public Integer getNoOfDayStays() {
		return noOfDayStays;
	}
	public void setNoOfDayStays(Integer noOfDayStays) {
		this.noOfDayStays = noOfDayStays;
	}
	public Double getTotalBillAmt() {
		return totalBillAmt;
	}
	public void setTotalBillAmt(Double totalBillAmt) {
		this.totalBillAmt = totalBillAmt;
	}
	
	

}
