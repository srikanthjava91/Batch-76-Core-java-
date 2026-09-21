package com.arrays;

//WAP to print 10 ages into a single variable with an Array ..? 
public class TestArrDemo1 {

	public static void main(String[] args) {

		int a;
//		CE : The local variable a may not have been initialized
//		System.out.println(a);

//		Step1: Declaration 
		int[] ages;

//		Step2 : Creation 
//		Variable must provide either dimension expressions or an array initializer
		ages = new int[5];// 0 1 2 3 4

//		Step3: initialization 
		ages[0] = 21;
		ages[1] = 21;
		ages[2] = 22;
		ages[3] = 23;
		ages[4] = 23;

//		Step4 : Representation with for loop 
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}

//		for-each loop 
		for (int age : ages) {
			System.out.println(age);
		}

	}
}
