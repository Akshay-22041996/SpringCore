package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Courier;
import com.nt.factorymethod.CourierFactory;

public class SingleTonScopeTest {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Courier cur=factory.getBean("cour", Courier.class);
		System.out.println(cur.hashCode());
		
		Courier cur1=factory.getBean("cour", Courier.class);
		System.out.println(cur1.hashCode());
		
		
		
	}
}	
