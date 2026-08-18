package com.langfundamentals;

import java.util.Scanner;

// With Return Type + No Parameters
public class EmployeeSalInfo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started !!");

		EmployeeSalInfo es = new EmployeeSalInfo();
		double salary = es.employeeSalary();
		double bon = es.empBonus();

		System.out.println("Total Salary is : " + (salary + bon));

		System.out.println("main method ended !!");
	}

	double employeeSalary() {
		System.out.println("Employee Salary is : ");
		double sal = sc.nextDouble();
		return sal;
	}

	double empBonus() {
		System.out.println("Enter Bonus :");
		double bonus = sc.nextDouble();
		return bonus;
	}

}
