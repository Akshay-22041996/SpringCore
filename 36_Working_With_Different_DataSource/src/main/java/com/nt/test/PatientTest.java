package com.nt.test;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.controller.MainController;
import com.nt.vo.PatientVO;

public class PatientTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		MainController controller=acac.getBean("controllerbeanclass", MainController.class);
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Patient Name::");
		String pname=scn.next();
		System.out.print("Enter Patient address::");
		String padd=scn.next();
		
		System.out.print("Enter Patient perDayCharges::");
		String perDayCharges=scn.next();
		
		System.out.print("Enter Patient No of days admit::");
		String noOfDayAdmit=scn.next();
		
		PatientVO vo=new PatientVO();
		vo.setPname(pname);
		vo.setPadd(padd);
		vo.setNoOfDayAdmit(noOfDayAdmit);
		vo.setPdayCharge(perDayCharges);
		
		try {
		String msg=controller.processPatient(vo);
		System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
