package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size : ");
		int size = sc.nextInt();

		String[] arr = new String[size];

		System.out.println("Read the Elements :");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();
		}

		System.out.println("Represent the Elements");
		System.out.println(Arrays.toString(arr));
	}

}
