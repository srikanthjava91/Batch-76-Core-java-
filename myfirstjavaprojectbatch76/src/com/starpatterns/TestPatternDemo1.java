package com.starpatterns;

public class TestPatternDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		System.out.println("main method ended ");
	}

}
