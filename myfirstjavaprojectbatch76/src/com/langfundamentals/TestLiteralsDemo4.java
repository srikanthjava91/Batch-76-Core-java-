

package com.langfundamentals;

//String Literals : A Collection of characters storing into a double quotes will consider as String Literals.
public class TestLiteralsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started..");

		String str = "";
		String str1 = null;
		System.out.println(str);

//		The local variable str1 may not have been initialized
//		JVM does not provide default values for local variables.
		System.out.println(str1);

		String str2 = "Srikanth";// String Literals --> SCP : String Constant Pool from heap --> 1 object
		String str3 = "Srikanth";// SCP --> 0 objects
		String str4 = "Srikanth";// SCP --> 0 objects

		String str5 = "Java";

		String str6 = new String("Vcube");// String Object --> heap --> 2 objects 1 is in Heap + 1 is in SCP
		String str7 = new String("Vcube");// String Object --> heap --> 1 object is in heap
		String str8 = "Vcube";// 0 objects

		String str9 = "Mani";
		String str10 = new String("Mani");// only one object creating in Heap

		System.out.println("--------------");
		System.out.println(str9 == str10);

		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);

		String str11 = new String("Java");//2 = 1+ 1 
		String str12 = "Java";//1 
		System.out.println("********");
		System.out.println(str11 == str12);

		// == operator check the addresses of the objects but not values.
		// == operator checks the values for primitive data types.
		System.out.println(str2 == str3);
		System.out.println(str6 == str7);

		System.out.println("main method ended..");
	}
}
