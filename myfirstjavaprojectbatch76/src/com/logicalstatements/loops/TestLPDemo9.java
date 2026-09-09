package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Factorial of given number using Recursion ..? 
public class TestLPDemo9 {

	static long fact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		long fn = fact(n);
		System.out.println("Factorial Number is : " + fn);
	}

}
