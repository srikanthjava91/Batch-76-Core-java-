package com.oops.loanapp;

//Parent / Super / Base 
class Account {

	double balance = 10000.00;
	long account_number;

	void openAccount() {
		System.out.println("Welcome to Vcube Banking");
		System.out.println("Your Account hasbeen opened successfully !");
	}

	void displayAccountDetails() {
		System.out.println("YOur Account details are below");

	}
}

//Child / Sub / Derived 
class BankAccount extends Account {

	void deposit(double amount) {
		System.out.println("Your Deposit amount is : " + amount);
		balance = balance + amount;
		checkBalance();
	}

	void withdraw(double amount) {
		System.out.println("Your Withdraw amount is: " + amount);
		balance = balance - amount;
		checkBalance();

	}

	void checkBalance() {
		System.out.println("Your Current balanace is : " + balance);
	}

}

//Grand Child
class SavingAccount extends BankAccount {

	void calculateInterest() {
		System.out.println("Calculate interest method called ");
	}

}

public class TestAccountInfo {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Banking ");

		SavingAccount ba = new SavingAccount();
		ba.openAccount();
		ba.deposit(10000);
		ba.checkBalance();
		ba.calculateInterest();

		System.out.println("Thank you !! Visit Agian ");

	}

}
