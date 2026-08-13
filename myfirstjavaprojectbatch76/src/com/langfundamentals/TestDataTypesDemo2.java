package com.langfundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Arrays;

class Dog {
	
	String name;

}

//To Initialize Object and it's instance data we need Constructor.
public class TestDataTypesDemo2 {

//	 Normal Object Data Types
//	Type mismatch: cannot convert from int to BigInteger
//	BigInteger bi = 10;
	BigInteger bi1 = new BigInteger("765634768787987576545876875465478");//
	BigInteger bi2 = new BigInteger("765634768787987576545876875465478");//

	BigDecimal bd1 = new BigDecimal("7643645658768765543657.785456345669787857634");
	BigDecimal bd2 = new BigDecimal("7643645658768765543657.785456345669787857634");

	String s = new String();

	////String is a class from java.lang package 
	///String is working based index 
	///The Collection of character storing inside a double quotes will consider as String.
	String s2 = "Srikanth";// String Literals --> SCP --> String Constant Pool.(Heap) --> 1 object
	String s3 = new String("Java is Simple");// String Object --> Directly Store it in Heap Area. --> 2 objects

//	Arrays a;

//	 Wrapper Object Data Types 8
//	Auto Boxing : 1.5 version : 
//	Converting Primitive Data Types to Wrapper Object Data Types will consider as AB.
	Integer i = 100;//Integer.valueOf(100)
	Short s1 = 34;
	Character c = 'M';
	Double dob = 56.5;

//	Auto UnBoxing : 1.5 version 
//	Converting Wrapper Object Data Types to Primitive Data Types will consider as AUB.
//	The constructor Integer(int) is deprecated since version 9
	Integer i1 = new Integer(100);
	int i2 = i1;//i1.intValue() :  Converting Wrapper --> Primitive

//	Wrapper Caching : The Range of -128 to 127 values will store it in same Address of the Object 
//	If the values are crossing max value 127 then it's create a new Object.
	Integer i3 = 100;
	Integer i4 = 100;

	Integer i5 = 200;
	Integer i6 = 200;

	// User-Defined Data Types
	//Type mismatch: cannot convert from String to Dog
	Dog d = new Dog();;

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestDataTypesDemo2 t = new TestDataTypesDemo2();

		System.out.println(t.i3 == t.i4);// true
		System.out.println(t.i5 == t.i6);// true

		System.out.println(t.bi1);// null
		System.out.println(t.bi2);// null

//		The operator + is undefined for the argument type(s) 
//		java.math.BigInteger, java.math.BigInteger
//		System.out.println(t.bi1 + t.bi2);

		System.out.println(t.bi1.add(t.bi2));
		System.out.println(t.bi1.multiply(t.bi2));

		System.out.println(t.bd1.add(t.bd2));
		System.out.println(t.bd1.multiply(t.bd2));

//		System.out.println(t.bd);// null

		System.out.println(t.s);// null
		System.out.println(t.s2);// null
//		System.out.println(t.a);// null

		System.out.println(t.i);// null
		System.out.println(t.s1);// null
		System.out.println(t.c);// null
		System.out.println(t.dob);// null

		System.out.println(t.d);// null

	}

}
