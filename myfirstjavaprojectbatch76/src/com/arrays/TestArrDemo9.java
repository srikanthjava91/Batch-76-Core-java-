package com.arrays;

public class TestArrDemo9 {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];// 0 1 ---> 0 1 2

//		System.out.println(arr.length);//2
//		System.out.println(arr[0].length);//3

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		for(int[] a1:arr) {
			for(int a:a1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] +" | ");//10 20 30 40 50 60
//			}
//			System.out.println();
//		}

	}

}
