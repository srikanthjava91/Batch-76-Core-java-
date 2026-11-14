package com.oops.abstraction;

import java.sql.SQLException;

public class TestAnimal {
	
	

	public static void main(String[] args) throws SQLException {
		System.out.println("Welcome to Animal Park : " + Animal.orgName);

		System.out.println("**Cat Information*** ");
//		Up-casting is the process abstraction
		Animal c = new Cat();
		c.eat();
		c.sound();
		c.walk();
		c.sleep();
		c.run();

//		interface static methods, we cannot call by using Object reference variable
//		This static method of interface Animal can only be accessed as Animal.breath
//		We can all by using interface name only.
//		c.breath();
		Animal.breath();

		System.out.println("**Dog Information*** ");
		Animal d = new Dog();
		d.eat();
		d.sound();
		d.walk();
		d.sleep();
		d.run();

		System.out.println("**Monkey Information*** ");
		Animal m = new Monkey();
		m.eat();
		m.sound();
		m.walk();
		m.sleep();
		m.run();

	}

}
