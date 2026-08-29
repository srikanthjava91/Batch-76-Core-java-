package com.operators;

////2) Assignment Operators
////	= += -= *= /= %= 
public class TestAssignmentOpDemo2 {

	public static void main(String[] args) {

		int result = 5;
//		Type mismatch: cannot convert from double to int
//		result = result + 4.5;//CE 
//		result = (int) (result + 4.5);//CE 

		result += 4.5;// result = result + 4.5
		System.out.println("result is : " + result);// 9

//		result = result - 3.5;
		result -= 3.5;
		System.out.println("result is : " + result);// 5

//		result = result * 4.3;
		result *= 4.3;//
		System.out.println("result is : " + result);// 21

//		result = result / 3.5;
		result /= 3.5;// 21/3.5 --> 6
		System.out.println("result is : " + result);// 6

//		result = result % 2.5;
		result %= 2.5;
		System.out.println("result is : " + result);// 1

	}

}
