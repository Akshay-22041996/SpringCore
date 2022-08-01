package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Filpkart;


public class AliseTest {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Filpkart fpkt=acac.getBean("fpkt", Filpkart.class);
		
		fpkt.assignCourier();

	}

}
