package com.langfundamentals;

//Type Of Variables 

//static variables : 
//	- The class level variables creating with static keyword will consider as static
//  - Whenever the data is same for all the objects then will keep such data as static.
//  - static data, we can access without Object creation like 
//within the class directly we can access, 
//outside of the classes, we can access by using class name and 
//we access through object reference variable also.

//instance Variables : 
//	- The class level variables creating without static will consider as instance.
//  - Whenever the data is changing from Object to Object then will keep such data as instance.
//  - instance data, we can access only through object reference variables but not with the class name.

//Local Variables : 
//  - The block or method level variables will consider as local.
//  - Whenever we want to maintain Temporary data within the block or method will use local variables.
//  - local variables, we can access directly.
//  -Q)  For local variables can we keep static ..? No it gives compile time error : Illegal modifier
//  - The only applicable modifier for local variables are final.
  
public class Employee {

//	Primitive + instance 
	int emp_id;
//	Object + instance 
	String emp_name;

//	primitive + static 
	static int org_Id = 555;
//	Object + static 
	static String org_Name = "Vcube";

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		int org_Id = 666;
		String org_Name = "VSS";

		System.out.println(org_Id);//
		System.out.println(org_Name);//

		System.out.println("*******************************");

		Employee e1 = new Employee();

//		Initialization 
		e1.emp_id = 101;
		e1.emp_name = "Srikanth";

		// Primitive + local
		int age;
		// Object + Local
		String city;

//		 Accessing local variables
//		The local variable age may not have been initialized.
//		We cannot ACcess Local variables, Without Initialization.
//		System.out.println(age);//
		age = 22;
		System.out.println(age);
		city = "Hyderabad";
		System.out.println(city);

		System.out.println("----------------------------");

		System.out.println("Accessing static data directly !!");
//		Accessing static Data directly is possible within class only.
		System.out.println(org_Id);
		System.out.println(org_Name);

//		Whenever we want to access static data, outside of the classes then we choose class name.
		System.out.println("Accessing static data by using class name !!");
		System.out.println(Employee.org_Id);
		System.out.println(Employee.org_Name);

//		When we access static data using object reference variable, 
//		we will get Warning from the Compiler : 
//		The static field Employee.org_Id should be accessed in a static way
		System.out.println("Accessing static data by using Object reference variable ");
		System.out.println(e1.org_Id);
		System.out.println(e1.org_Name);

//		But, instance data we can access only through Object Reference variable.
//		Accessing instance data by using Object Reference variables.
		System.out.println(e1.emp_id);
		System.out.println(e1.emp_name);

//		Even though e2 is null, static data is loading 
//		so there is no impact to call static data by using object reference variable. 
//		The Recommended approach to access static data is by using class name only.
		Employee e2 = null;
		System.out.println(e2.org_Id);
		System.out.println(e2.org_Name);

//		System.out.println(e2.emp_id); // NPE
//		System.out.println(e2.emp_name);// NPE

		System.out.println("main method ended ");

	}
}
