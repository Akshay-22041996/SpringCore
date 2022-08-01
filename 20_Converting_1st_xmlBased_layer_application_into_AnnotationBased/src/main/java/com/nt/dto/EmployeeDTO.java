package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	private Integer eid;
	private String ename;
	private String eaddress;
	private Double basicSal;
	private Double netSal;
	private Double grosssal;
	
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
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
	public Double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(Double basicSal) {
		this.basicSal = basicSal;
	}
	public Double getNetSal() {
		return netSal;
	}
	public void setNetSal(Double netSal) {
		this.netSal = netSal;
	}
	public Double getGrosssal() {
		return grosssal;
	}
	public void setGrosssal(Double grosssal) {
		this.grosssal = grosssal;
	}
	
	
}
