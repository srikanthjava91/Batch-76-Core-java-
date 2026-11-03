package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestRotateArrayDemo1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Before Rotation : ");
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many times you want to Rotate ..? ");
		int r = sc.nextInt();

		rotateArrayRightToLeft(arr, r);

		System.out.println("After Rotation : ");
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

//	1 2 3 4 5 6 7 8
	static void rotateArrayRightToLeft(int[] arr, int r) {

		int start = 0;
		int end = arr.length - 1;
		
		r = r % arr.length;

//	Step1 : Reverse the Total Array.
		reverseArray(arr, start, end);

//	Step2 : Reverse the First Half array based on your value.
		reverseArray(arr, start, r - 1);

//	Step3 : Reverse the Second half Remaining Array values.
		reverseArray(arr, r, end);

	}

	////	1 2 3 4 5 6 7 8
	static void reverseArray(int[] arr, int start, int end) {
		int temp = 0;

		// 0 < 7 --> 8 2 3 4 5 6 7 1
		// 1 < 6 --> 8 7 3 4 5 6 2 1
		// 2 < 5 ---> 8 7 6 4 5 3 2 1
		// 3 < 4 ---> 8 7 6 5 4 3 2 1
		// 4 < 3 --> false
		while (start < end) {
			temp = arr[start]; // temp = 1
			arr[start] = arr[end];// arr[start = 8
			arr[end] = temp;// arr[end] = 1
			start++;
			end--;
		}
	}
}
