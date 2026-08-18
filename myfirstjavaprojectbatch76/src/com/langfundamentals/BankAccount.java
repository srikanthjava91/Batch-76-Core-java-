package com.langfundamentals;

import java.util.Scanner;

public class BankAccount {

	double balance = 5000.00;

	public static void main(String[] args) {
		System.out.println("main method Started ");

		BankAccount ba = new BankAccount();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount to Deposite : ");
		double amount = sc.nextDouble();// 2000
		ba.deposite(amount);

		System.out.println("Enter Amount to Withdraw :");
		double wAmount = sc.nextDouble();
		ba.withdraw(wAmount);

		System.out.println("main method Started ");

	}

	void withdraw(double wAmount) {
		if (wAmount <= balance) {
			balance = balance - wAmount;
			checkBalance();
		} else {
			System.out.println("Insufficient Balance in your Account ");
			checkBalance();
		}

	}

	void checkBalance() {
		System.out.println("The Current balance is : " + balance);
	}

	void deposite(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			checkBalance();
		} else {
			System.out.println("Invalid amount to Deposite : ");
			checkBalance();
		}
	}

}
