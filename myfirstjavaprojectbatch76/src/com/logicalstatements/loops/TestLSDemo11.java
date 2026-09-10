package com.logicalstatements.loops;

//Q) WAP to swap the numbers using third variables ..? 
public class TestLSDemo11 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("A value is : " + a);// 20
		System.out.println("B value is : " + b);// 10

	}

}
