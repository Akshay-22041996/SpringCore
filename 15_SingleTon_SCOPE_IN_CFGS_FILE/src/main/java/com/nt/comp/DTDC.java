package com.nt.comp;

public class DTDC extends Courier {
	
	private String cName;

	public DTDC(Integer cid, Double price, Double weightOfCourier, String cName) {
		super(cid, price, weightOfCourier);
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "DTDC [cName=" + cName + "]"+super.toString();
	}


	
	
}
