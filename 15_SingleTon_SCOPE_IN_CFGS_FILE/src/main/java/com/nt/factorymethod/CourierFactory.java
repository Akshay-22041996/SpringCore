package com.nt.factorymethod;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;

public class CourierFactory {
	private Courier courier;
	
	public static Courier getInstance(String type) {
		Courier cour=null;
		if(type.equalsIgnoreCase("dtdc")) {
			cour=new DTDC(1, 200.0, 40.0, "DTDC");
			return cour;
		}
		else if(type.equalsIgnoreCase("bdart")) {
			cour=new BlueDart(2, 200.0, 10.0, "BlueDart", "HYD");
			return cour;
		}
		else {
			throw new IllegalArgumentException();
		}
			
	}
}
