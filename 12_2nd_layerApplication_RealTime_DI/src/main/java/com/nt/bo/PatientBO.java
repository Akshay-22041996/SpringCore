package com.nt.bo;

public class PatientBO {
	
	private Integer pid;
	private String pname;
	private String paddress;
	private Double perDayCharge;
	private Integer noOfDayAdmit;
	private Double totalBillAmt;
	
	
	public Double getTotalBillAmt() {
		return totalBillAmt;
	}
	public void setTotalBillAmt(Double totalBillAmt) {
		this.totalBillAmt = totalBillAmt;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
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
	public Double getPerDayCharge() {
		return perDayCharge;
	}
	public void setPerDayCharge(Double perDayCharge) {
		this.perDayCharge = perDayCharge;
	}
	public Integer getNoOfDayAdmit() {
		return noOfDayAdmit;
	}
	public void setNoOfDayAdmit(Integer noOfDayAdmit) {
		this.noOfDayAdmit = noOfDayAdmit;
	}
	
	
}
