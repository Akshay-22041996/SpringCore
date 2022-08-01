package com.nt.comps;

public class Student extends Person {
	private int sno;
	private String course;
	private String faculty;
	

	public Student(String pname, AadharDetails details, int sno, String course, String faculty) {
		super(pname, details);
		this.sno = sno;
		this.course = course;
		this.faculty = faculty;
		System.out.println("Student class constructor");
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", course=" + course + ", faculty=" + faculty + "]"+super.toString();
	}





}
