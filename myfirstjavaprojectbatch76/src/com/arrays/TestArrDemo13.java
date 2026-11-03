package com.arrays;

import java.util.Arrays;

public class TestArrDemo13 {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3 };
		int[] b1 = { 4, 5, 6 };

		int[] c1 = new int[a1.length + b1.length];// 0 1 2 3 4 5 --> 1 2 3 0 0 0

		for (int i = 0; i < a1.length; i++) {
			c1[i] = a1[i];
		}

		for (int i = 0; i < b1.length; i++) {
			c1[a1.length + i] = b1[i];
		}

		System.out.println(Arrays.toString(c1));

	}

}
