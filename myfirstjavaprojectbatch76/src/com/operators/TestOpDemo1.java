package com.operators;

import java.util.Scanner;

//WAP to do calculator with methods..? 
///1) Arithmetic Operators 
/// + - *  /  % 
public class TestOpDemo1 {

	void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		int a = 10;
		int b = 20;
		System.out.println("Addition is --> Sum : " + a + b);// 1020
		System.out.println("Addition is : " + (a + b));// 30

//		The operator - is undefined for the argument type(s) String, int
//		System.out.println("Subtraction is : " + b -a );
		System.out.println("Subtraction is ---> Diff : " + (b - a));

//		BODMAS 
		System.out.println("Multiplication --> Product " + a * b);

		int x = 98;
		int y = 4;

//		4)98(24 (Quotient /)        8)765(95 
//		  96                          72
//		----------2(Reminder % )     -----45-40 = 5 
//		2/10 --> 0 --> 2 

		System.out.println("Division is --> quotient : " + x / y);// 98/4 --> 24
		System.out.println("Modulus is --> Reminder : " + x % y);// 2

		System.out.println("Enter first number : ");
		float a1 = sc.nextFloat();

		System.out.println("Enter second number : ");
		double a2 = sc.nextDouble();

		double sum = addition(a1, a2);
		System.out.println("Sum of two numbers are : " + sum);

	}

	double addition(float a, double b) {
		double sum = a + b;
		return sum;
	}

}
