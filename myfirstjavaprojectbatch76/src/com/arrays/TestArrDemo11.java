package com.arrays;

//Jagged Arrays : Array of Array 
public class TestArrDemo11 {

	public static void main(String[] args) {
		int[][] arr = new int[2][]; // 0 1

		System.out.println(arr);// Address of the Object
		System.out.println(arr[0]);

		arr[0] = new int[3];// 0 1 2
		arr[1] = new int[2];// 0 1

		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;

		arr[1][0] = 400;
		arr[1][1] = 500;

//		for (int[] a1 : arr) {
//			for (int a : a1) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
