package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PatientVo;

public class RealTimeDI {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Enter patient Name::");
		String pname=scn.next();
		
		System.out.print("Enter patient Address::");
		String paddrss=scn.next();
		
		System.out.print("Enter patient No of day admit::");
		String noOfDayAdmit=scn.next();
		
		System.out.print("Enter per day charges::");
		String perDayCharges=scn.next();
		
		PatientVo patvo=new PatientVo();
		patvo.setPname(pname);
		patvo.setPaddress(paddrss);
		patvo.setNoOfDayAdmit(noOfDayAdmit);
		patvo.setPerDayCharge(perDayCharges);
		

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		MainController controller=factory.getBean("controller", MainController.class);
		
		try {
			String msg=controller.processPatient(patvo);
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}

}
