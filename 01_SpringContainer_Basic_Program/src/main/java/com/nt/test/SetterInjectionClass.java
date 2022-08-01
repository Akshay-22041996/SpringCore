package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionClass {
	
	public static void main(String[] args) {
		java.util.Date date=new java.util.Date();
		int hour=date.getHours();
		
		//Hold the name and location of spring bean cfg file in resource object
		FileSystemResource fsr=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//creating spring bean container (IOC container)
		XmlBeanFactory factory=new XmlBeanFactory(fsr);
		
		//get the target spring bean class object injected with dependent spring bean class object
		Object obj=factory.getBean("wmg");
		
		WishMessageGenerator messageGeneartor=(WishMessageGenerator)obj;
		
		String msg=messageGeneartor.generateMessage("Akshay");
		
		System.out.println("Wish message is::"+msg +" "+hour);
	}
}	
