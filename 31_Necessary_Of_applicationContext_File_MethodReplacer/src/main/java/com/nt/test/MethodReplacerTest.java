package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.InterestCalculator;

public class MethodReplacerTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(AppConfig.class);
	
		InterestCalculator ic=acac.getBean("ic", InterestCalculator.class);
		
		String msg=ic.calculateInterestAmount(10000, 2, 12);
		System.out.println(msg);
	}

}
