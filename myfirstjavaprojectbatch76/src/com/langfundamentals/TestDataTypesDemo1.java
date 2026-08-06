package com.langfundamentals;

//Primitive Data Types 
//Note : The default values provided by the JVM is 
//For byte short int long --> 0 
//For float & double --> 0.0 
//For char -->  (empty space)
//For Boolean it is --> false 

//byte -->  short -->  int -->  long --> float --> double --> this process will consider as Implicit Type casting.
//But, If we want to do Reverse process we need to work with Explicit Type casting.

//Note : By default RHS Numeric values are int type 
// Type Casting : Converting One Data Types values to another Data Type.
public class TestDataTypesDemo1 {

//	the byte min-max Range is -128 to 127 
	byte b = 127;
//	CE : Type mismatch: cannot convert from int to byte
//	 -128 -127 -126 -125 ..... 0 1 2 3 4 ..... 126 127
	byte b1 = (byte) 129;// Explicit Type Casting (int to byte casting )

	short s = b1;// Implicit Type Casting : Converting byte to Short

//	short means 2 bytes = 16 bits --> 2^15 = 32768
//	Range : -32768 to 32767
//	Type mismatch: cannot convert from int to short
	short s1 = 32767;
	short s2 = (short) 32768;

//	int means 4 bytes = 32 bits --> 2^31 = 2147483647
//	Range : -2147483648 to 2147483647
	int i = 2147483647;

//	The literal 2147483648 of type int is out of range 
//	int i1 = 2147483648;

//	Type mismatch: cannot convert from long to int
	int i1 = (int) 2147483650L;

//	long means 8 bytes = 64 birs --> 2 ^63 
	long l = 2147483648L;
	long l1 = -9223372036854775808L;
	long l2 = 9223372036854775807L;

//	 By default RHS Decimal points are double values so we must need to Specify f
//	 or F for representing floating values.
//	float means 4 bytes --> 32 bits 
	float f = 5.9f;

//	double means 8 bytes --> 64 bits 
	double d = 545645.87565;

	float f1 = 76.78546546575887675678574F;
	double d1 = 76.78546546575887675678574D;

//	char means 2 bytes = 16 bits = 32768 + 32767 = 65535
//	The Range of char is : 0 to 65535 
	char c = 'A';//SIngle quote characters 
	char c1 = 'I';

	//Implicit Type casting
	char c2 = 65;// ASCII codes --> 65 to 90 --> A to Z
	char c3 = 73;// ASCII codes --> 97 to 122 --> a to z

	char c4 = '\u0040';// Unicode values
	
	int i5 = 'A';

	boolean boo = true;
	
//	Type mismatch: cannot convert from String to boolean
//	boolean boo1 = "false";
//	boolean boo2 = "true";
	
//	Type mismatch: cannot convert from int to boolean
//	boolean boo3 = 0;
//	boolean boo4 = 1;
	
//	True cannot be resolved to a variable
//	boolean boo5 = True;
//	boolean boo6 = False;
	
//	FALSE cannot be resolved to a variable
//	boolean boo7 = FALSE;
//	boolean boo8 = TRUE;

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();

		System.out.println("byte value  : " + t1.b);// 0
		System.out.println("byte value  : " + t1.b1);// 0

		System.out.println("short value : " + t1.s);// 0
		System.out.println("short value : " + t1.s1);// 0
		System.out.println("short value : " + t1.s2);// 0

		System.out.println("int value : " + t1.i);// 0
		System.out.println("int value : " + t1.i1);// 0

		System.out.println("long value : " + t1.l);// 0

		System.out.println("float value : " + t1.f);// 0.0
		System.out.println("double value : " + t1.d);// 0.0

		System.out.println("float value : " + t1.f1);// 0.0
		System.out.println("double value : " + t1.d1);// 0.0

		System.out.println("char value  :" + t1.c);//
		System.out.println("char value  :" + t1.c1);//
		System.out.println("char value  :" + t1.c2);//
		System.out.println("char value  :" + t1.c3);//
		System.out.println("char value  :" + t1.c4);//
		System.out.println("int value : " + t1.i5);// 0

		System.out.println("boolean value : " + t1.boo);// false
		
		if(t1.boo) {
			System.out.println("Good Morning !!");
		}
	}

}
