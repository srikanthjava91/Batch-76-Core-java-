package com.oops.abstraction;

//Interfaces cannot have constructors
//By default interface is abstract whether we give or not !!
//interface tells What to do,but not how to do ..!!
//By default interface methods are public & abstract
//Abstract methods do not specify a body
public abstract interface Animal {

//	By default interface variables are public final static
//	final variables which we cannot change the value.
	public final static int a = 10;
	public static final String orgName = "Vcube";

//	abstract methods : which is only for declaration 
	public abstract void sound();

	public abstract void eat();

	public abstract void walk();

//	default methods can helpful to avoid backward-compatability Problems.
//	Can we override default methods ..? Yes 
	public default void sleep() {
		System.out.println("Animals can sleep ");
		hello();
	}

	public default void run() {
		System.out.println("Animals can run !!");
		hello();
	}

//	static methods are helpful to provide constant utility behavior for all the classes.
//	static methods we cannot override.
//	interface static methods should call by using interface name only.
	public static void breath() {
		System.out.println("Animals must breath !!");
	}

//	private methods introduced from 1.9 to avoid duplicate code in default methods.
//	Because, private methods we cannot override.
	private void hello() {
		System.out.println("Hello !!");
		System.out.println("Hello !!");
		System.out.println("Hello !!");
		System.out.println("Hello !!");
		System.out.println("Hello !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
//		Cannot instantiate the type Animal
//		Animal a = new Animal();
	}

}
