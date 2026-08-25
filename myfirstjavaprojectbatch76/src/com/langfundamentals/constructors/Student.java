package com.langfundamentals.constructors;

//In Any Java class, 
//If no constructors available then only 
//Java Compiler will create a default constructor.

//IMP Q) Already Java Compiler Providing default constructor then why we need No-arg constructor ..?
//Ans1: To initialize the default data instead of JVM initializing 
//we need to create and initialize the data using no-arg constructor.

//Ans2 : Because, If the class contains any parameterized constructors then java compiler will not provide any default constructor.
//in such cases, if we want to create normal Object without passing values we must need to create no-arg constructor.

public class Student {

//	 instance data
	int sid;
	String sname;
	String city = "Hyderabad";

	// No-arg constructor
	Student() {
		System.out.println("no-arg constructor called ");
		sid = 100;
		sname = "unknown";
	}

//	Parameterized constructor 
	Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public static void main(String[] args) {
		System.out.println("main mehod started !");

//		The Below Object is Created with the help of default constructor.(No constructors from class)
//		The Below Object is created with the help of no-arg constructor.(when we have constructor in a class)
		Student s1 = new Student();
		s1.studentInfo();

		Student s2 = new Student();
		s2.studentInfo();

		Student s3 = new Student(101, "Srikanth");
		s3.studentInfo();

		System.out.println("main mehod ended !");
	}

	void studentInfo() {
		System.out.println("----------------------------");
		System.out.println("Student ID : " + sid);
		System.out.println("Student Name : " + sname);
		System.out.println("Student City : " + city);
	}
}
