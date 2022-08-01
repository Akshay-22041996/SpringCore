package com.nt.comps;

public class Customer extends Person {
	
	private float billAmt;
	private int txId;
	


	public Customer(String pname, AadharDetails details, float billAmt, int txId) {
		super(pname, details);
		this.billAmt = billAmt;
		this.txId = txId;
		
		System.out.println("Customer class constructor");
	}



	@Override
	public String toString() {
		return "Customer [billAmt=" + billAmt + ", txId=" + txId + "]"+super.toString();
	}
	
	
}
