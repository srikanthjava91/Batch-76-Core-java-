package com.logicalstatements.loops;

////Q) WAP to swap the numbers & without using third variable & with using XOR ..?
public class TestLSDemo12 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		a = a + b;// 30
		b = a - b;// 30 -20 = 10
		a = a - b;// 30 - 10 = 20

		System.out.println("A value is : " + a);
		System.out.println("B value is : " + b);
	}
}
