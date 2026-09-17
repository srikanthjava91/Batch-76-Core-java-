package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP TO PRINT THE GIVEN NUMBER IS A PALINDROME OR NOT ..? 
public class TestLPDemo22 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a Palindrome or not ..? ");
		int n = sc.nextInt();
		boolean status = isPalin(n);

		if (status) {
			System.out.println("The Given number is Palin ");
		} else {
			System.out.println("The Given number is not Palindrome ");
		}

		System.out.println("main method ended ");
	}

	static boolean isPalin(int n) {
		boolean flag = false;

		int temp = n;
		int r = 0;
		int rev = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		
		if(rev == temp) {
			flag = true;
		}

		return flag;
	}

}
