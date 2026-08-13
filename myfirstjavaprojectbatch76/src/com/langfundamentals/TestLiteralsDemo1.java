package com.langfundamentals;

//Note : Generally, Java is a case-sensitive Programming Language but no for the Literals.
public class TestLiteralsDemo1 {

	public static void main(String[] args) {

//		The Below 3 values are Decimal Literals 
//		Decimal means base is 10 --> 0 to 9 
		int a = 10;
		int a1 = 123;
		int a2 = 678;

//		The below values are Octal Literal.
//		Octal means the base is 8 --> 0 to 7 
//		Octal Literals starts with 0.
//		0 +1*8^2 +2*8^1 +3*8^0 = 64 + 16 + 3 = 83 
		int a3 = 0123;
		int a4 = 04761;// 2545
		int a5 = 0657;// 431
//		int a6 = 0876;//CE : The literal 0876 of type int is out of range 

//		The below values are Hexa-Decimal Literals.
//		HexaDecimal means the base is 16 --> 0 to 9 and a-f/A-F--> a=10 b=11 c=12 d=13 e=14 f=15
//		HexaDecimal Literals starts with 0X or 0x 

//		1*16^2 +2*16^1 +3*16^0= 256 + 32 + 3 = 291
		int a7 = 0x123;
		int a8 = 0xabc;// 2748
		int a9 = 0x1a2b;// 6699
		int a10 = 0xbee;// 3054
		int a11 = 0xDad;// 3501
//		int a12 = 0xbeer;

//		The below values are Binary Literals.
//		Binary Literals means the base is 2 --> 0 & 1
//		Binary Literals starts with 0b or 0B 
		int a13 = 0b1010;// 16 8 4 2 1
		int a14 = 0b1110;
		int a15 = 0B0101;

		System.out.println(a);// 10
		System.out.println(a1);// 123
		System.out.println(a2);// 678

		System.out.println(a3);// 83
		System.out.println(a4);// 83
//		System.out.println(a6);// 83
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a13);
		System.out.println(a14);
		System.out.println(a15);

	}

}
