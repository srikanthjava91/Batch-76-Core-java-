package com.arrays;

public class TestArrDemo12 {

	public static void main(String[] args) {

		int[][] numbers = { { 10, 20, 30 }, { 40, 50 }, { 60 }, { 70, 80, 90, 100 } };
		System.out.println(numbers);

//		for (int[] num1 : numbers) {
//			for (int n : num1) {
//				System.out.print(n + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	}
}
