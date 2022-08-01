package com.nt.test;

public class A {

	public A() {
		System.out.println("A class ::0 param constructor");
	}
	public A m1(int b) {
		A a1=new A();
		System.out.println("A class m1  non static method is executed");
		return a1;
	}
	
//	public static A m1(int b) {
//		A a1=new A();
//		System.out.println("A class m1 static method is exectued");
//		return a1;
//	}
}
