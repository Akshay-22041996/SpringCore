package com.nt.comp;

import org.springframework.context.annotation.Primary;


public class Hibernate implements IFaculty {

	@Override
	public String teachingSubject(String subName) {
		System.out.println(" Hibernate class is executed");
		return subName + " is teaches by Natraj sir";
	}

	public Hibernate() {
		super();
		System.out.println("Hibernate.Hibernate()");
	}

	
}
