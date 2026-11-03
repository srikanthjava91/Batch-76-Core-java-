package com.oops;

public class Mobile {

	String model;
	String brand;
	double price;

	@Override
	public String toString(){
		return "MObile[ model :" + model 
				+", Brand :" + brand 
				+", Price : " + price ;
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();

		System.out.println(m);
		int a = 0x2b2fa4f7;
		System.out.println(a);

		System.out.println(m.getClass());
		System.out.println(m.hashCode());

		Mobile m1 = new Mobile();
		Mobile m2 = m1;

		System.out.println(m.equals(m1));
		System.out.println(m2.equals(m1));

	}

}
