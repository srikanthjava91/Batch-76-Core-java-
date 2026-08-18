package com.langfundamentals;

//No Return type + With Parameters 
//WAP to calculating values based your input..?
// Arithmetic Operators 
// + - * / % 
//sum Difference Product Quotient Reminder 
//  98/5 --> 19 (Q)
// 98 % 5 --> 3 (R) --> 1/10 --> 1 --> 0 
public class TypesMethodsDemo2 {

	static void addition(int a, int b) {// a, b are the parameters
//		String + anything is String 
//		BODMAS --> 
		System.out.println("Sum  of Two numbers : " + (a + b));
	}

	static void subtraction(float a, float b) {
		System.out.println("Difference of two numbers : " + (a - b));
	}

	static void modulus(float f1, double d2) {
		System.out.println("Reminder of Two numbers " + (d2 % f1));
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

//		Call by value 
		addition(10, 10);// 10, 10 --> arguments

//		Call by value 
		subtraction(765F, 234F);
		
		
		modulus(9, 165);

		System.out.println("main method ended !!");
	}
}
