package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.GuestVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String gName=null,gAddress=null,gNoOfDayStay=null,gPerDayCharge=null;
		
		System.out.print("Enter Guest Name");
		gName=scn.next();

		System.out.print("Enter Guest Address");
		gAddress=scn.next();
		
		System.out.print("Enter No of dAys stays");
		gNoOfDayStay=scn.next();

		System.out.print("Enter Per day charges");
		gPerDayCharge=scn.next();
		
		GuestVO vo=new GuestVO();
		vo.setGuestName(gName);
		vo.setGuestAddress(gAddress);
		vo.setNoOfDayStays(gNoOfDayStay);
		vo.setPerDayCharge(gPerDayCharge);
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		MainController controller=factory.getBean("controller", MainController.class);
		
		try {
			
		String msg=controller.processGuest(vo);
		System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
