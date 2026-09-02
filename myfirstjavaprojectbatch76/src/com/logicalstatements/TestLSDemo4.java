package com.logicalstatements;

import java.util.Scanner;

//
public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You Regularity related the Classes ");
		boolean areYouComingToTheClassesRegularly = sc.nextBoolean();

		if (areYouComingToTheClassesRegularly) {
			System.out.println("Good !! The Basic Criteria is Matching to get a job ");

			System.out.println("Enter You Regularity related the Weekly Exams");
			boolean areYouattenindWeeklyExams = sc.nextBoolean();

			if (areYouattenindWeeklyExams) {
				System.out.println("You can crack any written test easily !!");

				System.out.println("Enter You Regularity related the Mock Interviews");
				boolean areYouattendingMocks = sc.nextBoolean();
				if (areYouattendingMocks) {
					System.out.println("If you attend 30+ Mocks You will get a job in your first 3 interviews");
				} else {
					System.out.println(
							"You will also get a job but not in IT.... "
							+ "It sis something else and God will save you ");
				}

			} else {
				System.out.println("Why did you come Hyderabad Just recall !!");
			}

		} else {
			System.out.println("You are Directly Cheating your parents !!");
		}

	}

}
