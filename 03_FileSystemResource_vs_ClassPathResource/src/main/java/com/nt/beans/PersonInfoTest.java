package com.nt.beans;

import java.util.Date;
import java.util.Scanner;

public class PersonInfoTest {
	private Date date;
	Scanner scn=new Scanner(System.in);
	public Date getDate() {
		return date;
	}

	
	
	public void setDate(Date date) {
		this.date=date;
	}
		
	public String getPersonInfo(String pname)  {
		System.out.println("Name of person is::"+pname);
		System.out.print("Enter Weight of Person::");
		double weight=scn.nextDouble();scn.nextLine();
		System.out.print("Office visiting Time is (Current time)::");
		int hours=date.getHours();
		System.out.println(hours);
		System.out.println("*****************");
		java.util.Date date1=new java.util.Date();
		System.out.print("Details recording time is::");
		try {
		Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(date1);
		return " "+pname;
		
	}
}	
