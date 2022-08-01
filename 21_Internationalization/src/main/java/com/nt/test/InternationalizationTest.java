package com.nt.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InternationalizationTest {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext cpac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Locale locale=new Locale(args[0],args[1]);
		
		String msg1=cpac.getMessage("msg.wish", new String[] {}, locale);
		
		String msg2=cpac.getMessage("msg.dia", new String[] {}, locale);
		
		System.out.println(msg1+"   "+msg2);
	}

}
