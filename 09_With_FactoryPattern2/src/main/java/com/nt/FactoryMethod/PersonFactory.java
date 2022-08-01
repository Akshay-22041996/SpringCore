package com.nt.FactoryMethod;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class PersonFactory {
	
	public static Person getPerson(String type) {
		Person per=null;
		AadharDetails details=null;
		
		if(type.equalsIgnoreCase("emp")) {
			details=new AadharDetails(12345678965L, 995641225L);
			per=new Employee("Raja", 24, details, "HCL", 49325.0, "Developer", "Munde");
		}else if(type.equalsIgnoreCase("stud")) {
			details=new AadharDetails(321452565L, 7078958585L);
			per=new Student("Gajya", 14, details, 22, "Java");
		}else if(type.equalsIgnoreCase("Cust")) {
			details=new AadharDetails(2213211525L, 98789582L);
			per=new Customer("Ghost", 36, details, 25315252, 3225.02);
			
		}else {
			throw new IllegalArgumentException();
		}
		return per;
	}
}
