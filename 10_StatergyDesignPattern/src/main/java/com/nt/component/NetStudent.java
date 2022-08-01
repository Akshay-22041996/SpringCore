package com.nt.component;

public class NetStudent implements IStudent {

	
	
	public NetStudent() {
		System.out.println("NetStudent::0-param consturctor");
	}

	@Override
	public String getInstance(int sid) {
		
		return sid+" student belongs to .Net stream";
	}

}
