package com.oops;

//Find Areas ..? 
//findArea() using Polymorphism
// Area of Triangle -> 0.5 * base * height 
// Area Of Square -> side * side 
// Area of Rectangle -> Length * breadth 
//Area of Circle --> PI.r * r 
public class TestPolyDemo5 {

	void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Area OF Triangle " + findArea(10.5, 6.9));
		System.out.println("Area of Square : " + findArea(10.5));
		System.out.println("Area of Rectangle : " + findArea(5, 5.9F));
		System.out.println("Area of Circle : " + findArea(5));
	}

	double findArea(float r) {
		System.out.println("Circle info ");
		return Math.PI * r * r;
	}

	double findArea(double l, float b) {
		System.out.println("Rectangle info ");
		return l * b;
	}

	double findArea(double base, double height) {
		System.out.println("Triangle info ");
		return 0.5 * base * height;
	}

	double findArea(double side) {
		System.out.println("Square info ");
		return side * side;
	}
}
