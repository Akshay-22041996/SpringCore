package com.nt.comp;

public class Student extends Person {
	
	private int rollNo;
	private String course;
	
	public Student(String pname,int age,AadharDetails details, int rollNo,String course) {
		super(pname,age,details);
		this.details=details;
		this.course=course;
		
		System.out.println("Student class::5 param constuctor"); 
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", course=" + course + ", pname=" + pname + ", age=" + age + ", details="
				+ details + "]";
	}
	
	
}
