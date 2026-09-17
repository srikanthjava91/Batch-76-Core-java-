package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP TO PRINT THE GIVEN NUMBER IN REVERSE ORDER..? 
public class TestLpDemo20 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 345
		int rev = reverseNumber(n);
		System.out.println("The reverse number of a Given number is : " + rev);

		if (n == rev) {
			System.out.println("The Given number is Palindrome ");
		} else {
			System.out.println("The Given number is not a Palindrome ");
		}
		
		sc.close();

	}

	private static int reverseNumber(int n) {

		int rev = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;// 345%10--> 5, 34%10=4, 03%10 -->3
			n = n / 10;// 345/10--> 34,34/10= 3, 03/10 --> 0
			rev = rev * 10 + r;// 5, 54, 543

		}
		return rev;
	}

}
