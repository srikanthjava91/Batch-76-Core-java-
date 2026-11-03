package com.oops.loanapp;

import java.util.Scanner;

//Child or sub or Derived 
//Whenever we are working with Parent & Child Relationship, Generally we 4 work 4 Scenarios in 4 Different Requirements.
public class PersonalLoan extends Loan {

	static Scanner sc = new Scanner(System.in);

	@Override
	void hello() {
		System.out.println("Hello method called from Personal Loan !!");
	}

	void getPersonalLoanDocumentInfo() {
		System.out.println("ALl documents have been Receive Successfully !!");
	}

	public static void main(String[] args) {
		System.out.println("Welocme to Vcube Personal Loan Banking !!");

//		Scenario 4: 
//		By using Parent Object and Child Reference : 
//		It is a Compile time Error : We cannot Store PArent Object into CHild Reference 
//		CE : Type mismatch: cannot convert from Loan to PersonalLoan
//		in Java Down-casting is not possible directly, but namesake we can do with help of 
//		Explicit Type casting just for Compiler satisfaction, But we will get Runtime Exception saying that 
//		ClassCastException 
		
//		PersonalLoan pl2 = new Loan();

		PersonalLoan pl2 = (PersonalLoan)new Loan();
		pl2.getCibiliScore();
		pl2.getPersonalLoanDocumentInfo();
		
		
//		Q) Can we store Child Object into Parent reference ..? 
//		Yes !! this process will consider as Up-casting.
//		Q) Why We need Up-casting ..? 
//		- To Achieve Abstraction with Dynamic Method Dispatching.

//		What is Dynamic Method Dispatching ..? 
//		- Whenever we create the child Object and store it into Parent reference 
//		we can access only Parent class functionalities but If the child class contains 
//		the same method created in the Parent(Overridden) then child class method only can execute is the process called DMD.

//		Why we need to DO Up-Casting with the Process of Dynamic Method Dispatching ..? 
//		To Achieve abstraction Java like, Create a interface and keep only abstract methods.
//		Where interface tells What to do but not how to do .. 
//		In java, Classes can implement the interface where interface methods overridden in classes.
//		List l = new ArrayList();

//		Scenario 3: 
//		By using child Object & Parent reference 
//		We can access only Parent class functionalities but it works on DMD. 
		Loan l2 = new PersonalLoan();
//		CE : The method getPersonalLoanDocumentInfo() is undefined for the type Loan
//		l2.getPersonalLoanDocumentInfo();
		l2.hello();

//		Scenario 2: 
//		By using Parent Object & Parent reference 
//		We can access only Parent class functionalities
		Loan l1 = new Loan();

//		Scenario 1: 
//		By using Child Object & Child Reference
//		We can access both Parent & child class functionalities 
		PersonalLoan pl = new PersonalLoan();

		double salary = pl.getEmployeeSalary();
		int cibil = pl.getCibiliScore();

		if (salary >= 1000000.00 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Lets check more details : ");

			if (pl.isAadharValid() && pl.isPanValid() && pl.isPhoneValid()) {
				System.out.println("Congrtulations !! Your Personal Loan got approved !!");
				System.out.println("Your Loan Reate of interest is : " + pl.getROI());
				pl.getPersonalLoanDocumentInfo();
			} else {
				System.out.println("Something went wrong with oersonal Details !! Can you re check once ");
			}

		} else {
			System.out.println("Your Loan got rejected !!");
		}

	}

}
