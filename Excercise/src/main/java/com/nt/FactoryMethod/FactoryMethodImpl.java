package com.nt.FactoryMethod;

import com.nt.comps.AadharDetails;
import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class FactoryMethodImpl {
	
	public static Person getInstance(String type) {
		AadharDetails ds=null;
		Person per=null;
		
		if(type.equalsIgnoreCase("st")) {
			ds=new AadharDetails(333333, "Raipur");
			per=new Student("Raja", ds, 22, "java", "HK");
		}else if(type.equalsIgnoreCase("cs")) {
			ds=new AadharDetails(412553525, "Nag");
			per=new Customer("Ramesh", ds, 456.2f, 512456);
		}else if(type.equalsIgnoreCase("em")) {
			ds=new AadharDetails(3213525, "HYD");
			per=new Employee("Rani", ds, "HCL", 46312, 7854);
		}else {
			throw new IllegalArgumentException("Pass valid object");
		}
		return per;
	}
}
