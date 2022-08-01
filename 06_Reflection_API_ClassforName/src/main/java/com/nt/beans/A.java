package com.nt.beans;

public class A {
	
	private int a;
	private int b;
	
	public  A() {
		System.out.println("A Class::0 param constructor");
	}

	 private A(int a, int b) {
		System.out.println("A class:: 2 param constructor");
		this.a = a;
		this.b = b;
	}
	 public A(int b) {
		 this.b=b;
	 }

	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + "]";
	}

}
