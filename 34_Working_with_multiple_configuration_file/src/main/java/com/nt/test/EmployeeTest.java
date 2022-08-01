package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext cpac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		MainController controllertest=cpac.getBean("controllerxml",MainController.class);
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Employee Name::");
		String name=scn.next();
		
		System.out.print("Enter Employee address::");
		String address=scn.next();
		
		System.out.print("Enter Employee basic salary::");
		String bsal=scn.next();
		
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(name);
		vo.setEaddress(address);
		vo.setBasicSal(bsal);
		
		String msg=controllertest.processEmployee(vo);
		System.out.println(msg);
		System.out.println("Employee registratin completed");
	}

}
