package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();// 22

		if (age >= 18) {
			System.out.println("You are Eligible for Voting or Driving ");
		} else {
			System.out.println("Babu niku inka time undi ra !!");
			System.out.println("Good Morning !! Have a nice day !!");
		}

		sc.close();
		System.out.println("main method ended ");
	}

}
