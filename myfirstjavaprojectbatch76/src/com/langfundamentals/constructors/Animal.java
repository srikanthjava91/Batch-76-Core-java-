package com.langfundamentals.constructors;

public class Animal extends Object{
	Animal(){
		System.out.println("Animal constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Animal ");
		
		Animal a = new Animal();
	}

}

class Dog extends Animal{
	
	Dog(){
		System.out.println("Dog constructor called ");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started from Dog ");
		
		Dog d = new Dog();
		
		System.out.println("main method ended from Dog ");
	}
}