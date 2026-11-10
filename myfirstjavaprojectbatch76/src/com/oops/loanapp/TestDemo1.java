package com.oops.loanapp;

import java.io.IOException;

abstract class Animal {

	public static void main(String[] args) {

	}

	String sound() throws IOException {
		return "Bow Bow !!";
	}

	abstract void sleep();

}

class Dog extends Animal {

	public static void main(String[] args) {

	}

	@Override
	String sound() throws IOException {
		return "Bow Bow !!";
	}

	@Override
	void sleep() {
		System.out.println("Animals can sleep !");
	}

}

abstract class BabyDog extends Dog{
	@Override
	abstract void sleep();
	
}

public class TestDemo1 {

	public static void main(String[] args) {

		Dog d = new Dog();
//		System.out.println(d.sound());

//		Animal a = new Animal();
//		System.out.println(a.sound());

	}

}
