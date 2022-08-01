package com.nt.component;

import java.util.Arrays;
import java.util.Random;

public class NereshIt {
	
	private IStudent student;
	private int sid;
	
	
	
	public NereshIt() {
		System.out.println("NereshIt::0param constructor");
	}

	public void setStudent(IStudent student) {
		this.student=student;
	}
	
	public String registration(double fess[],String course[]) {
		sid=new Random().nextInt(500);
		
		double amt=0.0;
		for(double f:fess) {
			amt +=f;
		}
		
		String msg=student.getInstance(sid);
		return Arrays.toString(course)+" total fess is "+amt+"------>"+msg;
	}
}
