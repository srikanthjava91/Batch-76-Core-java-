package com.oops.copy;

class Employee {
	int eid;
	String ename;
	double salary;
	Address1 address1;

	public Employee(int eid, String ename, double salary, Address1 address1) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address1 = address1;
	}

	public Employee(Employee emp) {
		this.eid = emp.eid;
		this.ename = emp.ename;
		this.salary = emp.salary;
		this.address1 = new Address1(emp.address1);// Deep Copy
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

	public Address1(Address1 address1) {
		this.city = address1.city;
	}

}

public class TestDeepCopyDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Address1 add = new Address1("Vijayawada");
		Employee emp1 = new Employee(1, "Rahul", 500000.00, add);

		Employee emp2 = new Employee(emp1);
		System.out.println(emp2.eid);
		System.out.println(emp2.ename);
		System.out.println(emp2.salary);
		System.out.println(emp2.address1.city);

		emp2.address1.city = "Warangal";
		System.out.println(emp2.address1.city);
		System.out.println(emp1.address1.city);

	}

}
