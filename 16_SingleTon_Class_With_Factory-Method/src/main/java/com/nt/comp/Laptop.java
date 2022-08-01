package com.nt.comp;

public class Laptop {
	
	private static Laptop lap;
	
	private Laptop() {
		System.out.println("Laptom class::0 param constructor");
	}
	
	public static Laptop getInstance() {
		if(lap==null)
			lap=new Laptop();
		return lap;
	}
}
