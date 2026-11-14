package com.oops.abstraction;

public class Monkey implements Animal {

	@Override
	public void sound() {
		System.out.println("kchkchckchkchckch");
	}
	
	@Override
	public void run() {
		System.out.println("Monkey can Run and also can do jumps !!");
	}

	@Override
	public void eat() {
		System.out.println("Monkey can eat Bananas");
	}

	@Override
	public void walk() {
		System.out.println("Monkey can walk and also Jumps ");

	}

}
