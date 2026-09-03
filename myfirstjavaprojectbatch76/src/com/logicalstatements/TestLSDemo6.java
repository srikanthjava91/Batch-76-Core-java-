package com.logicalstatements;

import java.util.Scanner;

//WAP to Give T-shirt Description based on the Size..?
//44- XX-Large
//42 - X_large 
// 40- Large 
//38 - Medium 
//36 - Small 
//34 - X-Small
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Shopping Mall");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a T-shirt Size  : ");
		int size = sc.nextInt();

		switch (size) {

		case 32 -> System.out.println("XX-Small");
		case 34 -> {
			System.out.println("X-Small");
			System.out.println("and the price is 600 rs");
		}

		case 36 -> System.out.println("Small");
		case 38 -> System.out.println("Medium");
		case 40 -> System.out.println("Large");
		case 42 -> System.out.println("X-Large");
		case 44 -> System.out.println("XX-Large");
		default -> System.out.println("The Entered T-shirt size is SOld out ");
		}

	}

}
