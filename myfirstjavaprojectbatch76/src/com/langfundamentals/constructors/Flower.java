package com.langfundamentals.constructors;

public class Flower {

	String name1 = "Jasmine";
	String color = "White";
	
	public static void main(String[] args) {
		System.out.println("main method started from Flower");
	}

}

class Rose extends Flower {

	String name = "Rose";
	String color = "RED";

	public static void main(String[] args) {
		System.out.println("main method started from Rose");

		Rose r = new Rose();
		r.roseInfo();

//		Cannot use super in a static context
//		System.out.println("Name of the Flower : " + super.name);
		System.out.println("main method ended from Rose");
	}

	// instance method
	void roseInfo() {
		System.out.println("Child class data : ");
		System.out.println("Name of the Flower : " + this.name);
		System.out.println("Color of the Flower : " + this.color);

		System.out.println("Parent class data : ");
		System.out.println("Name of the Flower : " + super.name1);
		System.out.println("Color of the Flower : " + super.color);

	}

}
