package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class WishApplicationTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(com.nt.config.AppConfig.class);
		
		WishMessageGenerator generator=acac.getBean("wmg", WishMessageGenerator.class);
		String msg=generator.messageGenerator("Akshay");
		System.out.println(msg);
	}

}
