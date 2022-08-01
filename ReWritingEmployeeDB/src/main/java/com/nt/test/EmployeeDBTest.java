package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class EmployeeDBTest {

	public static void main(String[] args) {
	
		String ename=null,eaddress=null,emplbsal=null;
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Employee Name::");
		ename=scn.next();
		
		System.out.print("Enter Employee address::");
		eaddress=scn.next();
		
		System.out.print("Enter Employee basic salary::");
		emplbsal=scn.next();
		
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(ename);
		vo.setEaddress(eaddress);
		vo.setbSalary(emplbsal);
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		MainController cont=factory.getBean("controller", MainController.class);
		
		try {
		String msg=cont.processEmployee(vo);
		System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
