package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable{

	private Integer cid;
	private String cname;
	private String caddre;
	private Double pamt;
	private Double timePeriod;
	private Double roInterest;
	private Double intamt;
	
	
	public Double getIntamt() {
		return intamt;
	}
	public void setIntamt(Double intamt) {
		this.intamt = intamt;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddre() {
		return caddre;
	}
	public void setCaddre(String caddre) {
		this.caddre = caddre;
	}
	public Double getPamt() {
		return pamt;
	}
	public void setPamt(Double pamt) {
		this.pamt = pamt;
	}
	public Double getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(Double timePeriod) {
		this.timePeriod = timePeriod;
	}
	public Double getRoInterest() {
		return roInterest;
	}
	public void setRoInterest(Double roInterest) {
		this.roInterest = roInterest;
	}
	

}
