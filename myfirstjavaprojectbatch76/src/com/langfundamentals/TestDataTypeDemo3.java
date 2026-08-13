package com.langfundamentals;

class Student {
	int sid;
	String sname;
	Address address = new Address();;;;;;;;;;;;;;;;;;;;;;;;;;;

}

class Address {
	String street;
	String city;
	String state;
}

public class TestDataTypeDemo3 {

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.sid = 101;
		s1.sname = "Srikanth";

//		null dot any operation is NullPointerException 
//		java.lang.NullPointerException: Cannot assign field "street" because "s1.address" is null
		s1.address.street = "JNTU";
		s1.address.city = "Hyderabad";
		s1.address.state = "TG";

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println(s1.address.state);
		System.out.println(s1.address.street);

	}

}
