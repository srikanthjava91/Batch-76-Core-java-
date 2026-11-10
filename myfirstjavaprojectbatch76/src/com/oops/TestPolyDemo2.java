package com.oops;

public class TestPolyDemo2 {

	void main() {
		add();
		add(100);
		add(100L);
		add(100F);
		add(100D);
	}

	void add() {
		System.out.println("add method with no arg called !!");
	}

//	return type is not part of method overloading
//	method overloading means parameters must be different 
//	i) Number of parameters must be different
//	ii) Types of Parameters must be different 
//	iii) Order of Parameters must be different  
//	int add() {
//	System.out.println("add method with no arg called !!");
//	return 100;
//}

	void add(int i) {
		System.out.println("add method with int arg called !!");
	}

	void add(long i) {
		System.out.println("add method with long arg called !!");
	}

	void add(float f) {
		System.out.println("add method with float arg called !!");
	}

	void add(double i) {
		System.out.println("add method with double arg called !!");
	}

	void add(char i) {
		System.out.println("add method with char arg called !!");
	}

}
