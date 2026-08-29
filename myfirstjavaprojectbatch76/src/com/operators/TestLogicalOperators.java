package com.operators;

//5) Logical Operators --> will give resulted values are Boolean Expressions --> true or false 
//&& || !  --> will work on two different boolean expressions --> boolean expression 
public class TestLogicalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

//		System.out.println(++a > 15 && ++a + 19 > 16);
//		System.out.println("A value is  : " + a);//11 

//		The operator && is undefined for the argument type(s) int, int
//		System.out.println(a && b );//CE 

		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false 2nd part is Dead code
		System.out.println(false && false);// false 2nd part is Dead code
		System.out.println("------------------------");
		System.out.println(a < b && b > a && a < c);// true
		System.out.println("------------------------");

		System.out.println(true || true);// true --> 2nd part is Dead code
		System.out.println(true || false);// true --> 2nd part is Dead code
		System.out.println(false || true);// true
		System.out.println(false || false);// false
		System.out.println("------------------------");
		System.out.println(a > b || a < c);// true
		System.out.println("------------------------");

		System.out.println(!(true));// false
		System.out.println(!(a > b));//true

	}

}
