package com.langfundamentals;

//char Literals, boolean literals & null Literals 
public class TestLiteralsDemo3 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

//		For Every Object we can store null Literal directly.
//		If we want to declare object with empty then will use null literal.
		String s = null;
		TestLiteralsDemo3 t1 = null;

		s = "Srikanth";

		System.out.println(s);
		System.out.println(t1);

//		true or false Literals we can store in boolean 
//		no other value can store boolean 
		boolean isStudentsAreSeriousAboutTheirJob = false;
		boolean isSomeStudentsRocking = true;

		if (isStudentsAreSeriousAboutTheirJob) {
			System.out.println("They will get a job in 4 to 6 monthe ");
		} else {
			System.out.println("Those who are not serious consider as Time-Pass batch  ");
		}

		char c = 'A';// Single Quote characters
		char c1 = 65;// ASCII values
		char c2 = 6556;
		System.out.println(c);// Uni-code values or Hex values
		System.out.println(c1);
		System.out.println(c2);
		System.out.println('\u0020');
		System.out.println('\u0040');
		System.out.println('\uface');
		System.out.println('\uabcd');

		System.out.println("main method ended ");

	}

}
