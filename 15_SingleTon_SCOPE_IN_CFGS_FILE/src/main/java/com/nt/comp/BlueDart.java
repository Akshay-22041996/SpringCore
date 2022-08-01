package com.nt.comp;

public class BlueDart extends Courier{

	private String cName;
	private String caddress;
	
	
	public BlueDart(Integer cid, Double price, Double weightOfCourier, String cName, String caddress) {
		super(cid, price, weightOfCourier);
		this.cName = cName;
		this.caddress = caddress;
	}


	@Override
	public String toString() {
		return "BlueDart [cName=" + cName + ", caddress=" + caddress + "]"+super.toString();
	}
	
	
}
