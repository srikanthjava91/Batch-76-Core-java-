package com.logicalstatements.loops;

import java.util.Scanner;

//A prime number (or a prime) is a natural number greater than 1
//that is not a product of two smaller natural numbers. 
//A natural number greater than 1 that is not prime is called a composite number. 
//For example, 5 is prime because the only ways of writing it as a product, 
//1 × 5 or 5 × 1, involve 5 itself. 
//However, 4 is composite because it is a product (2 × 2) in which both numbers are smaller than 4.

public class TestLPDemo15 {

	static boolean checkPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;

	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many prime numbers, you are looikng for ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (checkPrime(i)) {
				System.out.println(i);// 2 3
			}
		}
	}
}
