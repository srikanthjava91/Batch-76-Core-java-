package com.oops.abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat can sounds like Meow Meow...");
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat rat or vegetables !!");
	}

	@Override
	public void walk() {
		System.out.println("Cat can walk like a cat-walk !!!");
	}

}
