package com.oops;

public class TestPolyDemo4 {

	void main(String[] args) {
		System.out.println("main method started ");
		hello("Java");
//		The method hello(Object) is ambiguous for the type TestPolyDemo4
//		hello(null);
		System.out.println("main method ended ");
	}

	void hello(Object o) {
		System.out.println("Hello method with Object !!");
	}

	void hello(Integer s) {
		System.out.println("Hello method with Integer !!");
	}

	void hello(String s) {
		System.out.println("Hello method with String !!");
	}
}
