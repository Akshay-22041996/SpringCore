package com.nt.beans;

public class A {
	
	private static A a1;
	
	private A() {
		System.out.println("A class::0 param constructor");
	}
	
	public static A getInstance() {
	
		if(a1 ==null)
			a1=new A();
		return a1;
	}
}
