package com.javaintro;

public class Customer {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !!");
	}

	public static void main(String[] args) {
		System.out.println("main method strated");

		Customer c1 = new Customer();
		System.out.println(c1);// 1dbd16a6

		Customer c2 = new Customer();
		System.out.println(c2);// 7ad041f3

		Customer c3 = new Customer();
		System.out.println(c3);// 251a69d7

//		 Nullifying the Objects
		c1 = null;
		c2 = null;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.gc();

//		System.out.println(c1.hashCode());
//		
//		int i = 0x1dbd16a6;
//		System.out.println(i);//498931366
	}
}
