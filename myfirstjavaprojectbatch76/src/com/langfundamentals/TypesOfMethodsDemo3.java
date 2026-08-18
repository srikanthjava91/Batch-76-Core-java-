package com.langfundamentals;

import java.util.Scanner;
import java.util.ArrayList;

//2) No Return type + With Parameters  --> Scanner 
//Read the elements from the console using Scanner. 
//For any java class, if there are no constructors then 
//Java Compiler will create a default constructor which we cannot see. 

//WAP to print Student Details ..?
public class TypesOfMethodsDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student ID ");
		int sid = sc.nextInt();

		System.out.println("Enter Student Name ");
		sc.nextLine();
		String sname = sc.nextLine();

		System.out.println("Enter your age  : ");
		int age = sc.nextInt();

		System.out.println("Enter your Gender info : ");
		char gender = sc.next().charAt(0);// Method Chaining

//		methods call by values 
		getStudent_Id_Name_Info(sid, sname);
		getStudentAgeInfo(age);
		getGenderInfo(gender);

		System.out.println("main method ended ");
	}

	static void getGenderInfo(char gen) {
		System.out.println("Student Gender Details : " + gen);
	}

	static void getStudentAgeInfo(int age) {
		System.out.println("Student Age is : " + age);
	}

	static void getStudent_Id_Name_Info(int id, String name) {
		System.out.println("Student ID and Name info !!");
		System.out.println("Student ID : " + id);
		System.out.println("Student Name : " + name);
	}

}
