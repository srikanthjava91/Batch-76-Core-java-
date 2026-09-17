package com.logicalstatements.loops;

//WAP to print sum of its digits : 
//Q) WAP to print Sum of its the Digits ..? 
//Q) WAP to print the Count the Given number ..? 

public class TestLPDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int sum = 0;
		int n = 12345;
		int count = 0;

		for (int i = 0; i < n; n = n / 10) {
			int r = n % 10;// 3 2 1
			sum = sum + r;// 3+ 2 + 1 = 6
			count++;
		}

		System.out.println(sum);
		System.out.println(count);

	}

}
