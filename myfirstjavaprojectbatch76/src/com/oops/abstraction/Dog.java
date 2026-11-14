package com.oops.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("DOg sounds like Bow bow !!!");
	}

	// Default methods are allowed only in interfaces.
	@Override
	public void sleep() {
		System.out.println("Dogs can sleep only mornings and helping at night ");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats mostly Non-veg !!!");
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk but mostly run like anything !!");

	}

}
