package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp3 = new Employee(45,"Rohit",300000);
		System.out.println(emp3);
		
		
		
		System.out.println(emp3.getEid());
		System.out.println(emp3.getEname());
		System.out.println(emp3.getSal());

//		Accessing the default data within the package 
//		Whenever the data is private, we cannot access outside of the classes 
//		CE : The field Employee.eid is not visible

		Employee emp1 = new Employee();
		emp1.setEid(72);
		emp1.setEname("Tialkk");
		emp1.setSal(100000.00);
		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getSal());

		Employee emp2 = new Employee();
		emp2.setEid(18);
		emp2.setEname("Kohli");
		emp2.setSal(200000.00);
		System.out.println(emp2.getEid());
		System.out.println(emp2.getEname());
		System.out.println(emp2.getSal());

//		emp1.eid = 72;
//		emp1.ename = "Tilak Varma";
//		emp1.sal = 100000.00;
//
//		System.out.println(emp1.eid);
//		System.out.println(emp1.ename);
//		System.out.println(emp1.sal);

	}

}
