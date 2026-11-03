package com.arrays;

//Q) WAP to print Total_marks & avg from student marks..? 
public class TestArrDemo4 {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		System.out.println(marks);

		double total_marks = 0;
		double avg = 0;

//		for loop 
		for (int i = 0; i < marks.length; i++) {
			total_marks = total_marks + marks[i];
		}

//		for each loop 
//		for (int m : marks) {
//			total_marks += m;
//		}

		avg = total_marks / marks.length;

		System.out.println("Total Marks  : " + total_marks);
		System.out.println("Avg of all marks : " + avg);

	}

}
