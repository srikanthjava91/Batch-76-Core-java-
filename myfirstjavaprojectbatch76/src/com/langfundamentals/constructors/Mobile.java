package com.langfundamentals.constructors;

public class Mobile {

	String model;
	String brand;
	double price;

	public Mobile(String model, String brand, double price) {
		System.out.println("paramterized constructor ");
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	Mobile(Mobile m) {
		this.model = m.model;
		this.brand = m.brand;
		this.price = m.price;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Mobile ");

		Mobile m1 = new Mobile("17 Pro Max", "Iphone", 85000.00);
		m1.mobileInfo();

		Mobile m2 = new Mobile(m1);
		m2.mobileInfo();
		
		Mobile m3 = new Mobile(m1);
		m3.mobileInfo();

	}

	void mobileInfo() {
		System.out.println("Model of the Mobile : " + model);
		System.out.println("Brand of the Mobile : " + brand);
		System.out.println("Price of the Mobile : " + price);
		System.out.println("--------------------------------");
	}

}
