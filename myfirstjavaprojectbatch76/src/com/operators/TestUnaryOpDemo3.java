package com.operators;

//3) Unary Operator
//+ - ++ -- 
public class TestUnaryOpDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 5;
		int b = 6;

		System.out.println(+a);// 5 Unary +
		System.out.println(-b);// -6 unary -

		System.out.println(++a);// a = a +1 ==> 6
		System.out.println(--b);// b = b-1 ==> 5
		System.out.println(a++);// 6 ==> a= a+1 ==> 7
		System.out.println(b--);// 5 ==> b = b-1 ==> 4

		System.out.println(++a);// 8
		System.out.println(b--);// 3
		System.out.println(a++);// 8 --> 9
		System.out.println(b++);// 3 --> 4
		System.out.println(++b);// 5
		System.out.println(--a);// 8
		System.out.println(++b);// 6
		System.out.println(b--);// 6 --> 5
		System.out.println(--a);// 7
		System.out.println(a--);// 7 --> 6
		System.out.println(b++);// 5 --> 6

		System.out.println("A  value : " + a);// 6 7 6 8 7
		System.out.println("B  value : " + b);// 6 5 7 3 6

		// 7 + 6 = 13 --> a =7 b = 7
		// 13+7 = 20 + 7 + --> a = 6 b = 6
		System.out.println(++a + b++ + a-- + b--);// 26 28 24 27

		System.out.println("A  value : " + a);// 6 7 6 8 7
		System.out.println("B  value : " + b);// 6 5 7 3 6

		// 6 + 7 ==> 13 + 6 + 7 + 6 + 7 + 7 = 46
		// a= 6--> 7 --> 6 --> 7 || b=6--> 7--> 6 --> 7 --> 8
		System.out.println(a++ + ++b + --b + a-- + b++ + ++a + b++); // 45 46 47 48

		System.out.println(++a + b++ - --a - ++b + a++ + b--);//16 --> 

	}

}
