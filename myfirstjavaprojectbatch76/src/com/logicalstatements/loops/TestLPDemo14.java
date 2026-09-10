package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print 0 to 100 prime numbers ..?
//
public class TestLPDemo14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many prime number s you want to print ");
		int n = sc.nextInt();// 100

		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	private static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

}
