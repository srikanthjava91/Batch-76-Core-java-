package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP TO CONVERT DECIMAL NUMBER TO Binary NUMBER ..?
//input is : 10 
//output : 1010 
public class TestLPDemo23 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		convertDecimalToBinary(n);

		System.out.println("main method ended ");

	}

	static void convertDecimalToBinary(int n) {

		int r = 0;
		String str = "";

		while (n > 0) {
			r = n % 2;// 18%2=0,9%2==1,4%2=0, 2%2 = 0, 1%2 = 1
			n = n / 2; // 18/2 = 9,9/2=4,4/2= 2,2/2=1,1/2=0
			str = r + str;
		}

		System.out.println("The Binary value for Given Decimal is : " + str);

	}

}
