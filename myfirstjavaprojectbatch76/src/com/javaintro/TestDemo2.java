package com.javaintro;

//Methods info 
public class TestDemo2 {

//	instance method 
	void hello() {
		System.out.println("Hello guys, Good morning Have a nice day !");
		System.out.println("Hello guys, Good morning Have a nice day !");

	}

//	static method 
	static void welcome() {
		System.out.println("Welcome to Java World !");
		System.out.println("Welcome to Java World !");
		System.out.println("Welcome to Java World !");
	}

//	static main method 
	public static void main(String[] args) {
		System.out.println("main method started ");

		TestDemo2 t = new TestDemo2();

//		Calling the method directly 
		welcome();

//		Calling the method by using object reference variable 
		t.hello();

		System.out.println("main method ended ");
	}

}
