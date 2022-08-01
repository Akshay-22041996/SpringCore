package com.nt.test;

import java.lang.reflect.Constructor;

public class ReflectionAPI_instantiation {

	public static void main(String[] args) {
		
		try {
			Class c=Class.forName(args[0]);
			Object obj1=c.newInstance();
			System.out.println("obj1::"+obj1.toString());
			System.out.println("----------------------------");
			Constructor con[]=c.getDeclaredConstructors();
//		// For counting no of constructor in a array
			System.out.println(con.length);
			System.out.println(con[0]+" (2)"+con[1]+ "(3)"+con[2]);
			con[1].setAccessible(true);
			Object obj2=con[1].newInstance(2,4);
			
			System.out.println("object2::"+obj2.toString());
			System.out.println("------------------------------");
		
			Object obj3=con[2].newInstance();
			System.out.println("Object 3::"+obj3.toString());
			
			System.out.println("------------------------------");
			Object obj4=con[0].newInstance(7);
			System.out.println("obj4::"+obj4.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
