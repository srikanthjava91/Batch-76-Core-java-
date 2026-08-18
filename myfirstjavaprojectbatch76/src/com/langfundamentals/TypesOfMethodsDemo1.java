package com.langfundamentals;

//	1) No return type + No Parameters  : instance & static 
public class TypesOfMethodsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		TypesOfMethodsDemo1 t1 = new TypesOfMethodsDemo1();

		welcome();
		TypesOfMethodsDemo1.welcome();
		t1.welcome();

		t1.display();
	}

	// instance method
	void display() {
		System.out.println("Display your ID card ");
	}

	// static method
	static void welcome() {
		System.out.println("Welcome to Vcube-Java!!");
	}

}
