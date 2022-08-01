package com.nt.test;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;

public class InternationalizationTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cpac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Locale locale=new Locale(args[0], args[1]);
		
		String msg1=cpac.getMessage("msg",new String[] {} , locale);
		String msg2=cpac.getMessage("msg.bye", new String[] {}, locale);
		
		System.out.println(msg1+ "  "+msg2);
	}

}
