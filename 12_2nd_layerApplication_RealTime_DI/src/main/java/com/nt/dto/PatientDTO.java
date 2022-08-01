package com.nt.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable{
	
	private String pname;
	private String paddress;
	private Integer noOfDayAdmit;
	private Double perDayCharge;
	private Double totalBillAmt;
	
	
	
	public Double getTotalBillAmt() {
		return totalBillAmt;
	}
	public void setTotalBillAmt(Double totalBillAmt) {
		this.totalBillAmt = totalBillAmt;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public Integer getNoOfDayAdmit() {
		return noOfDayAdmit;
	}
	public void setNoOfDayAdmit(Integer noOfDayAdmit) {
		this.noOfDayAdmit = noOfDayAdmit;
	}
	public Double getPerDayCharge() {
		return perDayCharge;
	}
	public void setPerDayCharge(Double perDayCharge) {
		this.perDayCharge = perDayCharge;
	}
	
	
}
