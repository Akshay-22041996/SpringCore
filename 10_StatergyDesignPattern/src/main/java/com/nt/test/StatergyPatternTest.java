package com.nt.test;

import com.nt.component.NereshIt;
import com.nt.factory.StudentFactory;

public class StatergyPatternTest {

	public static void main(String[] args) {
		
		
		NereshIt nit=StudentFactory.getStudent("jav");
		
		String resultMsg=nit.registration(new double[] {2500,2000,3500,3000,7000}, new String[] {"core java","oracle","adv java","hibernate","spring"});
		System.out.println(resultMsg);
	}

}
