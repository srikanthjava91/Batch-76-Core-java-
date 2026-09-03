package com.logicalstatements;

import java.util.Scanner;

//WAP to print the Cricketer Info Based on their Jersey number ..? 
public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Jersey Number : ");
		int jno = sc.nextInt();

		switch (jno) {

		case 7:
			System.out.println("Mahendra Singh Dhoni !!");
			System.out.println("Cool Captain for India");
			break;
		case 45: 
			System.out.println("Rohit Sharma");
			System.out.println("Hitman for a Reason");
			break;
		case 18: 
			System.out.println("Virat Kohli");
			System.out.println("The most Consistent player in the world");
			break;
		case 1: 
			System.out.println("K L rahul");
			System.out.println("He is Classy Batsman");
			break;
		default:
			System.out.println("Entered Jersey number is not playing today ");

		}
		
		System.out.println("main method ended ");

	}

}
