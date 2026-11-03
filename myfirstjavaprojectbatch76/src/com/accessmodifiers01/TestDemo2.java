package com.accessmodifiers01;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method strated from TestDemo2");

//		If the constructor is, we cannot create object outside of the classes.
		TestDemo1 t1 = new TestDemo1();

//		If the data is private, we cannot access the data outside of the classes.
//		CE : The field TestDemo1.sid is not visible
//		CE : The field TestDemo1.sname is not visible
//		CE : The method method1() from the type TestDemo1 is not visible
//		System.out.println(t1.sid);
//		System.out.println(t1.sname);
//		t1.method1();

//		Accessing the default data members outside of the class.
		System.out.println(t1.sid2);
		System.out.println(t1.sname2);
		t1.method2();

//		Accessing the public data members within the package. 
		System.out.println(t1.sid3);
		System.out.println(t1.sname3);
		t1.method3();

//		Accessing the protected data members within the package. 
		System.out.println(t1.sid4);
		System.out.println(t1.sname4);
		t1.method4();

	}

}
