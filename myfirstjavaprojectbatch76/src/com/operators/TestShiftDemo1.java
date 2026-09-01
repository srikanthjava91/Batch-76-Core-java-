package com.operators;

public class TestShiftDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 59;
		int b = 3;

		System.out.println(a << b);//
//		System.out.println(a <<< b);//Syntax error on token "<", delete this token

		System.out.println(a >> b);//
		System.out.println(a >>> b);//

	}

}
