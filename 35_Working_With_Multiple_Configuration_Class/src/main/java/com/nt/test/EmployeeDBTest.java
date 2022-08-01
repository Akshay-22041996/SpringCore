package com.nt.test;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class EmployeeDBTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		MainController controller=acac.getBean("mainbeanclass", MainController.class);
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Employee Name::");
		String name=scn.next();
		
		System.out.print("Enter Employee address::");
		String addrss=scn.next();
		
		System.out.print("Enter Employee basicSalary::");
		String bSal=scn.next();
		
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(name);
		vo.setEaddress(addrss);
		vo.setBasicSal(bSal);
		
		try {
		String msg=controller.startSavingEmployeeDeatils(vo);
		System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
