package com.arrays;

public class TestARrDemo15 {

	public static void main(String[] args) {

		int[][] arr[] = { { {1,2,3,4},{5,6,7},{8,9} }
						 ,{ {11,12,13,14},{15,16,17} }
						 ,{ {21,22,23},{24},{25,26,27},{28} } };

		System.out.println(arr);
		
		for (int[][] a2 : arr) {
		for (int[] a1 : a2) {
			for (int a : a1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	}

}
