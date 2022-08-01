package com.nt.methodreplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("ciamr")
public class CalculateInterestAmountMethodReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		double amt=(double)args[0];
		double rate=(double)args[1];
		double timespan=(double)args[2];
		
		double simInt=amt*rate*timespan/100;
		return "Simple Interest is::"+simInt;
	}
	
	
}
