package com.logicalstatements.loops;

import java.util.Scanner;

///The factor of a number, in math, 
///is a divisor of the given number that divides it completely, 
///without leaving any remainder.
////Q) WAP to print Factors or Divisors of a Given Number ..?  
///input : 6 
///output : 1 2 3 6
/// 
///input : 12 
///output : 1 2 3 4 6 12 
///
///input : 24 
///output : 1 2 3 4 6 8 12 24 
///
///input : 28 : 
///output : 1 2 4 7 14 28 
public class TestLPDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		findFactors(n);
	}

	static void findFactors(int n) {
		System.out.println("find factors called ");

		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");// 1 2 5 10
			}
		}
		System.out.println(n);
	}
}
