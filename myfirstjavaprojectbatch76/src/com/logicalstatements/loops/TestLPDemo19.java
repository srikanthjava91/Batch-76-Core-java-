package com.logicalstatements.loops;

import java.util.Scanner;

//WPA to print sum of the Digits from a Given number ..? 
//input : 564
//output : 15 

//input : 1469
//output : 20 

public class TestLPDemo19 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");

		int n = sc.nextInt();// 123

		int sum = digitsSum(n);
		int count = digitsCount(n);
		System.out.println("Sum of all the digits : " + sum);
		System.out.println("Count of all the digits : " + count);
	}

	static int digitsCount(int n) {
		int count = 0;

		while (n > 0) {
			n = n / 10;
			count++;
		}

		return count;
	}

	static int digitsSum(int n) {

		int sum = 0;// 3
		int r = 0;

		while (n > 0) {
			r = n % 10;// 123%10 --> 3, 12%10 --> 2, 01%10 --> 1
			n = n / 10;// 123/10 --> 12, 12/10 --> 1, 01/10 --> 0
			sum = sum + r;// 3+2 = 5 + 1 = 6
		}

		return sum;
	}

}
