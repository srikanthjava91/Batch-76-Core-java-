package com.operators;

//7) Ternary Operators
//? : 
//syntax : (condition)?Statement1 :statement2;

public class TestTernaryOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 100;
		int b = 50;
		int max = (a > b) ? a : b;

		System.out.println("max value is : " + max);
		System.out.println("--------------------------------");

		int x = 10;
		int y = 20;
		int z = 15;

		int max1 = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
		System.out.println("max1 values : " + max1);
		System.out.println("--------------------------------");

		int age = 18;
		String eligible = (age >= 18) ? "YES" : "NO";
		System.out.println("The Person is ELigible for Driving ..? " + eligible);
		System.out.println("--------------------------------");

		int marks = 75;
		String grade = (marks >= 90) ? "A" : (marks >= 80) ? "B" : (marks >= 70) ? "C" : "D";
		System.out.println("Garde is : " + grade);

		System.out.println("--------------------------------");

	}

}
