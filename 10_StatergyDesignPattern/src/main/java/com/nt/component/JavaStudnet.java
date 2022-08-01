package com.nt.component;

public class JavaStudnet implements IStudent {

	@Override
	public String getInstance(int sid) {
		
		
		return sid+" student belongs to java stream";
	}

	public JavaStudnet() {
	System.out.println("JavaStudnet:: 0 param constructor");
	}

}
