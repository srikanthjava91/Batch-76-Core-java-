package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Q) WAP to read the Data From a console for an Array and 
//find the Prime numbers from An array .

public class TestArrDemo7 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];// 5

		System.out.println("Enter the Elements for an array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Representing only Prime numbers : ");

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}

}
