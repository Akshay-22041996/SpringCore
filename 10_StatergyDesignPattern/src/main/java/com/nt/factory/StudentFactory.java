package com.nt.factory;

import com.nt.component.IStudent;
import com.nt.component.JavaStudnet;
import com.nt.component.NereshIt;
import com.nt.component.NetStudent;

public class StudentFactory {
	
	
	public static NereshIt getStudent(String studentType) {
		IStudent student=null;
		
		if(studentType.equalsIgnoreCase("java"))
			student= new JavaStudnet();
		
		else if(studentType.equalsIgnoreCase("net"))
			student=new NetStudent();
		
		else
			throw new IllegalArgumentException();
		
		NereshIt nit=new NereshIt();
		nit.setStudent(student);
		return nit;
	}
}
