package com.nt.comp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

public class NareshIt {
	
	
	
	private IFaculty faculty;

	
	public NareshIt() {
		super();
		System.out.println("NareshIt.NareshIt()");
	}

	
	
	public NareshIt( IFaculty faculty) {
		super();
		this.faculty = faculty;
	}


	@Autowired
	@Qualifier("cj")
	public void setFaculty(IFaculty faculty) {
		this.faculty = faculty;
	}

	public String salaries(String[] mon,double[] amt) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name of subject::");
		String faculty1=scn.next();
		
		double totalamt=0;
		for(double a:amt) {
			totalamt +=a;
		}
		String months="";
		for(String s:mon) {
			months +=(s+",");
		}
		
		String msg=faculty.teachingSubject(faculty1);
		
		return "Name of month working is "+ months +" and total amount of payment is "+totalamt+ " and faculty name is "+msg;
	}
}
