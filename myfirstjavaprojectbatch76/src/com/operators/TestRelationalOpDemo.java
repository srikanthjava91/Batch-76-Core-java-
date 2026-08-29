package com.operators;

//4) Comparison Operators or Relational Operators
//== != < <= > >=  ------> Resulted value is boolean expression --> true or false 
//== operator checks the values if the data is Primitive.

public class TestRelationalOpDemo {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Integer a5 = 5;
		Integer b5 = 5;
		System.out.println(a5 == b5);

		Integer a6 = 135;
		Integer a7 = 135;
		System.out.println(a6 == a7);
		
		System.out.println("---------------------");
		String s1 = "Java";// --> SCP --> 1
		String s2 = "Java";// --> SCP --> 0
		System.out.println(s1 == s2);// addresses comparison with == operator

		String s3 = "Srikanth";
		String s4 = new String("srikanth");
		System.out.println(s3 == s4);
		System.out.println(s3.equalsIgnoreCase(s4));// Content comparison : equals or equalsIgnorecase methods

		System.out.println("---------------------");
		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println(a != b);// true
		System.out.println(a != c);// false
		System.out.println("---------------------");
		System.out.println(a < b);// true
		System.out.println(a <= b);// true
		System.out.println(a <= c);// true

		System.out.println(b > c);// true
		System.out.println(b >= c);// true
		System.out.println(b == c);// false

		System.out.println("---------------------");
		float f = 5.9F;
		double f1 = 5.9D;

		float f2 = 5.34567887765658F;
		double f3 = 5.3456787765658F;

		System.out.println(a == b);// false
		System.out.println(a == c);// true

		System.out.println(f);
		System.out.println(f1);
		System.out.println(f == f1);// true

		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f2 == f3);// true

	}

}
