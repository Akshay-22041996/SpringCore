package com.nt.comps;

public class AadharDetails {
	
	private int aNo;
	private String addre;
	
	
	public AadharDetails(int aNo, String addre) {
	System.out.println("AadharClass consturctor");
		this.aNo = aNo;
		this.addre = addre;
	}


	@Override
	public String toString() {
		return "AadharDetails [aNo=" + aNo + ", addre=" + addre + "]";
	}
	

	
	
}
