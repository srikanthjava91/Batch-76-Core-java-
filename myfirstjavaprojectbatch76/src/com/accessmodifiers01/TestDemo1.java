package com.accessmodifiers01;

//If we use private for a class we will get CE like below.
//CE : Illegal modifier for the class TestDemo1; 
//only public,<default>,strictp, abstract & final are permitted.

abstract interface TestIn1 {
	
	public abstract void method1();

}

public class TestDemo1 {

//	private TestDemo1(){
//		System.out.println("no arg constructor ");
//	}

	static {
		System.out.println("static block called from TestDemo1");
	}

	{
		System.out.println("instance block called from TestDemo1");
	}

	public TestDemo1() {
		System.out.println("no arg constructor ");
	}

//	protected data members 
	protected int sid4 = 45;
	protected String sname4 = "Rohit";

	protected void method4() {
		System.out.println("method4 called !");
	}

//	public data members 
	public int sid3 = 18;
	public String sname3 = "Virat";

	public void method3() {
		System.out.println("method3 called ");
	}

//	Whenever, we didn't specify any access modifier will consider as default.
	// default data members
	int sid2 = 7;
	String sname2 = "Dhoni";

	void method2() {
		System.out.println("metho2 called ");
	}

	// private Data members
	private int sid = 1;
	private String sname = "Rahul";

	private void method1() {
		System.out.println("method1 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated !!");

		TestDemo1 t1 = new TestDemo1();

//		Accessing the private data members within the class.
		System.out.println(t1.sid);
		System.out.println(t1.sname);
		t1.method1();

//		Accessing the default data members within the class.
		System.out.println(t1.sid2);
		System.out.println(t1.sname2);
		t1.method2();

//		Accessing the public data members within the class. 
		System.out.println(t1.sid3);
		System.out.println(t1.sname3);
		t1.method3();

//		Accessing the protected data members within the class. 
		System.out.println(t1.sid4);
		System.out.println(t1.sname4);
		t1.method4();

	}

	// A class inside the classes will consider as Inner classes.
	class TestInc1 {

	}

}
