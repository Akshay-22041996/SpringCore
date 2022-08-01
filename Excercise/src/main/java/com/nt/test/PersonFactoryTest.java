package com.nt.test;

import com.nt.FactoryMethod.FactoryMethodImpl;
import com.nt.comps.AadharDetails;
import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Student;

public class PersonFactoryTest {

	public static void main(String[] args) {
		
	
	System.out.println(FactoryMethodImpl.getInstance("student"));
		
	}

}
