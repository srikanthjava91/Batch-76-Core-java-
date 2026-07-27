package com.javaintro;

public class TestDemo5 {

	//Native methods do not specify a body
	native void welcome();
	
	void hello() {
		System.out.println(Thread.currentThread());
		int a = 10;
		int b = 20;

		System.out.println(a + b);

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		TestDemo5 t = new TestDemo5();
		t.hello();
		t.welcome();

		System.out.println(Thread.currentThread());
	}

}
