package com.nt.test;



public class SingleTonTest {

	public static void main(String[] args) {
	
		DesignOfSingleTonClass d1=DesignOfSingleTonClass.getInstance();
		
		System.out.println("d1 reference variable ::"+ d1.hashCode());
		
		DesignOfSingleTonClass d2=DesignOfSingleTonClass.getInstance();
		System.out.println("d1 reference variable ::"+ d2.hashCode());
		
		System.out.println("Comparing reference of object::"+(d2==d1));
		
		
		System.out.println("**************************************");
		
		Test t1=Test.getInstance();
		Test t2=Test.getInstance();
		
		System.out.println("d1 reference variable ::"+ t1.hashCode());
		System.out.println("d1 reference variable ::"+ t2.hashCode());
		System.out.println("comparing reference of object::"+(t1==t2));
	}

}
