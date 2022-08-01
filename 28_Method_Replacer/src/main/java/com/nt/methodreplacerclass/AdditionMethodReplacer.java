package com.nt.methodreplacerclass;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class AdditionMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Method executed from AdditionMethodReplacer class");
		
		double a=(double)args[0];
		int b=(int) args[1];
		long c=(long) args[2];
		double d=(double) args[3];
		
		double res=a+b+c+d;
		return "Result coming from MultiplicationMethodReplacer class::"+res;
	}

}
