package com.oops.loanapp;

import java.util.Scanner;


//Parent / Super/ Base 
public class Loan {

	static Scanner sc = new Scanner(System.in);

	void hello() {
		System.out.println("Hello method called from Loan !!");
	}
	
	double getEmployeeSalary() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	int getCibiliScore() {
		System.out.println("Enter your cibil score :");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getROI() {
		double roi = 14.0;

		int cibil = getCibiliScore();

		if (cibil > 800 && cibil <= 900) {
			System.out.println("Excellent : Strong credit profile, best loan terms.");
			roi = roi - 5;// 9
		} else if (cibil > 760 && cibil <= 800) {
			System.out.println("Very Good : High approval chances, competitive rates.");
			roi = roi - 4;// 10
		} else if (cibil > 700 && cibil <= 760) {
			System.out.println("Good : Eligible for most loans with decent terms.");
			roi -= 3;// 11
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("Average : May get loans but at higher interest.");
			roi -= 1;// 13
		} else if (cibil >= 300 && cibil <= 600) {
			System.out.println("Poor : High risk; loan applications often rejected. ");
		} else {
			System.out.println("Invalid Cibil !!");
		}

		return roi;
	}

	// 4234 6578 7898
	boolean isAadharValid() {
		System.out.println("Enter your Aadhar card number : ");
		String aadhar = sc.next();
		boolean aadharStatus = aadhar.matches("[2-9]{1}[0-9]{11}");
		return aadharStatus;
	}

	// ABCDE1234G
	boolean isPanValid() {
		System.out.println("Enter your PAN number: ");
		String pan = sc.next();
		boolean panStatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return panStatus;
	}

	boolean isPhoneValid() {
		System.out.println("Enter your phone number: ");
		String phone = sc.next();
		boolean phoneStatus = phone.matches("[6-9]{1}[0-9]{9}");
		return phoneStatus;
	}

}
