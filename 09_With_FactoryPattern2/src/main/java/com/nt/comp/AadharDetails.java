package com.nt.comp;

public class AadharDetails {
	
	private long aadharNo;
	private long mobileNo;
	
	
	public AadharDetails(long aadharNo, long mobileNo) {
		super();
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
		
		System.out.println("AadharDeatils:: 2 param constructor");
	}


	@Override
	public String toString() {
		return "AadharDetails [aadharNo=" + aadharNo + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
