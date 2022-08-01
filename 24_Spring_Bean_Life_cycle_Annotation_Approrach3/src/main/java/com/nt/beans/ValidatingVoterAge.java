package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@PropertySource(value = "com/nt/commons/info.properties")
@Component("voter")
public class ValidatingVoterAge {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
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
	@PostConstruct
	public void myInit() {
		System.out.println("ValidatingVoterAge.myInit()");
		
		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid name or age");
	}
	@PreDestroy
	public void myDistroy() {
		
		System.out.println("ValidatingVoterAge.myDistroy()");
		name=null;
		age=0;
		date=null;
		
	}
	
	
	public String validateVoter() {
		date=new Date();
		if(age>18) {
			
			return "Mr/miss/Mrs." +name + " you are eligable for voting "+date;
		}else {
			return "Mr/miss/Mrs." +name + " you are not eligable for voting";
		}
		
	}
}
