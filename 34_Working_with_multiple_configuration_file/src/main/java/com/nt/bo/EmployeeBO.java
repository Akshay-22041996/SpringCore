package com.nt.bo;

public class EmployeeBO {
	
	private String ename;
	private String eaddress;
	private double basicSal;
	private double grossSal;
	private double netSal;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	public double getGrossSal() {
		return grossSal;
	}
	public void setGrossSal(double grossSal) {
		this.grossSal = grossSal;
	}
	public double getNetSal() {
		return netSal;
	}
	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
	
}
