package com.nt.comp;

public abstract class Person {
	
	public String pname;
	public int age;
	public AadharDetails details;
	
	
	public Person(String pname, int age, AadharDetails details) {
	
		this.pname = pname;
		this.age = age;
		this.details = details;
		System.out.println("Person class:: 3 param constuctor");
	}


	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + "]";
	}
	
	
}
