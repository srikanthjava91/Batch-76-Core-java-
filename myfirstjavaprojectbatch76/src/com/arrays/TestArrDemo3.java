package com.arrays;

//WAP to print 10 names using Arrays ..?
///Q) WAP to represent 5 names Whose names starts with S from 10 names ..?
public class TestArrDemo3 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		String[] names = new String[10];// 0 1 2 3 4 5 6 7 8 9

		names[0] = "sachin";
		names[1] = "Abhishek";
		names[2] = "Virat";
		names[3] = "Rohit";
		names[4] = "Rahul";
		names[5] = "Dhoni";
		names[6] = "Hardhik";
		names[7] = "srikanth";
		names[8] = "Diwakar";
		names[9] = "Bumrah";

		for (int i = 0; i < names.length; i++) {
			if (names[i].toUpperCase().startsWith("S")) {
				System.out.println(names[i].toUpperCase());
			}
		}

		for (String name : names) {
			if (name.toUpperCase().startsWith("R")) {
				System.out.println(name.toUpperCase());
			}
		}
	}
}
