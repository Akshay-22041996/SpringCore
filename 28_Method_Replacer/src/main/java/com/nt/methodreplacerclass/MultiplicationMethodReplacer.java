package com.nt.methodreplacerclass;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MultiplicationMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Method executed from MultiplicationMethodReplacer class");
		double a=(double)args[0];
		double b=(double)args[1];
		double c=(double)args[2];
		
		double multi=a*b*c;
		return "Result coming from MultiplicationMethodReplacer class::"+multi;
	}

}
