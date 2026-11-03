package com.starpatterns;

public class TestPatternDemo6 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 5; k >= i; k--) {
				System.out.print(" *");
			}
			System.out.println();

		}

	}

}
