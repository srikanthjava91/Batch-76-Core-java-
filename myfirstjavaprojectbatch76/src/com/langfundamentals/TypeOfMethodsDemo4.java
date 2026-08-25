package com.langfundamentals;

import java.util.Scanner;

//4) With Return Type + WIth Parameters
//WAP to print 
//	- Areas of Square		--> side * side 
//  - Area of Rectangle 	--> Length * Breadth 
//  - Area of Triangle 		--> 0.5 * base * height 
//  - Area of Circle 		--> PI * r * r 
public class TypeOfMethodsDemo4 {

	void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter side : ");
		float side = sc.nextFloat();

		float arofSq = findAreaOfSquare(side);
		System.out.println("Area of Square is : " + arofSq);

		System.out.println("****************************************");

		System.out.println("Enter Length : ");
		double length = sc.nextDouble();

		System.out.println("Enter Breadth : ");
		double breadth = sc.nextDouble();

		double arOfRec = findAreaOfRectangle(length, breadth);
		System.out.println("Area of Rectangle is : " + arOfRec);

		System.out.println("****************************************");

		System.out.println("Enter Base : ");
		double base = sc.nextDouble();

		System.out.println("Enter Height :  ");
		double height = sc.nextDouble();
		double arOfTri = findAreaOfTriangle(base, height);
		System.out.println("Area of Triangle is :  " + arOfTri);

		System.out.println("****************************************");

		System.out.println("Enter Radius : ");
		double radius = sc.nextDouble();
		double arofCircle = findAreaOfCircle(radius);

		System.out.println("Area of Circle is : " + arofCircle);

		System.out.println("main method ended !!");

	}

	double findAreaOfCircle(double r) {
		double arCir = Math.PI * r * r;
		return arCir;
	}

	double findAreaOfTriangle(double base, double height) {
		double arTri = 0.5 * base * height;
		return arTri;
	}

	double findAreaOfRectangle(double length, double breadth) {
		double arRec = length * breadth;
		return arRec;
	}

	float findAreaOfSquare(float side) {
		float arSq = side * side;
		return arSq;
	}

}
