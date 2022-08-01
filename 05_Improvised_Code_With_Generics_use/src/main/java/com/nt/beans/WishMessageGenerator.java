package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateMessage(String user) {
		java.util.Date date=new java.util.Date();
		int hour=date.getHours();
		
		if(hour<12)
			return "Good Moring::"+user;
		else if(hour<16)
			return "Good AfterNoon::"+user;
		else if(hour<20)
			return "Good evening::"+user;
		else
			return "Good night::"+user;
	}
}
