package com.nt.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	
	
	private ICourier courier;

	public Flipkart() {
	System.out.println("Flipkart class:: 0 param constructor");
	}
	
	

	public void setCourier(ICourier courier) {
		System.out.println("Set courier method from flipkart class");
		this.courier=courier;
	}
	
	public String shopping (double[] price,String[] items) {
		
		System.out.println("Shopping method is executed");
		double amt=0;
		for (double a : price) {
			amt+=a;
		}
		
		String msg=courier.txId("akshay");
		return "your total billing amt is ::"+amt +"  "+
				msg;
	}
}
