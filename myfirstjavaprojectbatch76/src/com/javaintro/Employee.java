package com.javaintro;

public class Employee {

	int eid;
	String enmae;

	static int orgID = 555;
	static String orgName = "Vcube";

	public static void main(String[] args) {

		int orgID = 666;
		String orgName = "VSS";

//		JVM will not provide default values for Local Variable, 
//		we must need to initialize to access.
		int age = 23;
		// The local variable a may not have been initialized
		System.out.println(age);// CE

		Employee sr = new Employee();

		System.out.println(orgID);
		System.out.println(orgName);

		System.out.println(Employee.orgID);
		System.out.println(Employee.orgName);
//
		System.out.println(sr.orgID);
		System.out.println(sr.orgName);
		System.out.println("_------------------------");

		System.out.println(sr.eid);
		System.out.println(sr.enmae);
	}

}
