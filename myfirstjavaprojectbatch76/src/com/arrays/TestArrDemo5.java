package com.arrays;

//Q) WAP to print Array in Reverse order ..? 
public class TestArrDemo5 {

	public static void main(String[] args) {

		int[] numbers = { 18, 19, 20, 21, 22 };// 0 1 2 3 4 --> 4 3 2 1 0

		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");//22 21 20 19 18
		}
	}
}
