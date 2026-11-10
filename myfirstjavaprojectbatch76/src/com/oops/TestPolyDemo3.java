package com.oops;

public class TestPolyDemo3 {

	void main(String[] args) {
		System.out.println("main method started ");
//		The method addition(int, float) is ambiguous for the type TestPolyDemo3
		addition(10, 20);
	}

	void addition() {
		System.out.println("no arg parameter called ");
	}

//	void addition(int i, int j) {
//		System.out.println("int int arg parameter called ");
//	}
	
	void addition(int i, float j) {
		System.out.println("int float arg parameter called ");
	}
	
//	void addition(float i, int j) {
//		System.out.println("float int arg parameter called ");
//	}
	
	void addition(float i, float j) {
		System.out.println("float float arg parameter called ");
	}
	

}
