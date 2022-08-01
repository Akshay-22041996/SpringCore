package com.nt.comp;

public class Chemistry implements IFaculty {

	@Override
	public String teachingSubject(String subName) {
		System.out.println(" Chemistry class is executed");
		return subName +" is teaches by Haldar";
	}

	public Chemistry() {
		super();
		System.out.println("Chemistry.Chemistry()");
	}

	
}
