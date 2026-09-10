package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Fibonacci Series using for loop ..?
//Fibonacci Series : 0 1 1 2 3 5 8 13 21 34 
public class TestLPDemo10 {

	static void fibbonacciSeries(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + " " + n2);

		for (int i = 1; i <= n - 2; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want to print..");
		int n = sc.nextInt();
		fibbonacciSeries(n);

	}
}
