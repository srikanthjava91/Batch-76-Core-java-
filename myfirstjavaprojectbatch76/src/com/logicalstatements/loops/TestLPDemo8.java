package com.logicalstatements.loops;

import java.util.Scanner;

///Q) WAP to print Factorial of a Given number ..?
///input : number --> 5! --> 5 * 4 * 3 * 2 * 1 = 120 
///output : number --> 120 
public class TestLPDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		long fn = findFactorial(n);
		System.out.println("Factorial Number is : " + fn);
	}

	static long findFactorial(int n) {
		long fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;// 5 * 4 *3 *2 *1 = 120
		}

		return fact;
	}

}
