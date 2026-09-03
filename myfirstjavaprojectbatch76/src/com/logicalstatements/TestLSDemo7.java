package com.logicalstatements;

import java.util.Scanner;

//WAP to print Week day informations..
public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Week day ");
		String day = sc.next().toUpperCase();

		switch (day) {
		case "MON" -> System.out.println("Yes !! Monday's are always Lazy Days");
		
		case "TUE","WED","THUR" 
		-> System.out.println(" Tuesday, Wednesday & Thursday are the Routine Days");
		
		case "FRI" -> System.out.println("Weekend Mode started : ");
		
		case "SAT","SUN" -> System.out.println("Saturday & Sundays are Holidays and Happy days");
		
		default-> System.out.println("Something went wrong in your entry please check again");
		}
		
		System.out.println("main method ended");

	}

}
