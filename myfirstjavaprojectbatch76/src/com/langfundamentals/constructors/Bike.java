package com.langfundamentals.constructors;

public class Bike {

	String model;
	String brand;
	String color;
	double price;
	int year;

	Bike() {
		this("UNKNOWN");
		System.out.println("no arg constructor called !!");
	}

	Bike(String model) {
		this(model, "UNKNOWN");
		System.out.println("one arg constructor called !!");

	}

	Bike(String model, String brand) {
		this(model, brand, 0.0);
		System.out.println("two arg constructor called !!");
	}

	Bike(String model, String brand, double price) {
		this(model, brand, price, "WHITE");
		System.out.println("three arg constructor called !!");
	}

	Bike(String model, String brand, double price, String color) {
		this(model, brand, price, color, 2020);
		System.out.println("four arg constructor called !!");
	}

	Bike(String model, String brand, double price, String color, int year) {
		System.out.println("five arg constructor called !!");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.year = year;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Bike b = new Bike();
		b.bikeInfo();

		Bike b1 = new Bike("FZ-S");
		b1.bikeInfo();

		Bike b2 = new Bike("FZ-S", "Yamaha");
		b2.bikeInfo();

		Bike b3 = new Bike("Classic", "RE", 275000.00);
		b3.bikeInfo();

		Bike b4 = new Bike("Classic", "RE", 275000.00, "Black");
		b4.bikeInfo();

		Bike b5 = new Bike("Classic", "RE", 300000.00, "Black", 2026);
		b5.bikeInfo();

		System.out.println("main method ended ");
	}

	void bikeInfo() {

		System.out.println("Model of the Bike : " + model);
		System.out.println("Brand of the Bike : " + brand);
		System.out.println("Color of the Bike : " + color);
		System.out.println("Price of the Bike : " + price);
		System.out.println("Year of the Bike : " + year);
		System.out.println("*********************************");
	}

}
