package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Laptop;

public class SingleTonScopeTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Laptop lap1=factory.getBean("b1", Laptop.class);
		System.out.println(lap1.hashCode());
		
		Laptop lap2=factory.getBean("b2", Laptop.class);
		System.out.println(lap2.hashCode());
		
		System.out.println("Comparing both object hashcode::"+(lap1==lap2));
	}

}
