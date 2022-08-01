package com.nt.comp;

public class Physics implements IFaculty {

	@Override
	public String teachingSubject(String subName) {
		System.out.println("Physics class is executed");
		return subName +" is teaches by Golhar mam";
	}

	public Physics() {
		super();
		System.out.println("Physics.Physics()");
	}

	
}
