package com.nt.comp;

public class Courier {
	
	private Integer cid;
	private Double price;
	private Double weightOfCourier;
	private PostOffice office;
	
	public PostOffice getOffice() {
		return office;
	}



	public void setOffice(PostOffice office) {
		this.office = office;
	}



	public Courier(Integer cid, Double price, Double weightOfCourier) {
		super();
		this.cid = cid;
		this.price = price;
		this.weightOfCourier = weightOfCourier;
	}

	

	public Courier(Integer cid) {
		super();
		this.cid = cid;
	}



	public Courier() {
		super();
	}



	public Integer getCid() {
		return cid;
	}



	public void setCid(Integer cid) {
		this.cid = cid;
	}



	@Override
	public String toString() {
		return "Courier [cid=" + cid + ", price=" + price + ", weightOfCourier=" + weightOfCourier + "]";
	}
	
	
}
