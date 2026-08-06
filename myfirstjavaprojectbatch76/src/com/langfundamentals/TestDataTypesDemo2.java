package com.langfundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Arrays;

class Dog {
	
}

public class TestDataTypesDemo2 {

	// Normal Object Data Types
	BigInteger bi;
	BigDecimal bd;
	String s;
	Arrays a;

	// Wrapper Object Data Types
	Integer i;
	Short s1;
	Character c;
	Double dob;

	// User-Defined Data Types
	Dog d;

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		TestDataTypesDemo2 t = new TestDataTypesDemo2();
		System.out.println(t.bd);//0.0
		System.out.println(t.bi);//0
		
		System.out.println(t.s);//null
		System.out.println(t.a);//
		
		System.out.println(t.i);//0
		System.out.println(t.s1);//0
		System.out.println(t.c);//  
		System.out.println(t.dob);//0.0
		
		System.out.println(t.d);//

	}

}
