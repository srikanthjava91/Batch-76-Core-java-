package com.javaintro;

public class TestDemo3 {

	static TestDemo3 t = new TestDemo3();

//	In any static methods, we can call static methods directly. 
	static void method1() {
		method2();
		System.out.println("method1 called ");
	}

//	In static methods, If we want to call instance methods, We must need to create Object.
	static void method2() {
		t.method3();
		System.out.println("method2 called ");
	}

//	In instance methods, We can call instance methods directly.
	void method3() {
		method4();
		System.out.println("method3 called ");
	}

//	In instance methods, We can call static methods directly.
	void method4() {
		method5();
		System.out.println("method4 called ");
	}

	static void method5() {
		System.out.println("method5 called ");
		t.method6();

	}

	void method6() {
		System.out.println("method6 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated !");
		method1();

		System.out.println("main method ended !");
	}
}
