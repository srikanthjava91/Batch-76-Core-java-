package com.javaintro;

public class TestDemo4 {

	static TestDemo4 t4 = new TestDemo4();

	// static Block
	static {
		System.out.println("static block called1 ");

	}

	// instance block
	{
		System.out.println("instance block called 1");
//		TestDemo4 t4 = new TestDemo4();
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println("main method ended ");
	}

}
