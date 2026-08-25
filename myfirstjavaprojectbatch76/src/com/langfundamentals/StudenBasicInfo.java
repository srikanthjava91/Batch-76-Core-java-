package com.langfundamentals;

public class StudenBasicInfo {

	void main(String[] args) {
		System.out.println("main method strated ");

		String fname = getFirstName();
		String lname = getlastName();

		System.out.println("Full Name : " + lname + " " + fname);

		System.out.println("main method ended ");
	}

	String getFirstName() {
		return "Kohli";
	}

	String getlastName() {
		return "Virat";
	}
}
