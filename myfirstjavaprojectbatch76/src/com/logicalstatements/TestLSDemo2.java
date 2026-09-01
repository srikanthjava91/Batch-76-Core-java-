package com.logicalstatements;

import java.util.Scanner;

//WAP to print the Grade based on marks Percentage  ...
public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Educational System !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks Percentage : ");
		double marksP = sc.nextDouble();

		if (marksP >= 100 || marksP < 0) {
			System.err.println("Invalid Marks Percentage : ");
		} else if (marksP >= 90) {
			System.out.println("Grade A");
		} else if (marksP >= 80) {
			System.out.println("Grade B");
		} else if (marksP >= 75) {
			System.out.println("Grade C");
		} else if (marksP >= 60) {
			System.out.println("Grade D");
		} else if (marksP >= 35) {
			System.out.println("Just Passed !");
		}else {
			System.out.println("F- Failed");
		}
	}

}
