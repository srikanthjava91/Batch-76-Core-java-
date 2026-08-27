package com.langfundamentals.constructors;

public class Chiranjivi {

	int age;
	int moviesCount;

	{
		System.out.println("instance block called ");
	}

	public Chiranjivi() {
		System.out.println("Chirinajivi no arg constructor called !!");
	}

//
	public Chiranjivi(int age, int moviesCount) {
		System.out.println("Paremeterized constructor called ");
		this.age = age;
		this.moviesCount = moviesCount;
	}

	public static void main(String[] args) {
		System.out.println("main method started from chiru");

		Chiranjivi ch = new Chiranjivi();

		Chiranjivi ch1 = new Chiranjivi(72, 160);

	}

}

//Implicit super constructor Chiranjivi() is undefined for default constructor. Must define an explicit constructor
class RamCharan extends Chiranjivi {

	public static void main(String[] args) {
		System.out.println("main method started from Ram ");

		RamCharan r1 = new RamCharan();
		r1.show();

		System.out.println("main method ended from Ram ");
	}

	void show() {
		System.out.println("show method called ");
		System.out.println("Age of the Hero : " + age);
		System.out.println("Movies Count : " + moviesCount);
	}

}