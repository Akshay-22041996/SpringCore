package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodTest {

	public static void main(String[] args) {
	
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Class c1=factory.getBean("b1",Class.class);
		System.out.println("Class Properties::"+c1.hashCode()+"  "+c1.toString());

		System.out.println("********************************************************");
		Calendar cal=factory.getBean("cal", Calendar.class);
		System.out.println("Calender Properties::"+cal.hashCode()+"  "+cal.toString());
		
		System.out.println("********************************************************");
		Properties sys=factory.getBean("sys", Properties.class);
		System.out.println("System Class properties::"+sys.toString()+"   "+sys.hashCode());
		
		System.out.println("********************************************************");
		A aclass=factory.getBean("anon", A.class);
		System.out.println("A class object is created and executed"+aclass.toString()+"  "+aclass.hashCode());
	
		
	}

}
