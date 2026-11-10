package com.oops.loanapp;

import java.util.Scanner;

//Child or sub or Derived 
//Whenever we are working with Parent & Child Relationship, Generally we 4 work 4 Scenarios in 4 Different Requirements.
public class PersonalLoan extends LoanImpl {

	static Scanner sc = new Scanner(System.in);

//	Rule 1 : Method signature must be same.
//	Note : Method signature include : Method name + Method Parameters but not return type.

//	Rule 2: Method return type must be same until java 1.4 version.
//	But, Later we can use co-varient return types.
//	Note : Even though after 1.5 version 
//	If the Parent class method returns primitive data type, then the child class must return the same return type.
//	But, If the Parent class method returns Object Data type, then the child class can use same Object data type or Co-varient return type.
//	So Co-varient type is applicable only for Object Data Types.
//	Q)What is Co-varient return type.
//	If the Parent class return any Object data type the child class method can return the same data type or it's sub type will consider as co-varient return types.
//	ex: P --> Number -----------------  C --> Number/ Byte/ Double / Integer...etc
//	ex: P ---> Object ................ C --> String, StringBuffer r any Other Object
//	ex: P --> String ----------------- C --> String only 
//	ex: P ---> Integer -------------- C --> Number Can we return like this .? Invalid

	// private < <default> < protected < public
//	Rule3 : Method Scope should not reduced.
//	If the Parent class method contains highest scope, 
//	the child class method should not reduce the scope.
//	CE : Cannot reduce the visibility of the inherited method from LoanImpl
// Note  : If the P---> public --------- C --> public 
//	     : If the P---> protected --------- C --> protected / public
//	     : If the P ---> default ---------- C ---> default/ protected / public 
//	     : If the P ---> private ---------- C ----> cannot override private methods.

//	Rule 4 : private methods we cannot Override, because 
//	the scope of private is Within the class which we cannot access outside of the classes.
//	Q) Can we write same parent private method in child class without @Override ..? 
//	Yes we can work, these methods works independently.
//	If we use @Override we will get Compile time Errors.
//	CE : The method getOffer() of type PersonalLoan must override or implement a supertype method

//	Rule 5: static method we cannot override.
//	If we create Parent class same static method in child class 
//	will not consider as a Method Overriding, but will consider as a method Hiding without @Override annotation.
//	If we use @Override we will get Compile time Errors.
//	Why because, static methods can load whenever the class loads but method overriding is depending on Object creation.

//	Rule 6 : final methods we cannot Override.
//	If the class is final, all the methods from that class are also final.
//	If the class is final, all the variables inside that class are not final.
//	But, final methods can access outside of the classes.
	
//	Rule 7 : Exception Related : 
//	If the Parent class method throws any Exception, the child class overridden method 
//	no need to throws the any Exceptions.But, If the Child class method throws any Exception
//	the Parent class method must throws the Same Exception or it's Parent Exception.
	
//	Rule 8 : abstract Related : 
//	If the Parent class is Abstract which contains abstract methods, 
//	those abstract methods must override in child classes.
//	If the normal class contains normal methods 
//	can be override it in abstract class as abstract methods.
	
	private Integer getOffer() {
		return 0;
	}

	@Override
	public double getROI() {
		System.out.println("getROI called from PersonalLoan ");
		double roi = 16.0;

		int cibil = getCibiliScore();

		if (cibil > 800 && cibil <= 900) {
			System.out.println("Excellent : Strong credit profile, best loan terms.");
			roi = roi - 6;// 10
		} else if (cibil > 760 && cibil <= 800) {
			System.out.println("Very Good : High approval chances, competitive rates.");
			roi = roi - 5;// 11
		} else if (cibil > 700 && cibil <= 760) {
			System.out.println("Good : Eligible for most loans with decent terms.");
			roi -= 4;// 12
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("Average : May get loans but at higher interest.");
			roi -= 3;// 13
		} else if (cibil >= 300 && cibil <= 600) {
			System.out.println("Poor : High risk; loan applications often rejected. ");
			roi -= 2;// 14
		} else {
			System.out.println("Invalid Cibil !!");
		}

		return roi;
	}

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

//		PersonalLoan pl2 = (PersonalLoan) new LoanImpl();
//		pl2.getCibiliScore();
//		pl2.getPersonalLoanDocumentInfo();

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
		LoanImpl l2 = new PersonalLoan();
//		CE : The method getPersonalLoanDocumentInfo() is undefined for the type Loan
//		l2.getPersonalLoanDocumentInfo();
		l2.hello();

//		Scenario 2: 
//		By using Parent Object & Parent reference 
//		We can access only Parent class functionalities
		Loan l1 = new LoanImpl();

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
