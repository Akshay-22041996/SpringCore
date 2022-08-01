package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.service.Calculator;

public class MethodReplacerTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Calculator cal=factory.getBean("cal", Calculator.class);
	
		cal.substraction(10, 50, 80);
		System.out.println(cal.multiplication(5, 5, 5));
		System.out.println(cal.addition(102.5, 40, 58, 0.5));
	}

}
