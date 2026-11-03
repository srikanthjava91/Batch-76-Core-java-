package com.arrays;

import java.util.Arrays;

//Time Complexity for this Bubble Sort is : 
//Worst Case : O(n^2)
//Avg Case   : O(n^2)
//Best Case  : O(n) : Sorted Array 

//The Space Complexity for BUbble Sort is : O(1)

public class TestBubbleSortDemo1 {

	public static void main(String[] args) {
		int[] arr = { 6, 7, 8, 9, 10, 11, 12 };
		// 8 9 7 6
		// 8 7 9 6
		// 8 7 6 9 --> 1st

		// 7 8 6 9
		// 7 6 8 9 --> 2nd

		// 6 7 8 9 --> 3 rd

		System.out.println("Before Sorting ");
		System.out.println(Arrays.toString(arr));

		int temp = 0;
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			count++;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}

				count1++;
			}

			if (!swapped) {
				break;
			}
		}

		System.out.println("count : " + count);
		System.out.println("count1 : " + count1);

		System.out.println("After Sorting ");
		System.out.println(Arrays.toString(arr));
	}
}
