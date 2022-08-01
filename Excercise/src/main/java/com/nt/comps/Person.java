package com.nt.comps;

public abstract class Person {
	
	private String pname;
	private AadharDetails details;
	
	
	public Person(String pname, AadharDetails details) {
		System.out.println("Person class constructor");
		this.pname = pname;
		this.details = details;
	}


	@Override
	public String toString() {
		return "Person [pname=" + pname + ", details=" + details + "]";
	}
	
	
}	
