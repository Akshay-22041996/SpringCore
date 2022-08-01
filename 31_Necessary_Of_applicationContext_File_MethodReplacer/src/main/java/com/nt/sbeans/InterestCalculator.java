package com.nt.sbeans;

import org.springframework.stereotype.Component;


public class InterestCalculator {
	
	public String calculateInterestAmount(double amt,double rate,double timespan) {
		
	 double comInt= (amt*Math.pow(1+rate/100, timespan)-amt);
	 return "Compound interest is::"+comInt;
	}
}
