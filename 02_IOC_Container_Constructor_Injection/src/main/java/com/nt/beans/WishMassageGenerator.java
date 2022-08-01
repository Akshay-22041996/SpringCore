package com.nt.beans;

import java.util.Date;

public class WishMassageGenerator {
	
	private Date date;

	public WishMassageGenerator(Date date) {
	
		this.date = date;
	}
	
		public WishMassageGenerator() {
	System.out.println("WishMassageGenerator.0param constructor");
	}
	public void setDate(Date date) {
		this.date = date;
	}


	public String messageGenerator(String user) {
		int hour=date.getHours();
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good AfterNoon::"+user;
		else if (hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
	}
	

}
