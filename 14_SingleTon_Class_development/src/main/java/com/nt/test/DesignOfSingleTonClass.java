package com.nt.test;

//design singleton java class
public class DesignOfSingleTonClass {
	
	private static DesignOfSingleTonClass dostc;
	
	private DesignOfSingleTonClass() {
		System.out.println("DesignOfSingleTonClass ::0 param constructor");
	}
	
	public static DesignOfSingleTonClass getInstance() {
		
		if(dostc ==null)
			dostc=new DesignOfSingleTonClass();
		return dostc;
	}
}
