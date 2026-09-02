package com.logicalstatements;

import java.util.Scanner;

//WAP to check the Eligibility for Marriage in Matrimonial sites.
public class TestLSDemo3 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Can you Please Enter your Name : ");
		String name = sc.nextLine();
		System.out.println("Hello Mr " + name + " Nice to meet you !!");

		System.out.println("Can You please enter your assets : ");
		double assets = sc.nextDouble();

		System.out.println("Can you please enter your salary : ");
		double salary = sc.nextDouble();

		if (assets >= 50000000.00 && salary >= 2500000.00) {
			System.out.println("Oh Great to know !! Lets continue the discussion ");

			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			if (age >= 26 && age <= 29) {
				System.out.println("Nice to hear, We will continue the discussion !!");

				System.out.println("Can you please enter your height");
				float height = sc.nextFloat();

				System.out.println("Can you please enter your Weight");
				double weight = sc.nextDouble();

				if ((height >= 5.6 && height <= 6.1) && (weight >= 65 && weight <= 72)) {
					System.out.println("Cool will continue the discussion !!");

					System.out.println("Do you have any Siblings ");
					boolean sibStatus = sc.nextBoolean();

					if (!sibStatus) {
						System.out.println("Okay !! Will get Back to you soon ");
					} else {
						System.out.println("OMG !!! Sorry to continue !!");
					}

				} else {
					System.out.println(
							"Your height or Weight not matching with our profile, If it is Weight you must join in Gym ");
				}

			} else {
				System.out.println("Sorry Your age is not matching with our profile !");
			}

		} else {
			System.out.println("You can leave for the day !! ");
		}

	}
}
