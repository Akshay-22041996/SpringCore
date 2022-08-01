package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PaymentMode;

public class DependencyLookupTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		PaymentMode pm=cpac.getBean(PaymentMode.class);
		System.out.println(pm.cashPayment());
		System.out.println(pm.shoppingInMall());
		System.out.println("End of execution");
		cpac.close();
	}

}
