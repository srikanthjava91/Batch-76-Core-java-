package com.logicalstatements.loops;

//WAP to print values from 0 to 100...
public class TestLPDemo4 {

	int a = 10;

	public static void main(String[] args) {
		float a = 100;
		float result = a / 3;
		System.out.println(result);

		for (byte i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.println(i);
			}
		}
	}
}
