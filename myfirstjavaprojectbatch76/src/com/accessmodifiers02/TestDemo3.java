package com.accessmodifiers02;

import com.accessmodifiers01.TestDemo1;

public class TestDemo3 extends TestDemo1{

	public static void main(String[] args) {
		System.out.println("main method started from TestDemo3 ");

		TestDemo1 t1 = new TestDemo1();

//		Accessing the default data members outside of the packages is not possible.
//		System.out.println(t1.sid2);
//		System.out.println(t1.sname2);
//		t1.method2();

//		Accessing the public data members outside of the packages 
		System.out.println(t1.sid3);
		System.out.println(t1.sname3);
		t1.method3();

		
//		protected scope is 
//		within the class + Within the package + 
//		Outside of the packages of Sub classes with sub class object reference only.
//		Accessing the protected data members outside of  the package is not possible directly. 
//		System.out.println(t1.sid4);
//		System.out.println(t1.sname4);
//		t1.method4();
		
//		We can access protected data, outside of the packages of sub classes with sub class object reference variable only.
//		we cannot access super class object reference variable.
		TestDemo3 t3 = new TestDemo3();
		System.out.println(t3.sid4);
		System.out.println(t3.sname4);
		t3.method4();
		
		
		System.out.println("main method ened ");

	}
}
