package com.arrays;

import java.util.Arrays;

//Time Complexity : O(n^2) 
//Space Complexity : O(1)
public class TestSelectionSortDemo1 {

	public static void main(String[] args) {

		int[] arr = { 10, 9, 8, 5 };
		int temp = 0;

		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;// 0 1 2 3 4

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));

	}

}
