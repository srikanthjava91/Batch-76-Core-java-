package com.arrays;

///Q) WAP to find Min & Max from A given Array ..? 
public class TestArrDemo6 {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 9, 1, 3 };

		int min = arr[0];// 5 4 1
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}

//		for (int n : arr) {
//			if (n < min) {
//				min = n;
//			} else if (n > max) {
//				max = n;
//			}
//		}

		System.out.println("Minimum number from an array : " + min);
		System.out.println("Maximum number from an array : " + max);

	}
}
