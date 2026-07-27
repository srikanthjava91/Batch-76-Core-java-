package com.javaintro;

public class TestDemo1 {

	static int a = 10;
	
	static {
		System.out.println("static block called1");
	}

	public static void main(String[] args) {
		System.out.println("main method strated !" + a);
	}

	// static block
	static {
		System.out.println("static block called2");
	}

}
