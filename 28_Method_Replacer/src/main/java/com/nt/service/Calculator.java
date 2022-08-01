package com.nt.service;

public class Calculator {
	
	public String multiplication(double a,double b,double c) {
		System.out.println("Multiplication method is executed");
		return a*b*c+ "  "+"method executd from regular class calculator";
	}
	
	public String addition(double a,int b,long c,double d) {
		System.out.println("Addition method is executed");
		return "Method executed from regular class calculator::"+(a+b+c+d);
	}
	public void substraction(int a,int b,int c) {
		System.out.println("substraction method of 'int' datatype is executed");
		System.out.println("method executed from regular class calculator::"+(a-b-c));
	}
}	
