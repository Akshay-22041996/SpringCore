package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessageGenerator;

public class DefaultBeanFactory_Test {
	
	public static void main(String[] args) {
		
		//Creating IOC container using DefaultListableBeanFactory
		DefaultListableBeanFactory dlb=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(dlb);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		WishMessageGenerator generator=dlb.getBean("wmg", WishMessageGenerator.class);
		String msg=generator.generateMessage("Akshay");
		System.out.println(msg);
	}
}
