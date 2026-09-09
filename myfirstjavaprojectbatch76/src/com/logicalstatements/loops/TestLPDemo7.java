package com.logicalstatements.loops;

import java.util.Scanner;

///Q) WAP to print Math table Based on the Given number ..? 
///input : number --> 9 , 20
///output 
///9 X 1 = 09 
////9 X 2 = 18
////9 X 3 = 27
////9 X 4 = 36 
////9 X 5 = 45 
////9 X 6 = 54 
////9 X 7 = 63 
////9 X 8 = 72
////9 X 9 = 81
////9 X 10 = 90 
public class TestLPDemo7 {

	void mathTable(int n1, int n2) {
		for (int i = 1; i <= n2; i++) {
			System.out.println(n1 + " X " + i + " = " + (n1 * i));
		}
	}

	void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to proceed ");
		int n1 = sc.nextInt();

		System.out.println("Enter a nuber up to where you want to print ");
		int n2 = sc.nextInt();

		mathTable(n1, n2);

	}
}
