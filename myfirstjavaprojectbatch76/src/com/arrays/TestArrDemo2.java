package com.arrays;

//WAP to Represent numbers from 0 to 10 using Arrays ..? 
//WAP to Represent  even number from 0 to 10 using Arrays ..? 
public class TestArrDemo2 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

//		int[] n = new int[100];// 0 to 9

		int[] numbers = new int[5];// 0 to 9 : REx : NegativeArraySizeException
		System.out.println(numbers);// Address of the Array : [I@2b2fa4f7

		numbers[0] = 1001;
		numbers[1] = 1002;
		numbers[2] = 1003;
		numbers[3] = 1004;
		numbers[4] = 1005;

//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] % 2 == 1 && numbers[i] != 0) {
//				System.out.println(numbers[i]);// 1001 1002 1003 1004 1005 0 0 0 0 0
//			}
//		}

		for (int n : numbers) {
			if (n % 2 == 0 && n != 0) {
				System.out.println(n);
			}
		}

		System.out.println("main method ended ");
	}
}
