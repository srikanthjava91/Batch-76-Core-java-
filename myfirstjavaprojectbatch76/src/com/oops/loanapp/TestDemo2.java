package com.oops.loanapp;

class Human {

	public Human() {
		System.out.println("Human No arg constructor called ");
	}

}

class Person {
	public Person() {
		System.out.println("Person No arg constructor called ");
	}
}

class Employee extends Person {
	public Employee() {
		super();
		System.out.println("Employee No arg constructor called ");
	}

}

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Employee emp = new Employee();

	}
}
