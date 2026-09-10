package com.logicalstatements.loops;

//Q) WAP to swap the numbers with using XOR ..? 
public class TestLSDemo13 {

	public static void main(String[] args) {

		int a = 10;// 16 8 4 2 1 --> 0 1 0 1 0
		int b = 20;// 16 8 4 2 1 --> 1 0 1 0 0
//						-----------------------------------
//										   1 1 1 1 0 = 30 	

		a = a ^ b;// 30
		b = a ^ b;// 10 16 8 4 2 1 --> 1 1 1 1 0
//										   1 0 1 0 0 
//										   -------------
//											0 1 0 1 0  = 10 

		a = a ^ b; // 20
//	   								1 1 1 1 0
//	   								0 1 0 1 0
//	   								------------	
//	}								1 0 1 0 0	

		System.out.println("A value is : " + a);
		System.out.println("B value is : " + b);
	}

}
