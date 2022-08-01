package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealTimeDITest {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		String ename=null,eaddress=null,basicSalary=null;
		System.out.print("Enter Employee Name::");
		ename=scn.next();
		
		System.out.print("Enter Employee address::");
		eaddress=scn.next();
		
		System.out.print("Enter Employee basic salary::");
		basicSalary=scn.next();
		
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(ename);
		vo.setEaddress(eaddress);
		vo.setBasicSalary(basicSalary);
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		MainController controller=factory.getBean("controller", MainController.class);
		
		try {
		String msg=controller.processEmployeeDetails(vo);
		System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
	}
}
