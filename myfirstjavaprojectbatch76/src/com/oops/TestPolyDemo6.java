package com.oops;

//var-args : Variable arguments 
public class TestPolyDemo6 {

	void main(String[] args) {

		System.out.println("main method started ");

		addition();
		addition("A", 10);
		addition("B", 20, 30);
		addition("C", 20, 30, 40);
		addition("D", 30, 40, 50);
		addition("E", 30, 40, 50, 60);

		System.out.println("main method ended ");
	}

	void addition() {
		System.out.println("addition method called with no args ");
	}

	// variable argument : The variable argument type int of the method
//	addition must be the last parameter
	void addition(String s, int... numbers) {
		int sum = 0;

		for (int n : numbers) {
			sum = sum + n;
		}
		System.out.println("addition method called with one args " + sum);
	}

//	void addition(int i, int j) {
//		System.out.println("addition method called with two args " + (i + j));
//	}
//
//	void addition(int i, int j, int k) {
//		System.out.println("addition method called with 3 args " + (i + j + k));
//	}
//
//	void addition(int i, int j, int k, int l) {
//		System.out.println("addition method called with 4 args " + (i + j + k + l));
//	}
//
//	void addition(int i, int j, int k, int l, int m) {
//		System.out.println("addition method called with 4 args " + (i + j + k + l + m));
//	}

}
