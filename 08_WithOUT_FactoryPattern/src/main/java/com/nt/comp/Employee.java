package com.nt.comp;

public class Employee extends Person {
	
	private String companyName;
	private double sal;
	private String dept;
	private String deptHead;
	
	public Employee(String pname,int age,AadharDetails details,String companyName,double sal,String dept,String deptHead) {
		super(pname,age,details);
		this.companyName=companyName;
		this.sal=sal;
		this.dept=dept;
		this.deptHead=deptHead;
		System.out.println("Employee class:: 7 param constructor");
	}

	@Override
	public String toString() {
		return "Employee [companyName=" + companyName + ", sal=" + sal + ", dept=" + dept + ", deptHead=" + deptHead
				+ ", pname=" + pname + ", age=" + age + ", details=" + details + "]";
	}

	
	
	
}
