package com.nt.comp;

public class MathFaculty implements IFaculty {

	@Override
	public String teachingSubject(String subName) {
		System.out.println("MathFaculty class is executed");
		return subName+" is teaches by Shinde Mam";
	}

	public MathFaculty() {
		super();
		System.out.println("MathFaculty.MathFaculty()");
	}

	
}
