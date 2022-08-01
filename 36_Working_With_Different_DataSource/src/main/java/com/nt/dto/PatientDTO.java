package com.nt.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {

	
	private String pname;
	private String padd;
	private int penroll;
	private double perDayCharge;
	private int noOfDayAdmit;
	private double totalBill;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public int getPenroll() {
		return penroll;
	}
	public void setPenroll(int penroll) {
		this.penroll = penroll;
	}
	public double getPerDayCharge() {
		return perDayCharge;
	}
	public void setPerDayCharge(double perDayCharge) {
		this.perDayCharge = perDayCharge;
	}
	public int getNoOfDayAdmit() {
		return noOfDayAdmit;
	}
	public void setNoOfDayAdmit(int noOfDayAdmit) {
		this.noOfDayAdmit = noOfDayAdmit;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
}
