package com.nt.comp;


public class Customer extends Person {
	
	private int txNo;
	private double billAmt;
	
	public Customer(String pname, int age, AadharDetails details, int txNo, double billAmt) {
		super(pname, age, details);
		this.txNo = txNo;
		this.billAmt = billAmt;
		
		System.out.println("Customer class:: 5 param constructor");
	}

	@Override
	public String toString() {
		return "Customer [txNo=" + txNo + ", billAmt=" + billAmt + ", pname=" + pname + ", age=" + age + ", details="
				+ details + "]";
	}

	
	
}
