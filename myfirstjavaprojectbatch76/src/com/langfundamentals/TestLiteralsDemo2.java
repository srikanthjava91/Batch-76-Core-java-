package com.langfundamentals;

//floating Literals 
public class TestLiteralsDemo2 {

	public static void main(String[] args) {

		float f1 = 123;// int --> float
		float f2 = 0123;// octal --> int --> float
//		float f3 = 123.5;//Type mismatch: cannot convert from double to float
		float f4 = 123.5F;
		float f5 = 0123.5F;// In Floating point data, we dint have Octal, So it is Directly Floating point
							// data
		float f6 = 123F;
		float f7 = 0123F;
		float f8 = 0x123F;
//		float f9 = 0x123.5F;//Invalid hex literal number
//		float f10 = 0x123.5;//Invalid hex literal number
//		float f11 = 0xabc.5F;//Invalid hex literal number

		System.out.println(f1);// 123.0
		System.out.println(f2);// 83.0
//		System.out.println(f3);//
		System.out.println(f4);// 123.5
		System.out.println(f5);// 123.5
		System.out.println(f6);// 123.0
		System.out.println(f7);// 123.0
		System.out.println(f8);// 4671.0
//		System.out.println(f9);
//		System.out.println(f10);

	}

}
