package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class AnnoBasedAppTest {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		ClassPathXmlApplicationContext apac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		System.out.println("Enter Employee Name::");
		String name=scn.next();
		
		System.out.println("Enter Employee Address::");
		String add=scn.next();
		
		System.out.println("Enter Employee Basic Salary::");
		String sal=scn.next();
		
		
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(name);
		vo.setEaddress(add);
		vo.setBasicSal(sal);
		
		MainController controller=apac.getBean("controllerid", MainController.class);
		
		try {
			String msg=controller.processEmployee(vo);
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
	}

}
