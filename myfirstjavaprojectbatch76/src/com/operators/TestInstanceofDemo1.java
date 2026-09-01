package com.operators;

//8) instanceof Operators 
//instanceof
public class TestInstanceofDemo1 {

	public static void main(String[] args) {

		Integer i = 10;
		System.out.println(i instanceof Integer);//
		System.out.println(i instanceof Number);//
		System.out.println(i instanceof Object);//
		
		//Incompatible conditional operand types Integer and String
//		System.out.println(i instanceof String);
		System.out.println(null instanceof Integer);
		System.out.println(null instanceof Number);

	}
}
