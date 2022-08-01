package com.nt.ConstructorInjectionTest;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMassageGenerator;

public class ConstructorInjectionTest {
	
	public static void main(String[] args) {
		java.util.Date date=new Date();
		int hour=date.getHours();
		int mi=date.getMinutes();
		FileSystemResource fsr=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(fsr);
		
		Object obj=factory.getBean("wmg");
		WishMassageGenerator msgGen=(WishMassageGenerator)obj;
		String msg=msgGen.messageGenerator("Akshay");
		System.out.println(msg);
		System.out.println(hour+"::"+mi);
	}

}
