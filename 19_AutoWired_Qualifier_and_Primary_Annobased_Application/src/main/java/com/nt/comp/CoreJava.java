package com.nt.comp;

import org.springframework.context.annotation.Primary;


public class CoreJava implements IFaculty {

	@Override
	public String teachingSubject(String subName) {
		System.out.println("Corejava class is executed");
		return subName +" is teaches by Hari Krishna";
	}

	public CoreJava() {
		super();
		System.out.println("CoreJava.CoreJava()");
	}

	
}
