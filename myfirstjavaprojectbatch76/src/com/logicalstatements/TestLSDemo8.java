package com.logicalstatements;

import java.util.Scanner;

//WAP To Calculate two numbers and give me the result ..? 
///Cannot switch on a value of type double. 
///Only convertible int values, strings or enum variables are permitted
public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("Calculator info : ");

		String yn = "";

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter a first number : ");
			int a1 = sc.nextInt();

			System.out.println("Enter a second number : ");
			int a2 = sc.nextInt();

			System.out.println("Enter a Symbol to claculate the values : ");
			String sym = sc.next();

			double result = 0;

			switch (sym) {

			case "+" -> {
				System.out.println("The values are calculating with addition");
				result = a1 + a2;
			}

			case "-" -> {
				System.out.println("The values are calculating with Subtraction");
				result = a1 - a2;
			}

			case "*" -> {
				System.out.println("The values are calculating with Multiplication");
				result = a1 * a2;
			}
			case "/" -> {
				System.out.println("The values are calculating with Divison");
				result = a1 / a2;
			}

			case "%" -> {
				System.out.println("The values are calculating with Divison");
				result = a1 % a2;
			}

			default -> System.out.println("Entered symbol is invalid");

			}

			System.out.println("The Resulted values : " + result);
			System.out.println("Do You want to Continue ..? Click Y for Yes or N for No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		
		System.out.println("EXIT");
	}

}
