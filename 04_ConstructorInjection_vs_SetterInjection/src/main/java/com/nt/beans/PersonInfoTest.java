package com.nt.beans;

import java.util.Date;
import java.util.Scanner;

public class PersonInfoTest {

	private int hands;
	private int eyes;
	private String name;
	private String addre;
	
	
	
	public PersonInfoTest(int hands, int eyes, String name) {
		System.out.println("PersonInfoTest.3 param constructor");
		this.hands = hands;
		this.eyes = eyes;
		this.name = name;
	}
	

	public void setAddre(String addre) {
		this.addre = addre;
	}


	Scanner scn=new Scanner(System.in);

		public String getPersonInfo(String pname)  {
		System.out.println("Name of person is::"+pname);
		System.out.print("Enter Weight of Person::");
		double weight=scn.nextDouble();scn.nextLine();
		System.out.print("Office visiting Time is (Current time)::");
	
	
		System.out.println("*****************");
		java.util.Date date1=new java.util.Date();
		System.out.print("Details recording time is::");
		try {
		Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(date1);
		return  toString();
		
	}

		@Override
		public String toString() {
			return "PersonInfoTest [hands=" + hands + ", eyes=" + eyes + ", name=" + name + ", addre=" + addre + "]";
		}
		
}	
