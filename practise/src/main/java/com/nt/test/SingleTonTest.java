package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.beans.A;

public class SingleTonTest {

	public static void main(String[] args) throws Exception{
		
		A a1=A.getInstance();
		A a2=A.getInstance();
		A a3=A.getInstance();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println((a1==a2));
		
	}

}
