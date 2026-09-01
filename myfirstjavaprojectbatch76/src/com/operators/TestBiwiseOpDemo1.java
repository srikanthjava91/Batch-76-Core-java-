package com.operators;

///6) Bitwise Operators & Shift Operators 
//	& | ^ ~ 
//	<< >> >>>
public class TestBiwiseOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println(true & true);// true
		System.out.println(1 & 1);// 1

		System.out.println(true & false);// false
		System.out.println(1 & 0);// 0

		System.out.println(false & true);// false
		System.out.println(0 & 1);// 0

		System.out.println(false & false);// false
		System.out.println(0 & 0);// 0

		System.out.println("------------------------------");
		System.out.println(71 & 87);// 71
		System.out.println(49 & 85);// 17
		System.out.println(79 & 69);// 69
		System.out.println(88 & 77);// 72
		System.out.println("------------------------------");

		System.out.println(true | true);// true
		System.out.println(1 | 1);// 1

		System.out.println(true | false);// true
		System.out.println(1 | 0);// 1

		System.out.println(false | true);// true
		System.out.println(0 | 1);// 1

		System.out.println(false | false);// false
		System.out.println(0 | 0);// 0

		System.out.println("------------------------------");
		System.out.println(71 | 87);// 87
		System.out.println(49 | 85);// 117
		System.out.println(79 | 69);// 79
		System.out.println(88 | 77);// 93
		System.out.println("------------------------------");

		System.out.println("********* XOR ******************");
		System.out.println(true ^ true);// false
		System.out.println(1 ^ 1);// 0

		System.out.println(true ^ false);// true
		System.out.println(1 ^ 0);// 1

		System.out.println(false ^ true);// true
		System.out.println(0 ^ 1);// 1

		System.out.println(false ^ false);// false
		System.out.println(0 ^ 0);// 0

		System.out.println("-----------------------");
		System.out.println(54 ^ 67);// 117
		System.out.println(82 ^ 39);// 117
		System.out.println(49 ^ 23);// 38
		System.out.println(31 ^ 15);// 16
		System.out.println("-----------------------");

		System.out.println("********* ~ ***********");
//		~ ---> -(n+1)
		System.out.println(~21);
		System.out.println(~100);

	}

}
