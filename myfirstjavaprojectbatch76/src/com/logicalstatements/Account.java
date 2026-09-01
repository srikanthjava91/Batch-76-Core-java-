package com.logicalstatements;

import java.util.Scanner;

public class Account {
	double balance = 20000.00;

	void main() {
		System.out.println("Welcome to Vcube Banking !!");
		checkBalance();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount which you want Deposite : ");
		double depositeAmount = sc.nextDouble();
		deposite(depositeAmount);

		System.out.println("Enter the Amount which you want to Withdraw :");
		double withdrawAmount = sc.nextDouble();
		withDraw(withdrawAmount);
		
		sc.close();

	}

	void deposite(double dAmount) {
		if (dAmount <= 100000.00) {
			balance = balance + dAmount;
			System.out.println("Your Total balanace is : ");
			checkBalance();
		} else {
			System.err.println("Per Transaction Deposite limit is only 1 Lakh !");
		}

	}

	void withDraw(double wAmount) {
		if (wAmount <= balance) {
			balance = balance - wAmount;
			System.out.println("After Debit, Your current Balance is : ");
			checkBalance();
		} else {
			System.err.println("InSufficient Balance in your Account : Please check the Balanace");
			System.out.println("Your Current Balance is : ");
			checkBalance();
		}
	}

	void checkBalance() {
		System.out.println("The Current balance is : " + balance);
		System.out.println(" !!!!!!!!!! Vcube Banking Helping you in your Transaction !!!!!!!!!!!");
	}

}
