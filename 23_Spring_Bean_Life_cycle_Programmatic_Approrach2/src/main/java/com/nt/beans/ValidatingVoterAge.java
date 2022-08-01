package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ValidatingVoterAge implements DisposableBean,InitializingBean{
	
	private String name;
	private Integer age;
	private Date date;
	
	public void setName(String name) {
		System.out.println("setName method from validating Voter class");
		this.name=name;
		
	}
	
	public void setAge(Integer age) {
		System.out.println("setAge() method from ValidatingVoter Class");
		this.age=age;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ValidatingVoterAge.myInit()");
		date=new Date();
		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid name or age");
	}
	@Override
	public void destroy() throws Exception{
		
		System.out.println("ValidatingVoterAge.myDistroy()");
		name=null;
		age=0;
		date=null;
		
	}
	
	
	public String validateVoter() {
		if(age>18) {
			
			return "Mr/miss/Mrs." +name + " you are eligable for voting"+date;
		}else {
			return "Mr/miss/Mrs." +name + " you are not eligable for voting";
		}
		
	}


}
