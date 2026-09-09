package com.logicalstatements.loops;

import java.util.Scanner;

///Q) WAP to print the Given number is Perfect or not ..? 
///Perfect number means : 
///Sum of the Factors is equals to the Given number which excludes the given number.
//
///6 --> 1 2 3 = 6 
///28 --> 1 2 4 7 14 = 28 
///496 & 8128 
public class TestLPDemo6 {

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean status = isPerfect(n);

		if (status) {
			System.out.println("The Given number is Perfect : ");
		} else {
			System.out.println("The Given number is not a Perfect : ");
		}

	}

}
