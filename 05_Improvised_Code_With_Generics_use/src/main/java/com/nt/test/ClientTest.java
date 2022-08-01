package com.nt.test;

import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ClientTest {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		java.util.Date date=new java.util.Date();
		System.out.print("Enter user Name::");
		String user=scn.nextLine();
		
		//internally user java.io.Files class to hold the name and location of configuration file
		
		FileSystemResource fsr=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//Creating BeanFactory IOC container(Spring Container) internally activate SAX parser
		//which load the cfg file check whether it is valid or not ,well formed or not and create inMemory MetaData
		XmlBeanFactory factory=new XmlBeanFactory(fsr);
		
		WishMessageGenerator generator=factory.getBean("wmg", WishMessageGenerator.class);
		String msg=generator.generateMessage(user);
		System.out.println(msg);
		System.out.println("Hours::"+date.getHours()+"-minetes::"+date.getMinutes()+"-Seconds::"+date.getSeconds());
		
	}

}
