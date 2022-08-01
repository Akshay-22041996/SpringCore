package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.A;

public class Test {
	
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext cpac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
	A a1=cpac.getBean("a1", A.class);
	System.out.println(a1.hashCode());
	
	A a2=cpac.getBean("a2", A.class);
	System.out.println(a2.hashCode());
	}
}
