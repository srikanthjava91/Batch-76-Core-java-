package com.langfundamentals;

//4 5 6 7 8 9 10 11 --> 13

//6 9 

import java.util.Scanner;

strictfp class Student_1 {

	int student_Id;
	String student_Name;
	double fee$;
	int _age;

	void studentInfo() {
		System.out.println("Student Info method called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);

		Student_1 s1 = new Student_1();
		System.out.println(s1.student_Id);// 0
		System.out.println(s1.student_Name);// null
		s1.studentInfo();

		System.out.println("main method ended !!");
	}
}
