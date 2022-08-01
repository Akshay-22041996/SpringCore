package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Filpkart {
	
	@Autowired
	@Qualifier("abc")
	private Courier courier;

	public Filpkart() {
	System.out.println("Filpkart:: Filpkart Class object is created");
	}
	
	
	
	public void assignCourier() {
		
		int txid=new Random().nextInt(10000);
		
		String msg=courier.courierDetails(txid);
		System.out.println(msg);
	}
}
