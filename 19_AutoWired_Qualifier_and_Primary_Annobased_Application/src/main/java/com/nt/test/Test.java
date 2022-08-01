package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.NareshIt;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		NareshIt nit=cpac.getBean("nit", NareshIt.class);
		
		String msg=nit.salaries(new String[] {"March","April","May"},
								new double[] {20000,10000,15000});
		System.out.println(msg);

	}

}
