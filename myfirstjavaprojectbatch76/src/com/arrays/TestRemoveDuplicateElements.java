package com.arrays;

public class TestRemoveDuplicateElements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}

			if (!duplicate) {
				System.out.println(arr[i]);
			}
		}
	}
}
