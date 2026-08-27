package com.langfundamentals.constructors;

//Parent or Super or Base
public class Human {

	String name;
	int age;

	Human() {
		System.out.println("Human Constructor called ");
	}

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Human");
	}

}

//Child or Sub or Derived 
class Person extends Human {

	{
		System.out.println("instance block called ");
	}

	Person() {
		super();
		System.out.println("Person constructor called !!");
	}

	Person(String name, int age) {
//		super(name, age);
		super.name = name;
		super.age = age;
		System.out.println("Two-arg constructors called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Person");

		Person p = new Person();
		p.info();

		Person p1 = new Person("Srikanth", 22);
		p1.info();

	}

	void info() {
		System.out.println("Name  : " + name);
		System.out.println("Age  : " + age);
		System.out.println("-------------------------");
	}
}
