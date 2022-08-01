package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class CreaditCard {

	public CreaditCard() {
		System.out.println("CreditCard class is executed");
	}
	
	public String shoppingUsingCreditCard() {
		
		int a=new Random().nextInt(10000);
		return "shopping done with Credit Card with total amount is ::"+a;
	}
}
