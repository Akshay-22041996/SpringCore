package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class SingleTonTest {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Flipkart fpkt=cpac.getBean("flkt", Flipkart.class);
		String msg=fpkt.shopping(new double[] {1000,500,500,1000,200}, 
								 new String[] {"Clothes","shoes","tie","food"});
		
		System.out.println(msg);
		
	}
}
