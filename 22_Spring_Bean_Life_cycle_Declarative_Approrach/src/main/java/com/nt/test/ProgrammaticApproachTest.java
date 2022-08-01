package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ValidatingVoterAge;

public class ProgrammaticApproachTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ValidatingVoterAge va=cpac.getBean("voter", ValidatingVoterAge.class);
		String msg=va.validateVoter();
		System.out.println(msg);
		cpac.close();
	}

}
