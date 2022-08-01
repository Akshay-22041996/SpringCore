package com.nt.text;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class FactoryPatternProblemTest {
	
	public static void main(String[] args) {
	
		AadharDetails details1=new AadharDetails(1234569875L, 9956412025L);
		
		AadharDetails details2=new AadharDetails(2134569875L, 88746412025L);
		
		AadharDetails details3=new AadharDetails(564569875L, 70706412025L);
		
		Person per=new Employee("Raja", 24, details1,"HCL",45365.0, "Developer", "Munde");
		
		Person per1=new Student("Hari", 19, details2, 22, "java");
		
		Person per2=new Customer("Rahyl", 56, details3, 45604552, 2312.0);
		
		System.out.println(per);
		System.out.println("**************************************************");
		System.out.println(per1);
		System.out.println("**************************************************");
		System.out.println(per2);
		System.out.println("**************************************************");
	}
}
