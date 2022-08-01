package com.nt.sbeans;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0 param constructor");
	}
	
	public String messageGenerator(String name) {
	
		int hour=ldt.getHour();
		
		if(hour<12)
			return "Good Morning::" +name;
		else if(hour<16)
			return "Good Afternoon::"+name;
		else if(hour<20)
			return "Good evening::"+name;
		else
			return "Good night::"+name;
	}
	
}
