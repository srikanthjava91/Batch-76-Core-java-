package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP TO PRINT THE GIVEN NUMBER IS ARMSTRONG OR NOT ..?
//An Armstrong number (also known as a Narcissistic number) is a number 
//that is equal to the sum of its own digits each raised to the 
//power of the number of digits. 
//For example, 153 is an Armstrong number because (1^3 + 5^3 + 3^3 = 153).
//------------------------3 digit Armstrong-----------------------------------
//153 = 3 ==> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 
//370 = 3 ==> 3^3 + 7^3 + 0 = 27 + 343 = 370 
//371 = 3 ==> 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371 
//-----------------------------------------------------------
//1634 = 4 ==> 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634 

public class TestLPDemo21 {

	public static void main(String[] args) {
		System.out.println("main method strated");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number ");
		int n = sc.nextInt();

		boolean status = isArmStrong(n);

		if (status) {
			System.out.println("The given number is armstrong ");
		} else {
			System.out.println("The Given number is not an armstrong");
		}

	}

	static boolean isArmStrong(int n) {
		boolean status = false;

		int sumP = 0;
		int r = 0;
		int temp = n;// 153
		int n1 = n;

//		String str = Integer.toString(n);// Converting int to String 1634
//		int digitsCount = str.length();// 4
		
		int digitsCount = 0;
		while (n1 > 0) {
			n1 = n1 / 10;
			digitsCount++;
		}

		while (n > 0) {
			r = n % 10;// 3 5 1
			n = n / 10;
			sumP = (int) (sumP + Math.pow(r, digitsCount));// 27 + 125 + 1 = 153
		}

		if (sumP == temp) {
			status = true;
		}

		return status;
	}

}
