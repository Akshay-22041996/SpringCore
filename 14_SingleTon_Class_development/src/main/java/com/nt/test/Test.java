package com.nt.test;

//design normal java class
public class Test {

	private static Test test;
	private Test() {
		System.out.println("Test class 0 param constructor");
	}
	
	public static Test getInstance() {
		test=new Test();
		System.out.println("Test class getINstance method");
		return test;
	}
}
