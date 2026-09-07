package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo10 {

	String weekInfo(int n) {
		String week = switch (n) {

		case 1 -> {
			System.out.println("Actual Day 1 is Sunday only ");
			yield "Sunday";
		}

		case 2 -> {
			yield "Monday";
		}

		case 3 -> {
			yield "Tuesday";
		}

		case 4 -> {
			yield "Wednesday";
		}

		case 5 -> {
			yield "Thursday";
		}

		case 6 -> {
			yield "Friday";
		}

		case 7 -> {
			yield "Saturday";
		}

		default -> "Invalid";
		};

		return week;
	}

	void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String week = weekInfo(n);
		System.out.println("Week inforation  : " + week);
	}
}
