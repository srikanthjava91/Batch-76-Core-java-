package com.langfundamentals.constructors;

public class Employee {

	int eid;
	String ename;
	double esal;

	Employee() {
		System.out.println("no-arg constructor called !!");
		eid = 100;
		ename = "unknown";
		esal = 10000.00;
	}

//	To avoid ambiguity and to provide better readability we should use exact names in constructors.
//	If we use exact names, we must use this keyword to invoke current class object data members.
	Employee(int eid, String ename, double esal) {
		System.out.println("Parameterized constructor called ");
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Employee Information ");

		Employee e1 = new Employee();//
		e1.show();

		Employee e2 = new Employee(101, "Raj", 20000.00);
		e2.show();

	}

	void show() {
		System.out.println("*************************");
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}

}
