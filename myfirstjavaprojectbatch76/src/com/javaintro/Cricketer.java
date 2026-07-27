package com.javaintro;

//Note : JVM provides default values for static & instance data. 

//Whenever the data is same for all the Objects then we go for static.
//static data will not change from Object to Object 
//where static data is sharable and for all objects is creating only one copy.
//All static related is storing in "Method area".

//Whenever the data is changing from Object to Object then will choose instance.
//instance data will be changing from Object to Object 
//its creating new Copy for every Object.
//All instance related data is storing into "Heap area".
public class Cricketer {

//	 Declaration
//	static variables 
	static int countryID;
	static String countryName;

//	non-static or instance data 
	int jerseyNo;
	String crickerName;

	public static void main(String[] args) {
		System.out.println("main method strated ");
		System.out.println("Welcome to Indian Cricket Team Info");

		countryID = 91;
		countryName = "India";

//		Accessing the instance data 
//		In static area, We cannot access instance data directly.
//		If we want to access instance data in static area, 
//		We must need to create "Object"
//		Cannot make a static reference to the non-static field jerseyNo
//		System.out.println(jerseyNo);
//		Cannot make a static reference to the non-static field crickerName
//		System.out.println(crickerName);

//		Creating an Object 
//		LHS : class name reference variable = 
//		RHS : new is the keyword in java to create object
//		Constructor calling --> Cricketer()

		System.out.println("******Object1 info ************");
		Cricketer rohit = new Cricketer();

//		Accessing the static data directly
		System.out.println("Country ID  : " + countryID);// 0 --> 91
		System.out.println("Country Name  : " + countryName);// null -->India

//		Accessing the instance data by using Object Reference variable.
		rohit.jerseyNo = 45;
		rohit.crickerName = "Rohit Sharma";
		System.out.println("Jersey Number : " + rohit.jerseyNo);// 0 --> 45
		System.out.println("Cricketer Name : " + rohit.crickerName);// null -->Rohit Sharma
		System.out.println("*********************************");

		System.out.println("******Object2 info ************");
		Cricketer vk = new Cricketer();
		vk.jerseyNo = 18;
		vk.crickerName = "Virat Kohli";
		System.out.println("Country ID  : " + countryID);
		System.out.println("Country Name  : " + countryName);
		System.out.println("Jersey Number : " + vk.jerseyNo);
		System.out.println("Cricketer Name : " + vk.crickerName);
		System.out.println("*********************************");

		System.out.println("******Object3 info ************");
		Cricketer msd = new Cricketer();
		msd.jerseyNo = 7;
		msd.crickerName = "Mahendra Sing Dhoni";
		System.out.println("Country ID  : " + countryID);
		System.out.println("Country Name  : " + countryName);
		System.out.println("Jersey Number : " + msd.jerseyNo);
		System.out.println("Cricketer Name : " + msd.crickerName);
		System.out.println("*********************************");

		System.out.println("******Object4 info ************");
		Cricketer bapu = new Cricketer();
		countryID = 92;
		countryName = "Bharath";
		bapu.jerseyNo = 20;
		bapu.crickerName = "Axar Patel";
		System.out.println("Country ID  : " + countryID);
		System.out.println("Country Name  : " + countryName);
		System.out.println("Jersey Number : " + bapu.jerseyNo);
		System.out.println("Cricketer Name : " + bapu.crickerName);
		System.out.println("*********************************");

		System.out.println("******Object5 info ************");
		Cricketer gill = new Cricketer();
		gill.jerseyNo = 77;
		gill.crickerName = "Shubhman Gill";
		System.out.println("Country ID  : " + countryID);
		System.out.println("Country Name  : " + countryName);
		System.out.println("Jersey Number : " + gill.jerseyNo);
		System.out.println("Cricketer Name : " + gill.crickerName);
		System.out.println("*********************************");
	}

}
