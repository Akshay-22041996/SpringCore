package com.nt.comps;

public class Employee extends Person {
	
	private String comName;
	private double sal;
	private int eid;

	public Employee(String pname, AadharDetails details, String comName, double sal, int eid) {
		super(pname, details);
		this.comName = comName;
		this.sal = sal;
		this.eid = eid;
		System.out.println("Employee class constructor");
	}

	@Override
	public String toString() {
		return "Employee [comName=" + comName + ", sal=" + sal + ", eid=" + eid + "]"+super.toString();
	}


	
}
