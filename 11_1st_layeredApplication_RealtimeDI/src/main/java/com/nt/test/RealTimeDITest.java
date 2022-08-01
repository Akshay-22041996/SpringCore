package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVo;

public class RealTimeDITest {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		String cname=null,caddre=null,pamt=null,timePeriod=null,rateOfInt=null;
		if(scn!=null) {
			System.out.print("Enter Customer Name::");
			cname=scn.next();
			
			System.out.print("Enter Customer address::");
			caddre=scn.next();
			
			System.out.print("Enter Customer principal amt::");
			pamt=scn.next();
			
			System.out.print("Enter time Period::");
			timePeriod=scn.next();
			
			System.out.print("Enter rate of interese::");
			rateOfInt=scn.next();
		}
		
		CustomerVo vo=new CustomerVo();
		vo.setCaddre(caddre);vo.setCname(cname);vo.setPamt(pamt);vo.setTimePeriod(timePeriod);
		vo.setRoInterest(rateOfInt);

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		MainController controller=factory.getBean("controller", MainController.class);
		
		try {
			String resultMsg=controller.processCustomer(vo);
			System.out.println(resultMsg);
		}catch(Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
			
		}
		
	}

}
