package com.oops.copy;

class Student implements Cloneable {
	int id;
	String name;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

}

public class TestShallowCopyDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address add = new Address("Hyderabad");
		Student s1 = new Student(1, "Srikanth", add);

		System.out.println(s1.id);// 1
		System.out.println(s1.name);// Srikanth
		System.out.println(s1.address.city);// Hyderabad
		System.out.println("--------------------------------");
		
		Student s2 = (Student) s1.clone();// Shallow Copy
		System.out.println(s2.id);// 1
		System.out.println(s2.name);// Srikanth
		System.out.println(s2.address.city);// Hyderabad
		System.out.println("***************************************");
		
		s2.id = 2;
		s2.name = "Sri";
		s2.address.city = "Banglore";
		System.out.println(s2.id);// 2
		System.out.println(s2.name);// Sri
		System.out.println(s2.address.city);// Banglore
		System.out.println("--------------------------------");
		System.out.println(s1.id);// 1
		System.out.println(s1.name);//Srikanth 
		System.out.println(s1.address.city);// Banglore
		

	}

}
