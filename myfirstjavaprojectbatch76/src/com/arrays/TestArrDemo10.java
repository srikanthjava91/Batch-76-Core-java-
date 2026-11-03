package com.arrays;

public class TestArrDemo10 {

	public static void main(String[] args) {

		String[][] names = new String[3][3];// 0 1 2 --> 0 1 2

		names[0][0] = "Srikanth";
		names[0][1] = "Sudhir";
		names[0][2] = "Srinivas";

		names[1][0] = "Srikanth";
		names[1][1] = "Sudhir";
		names[1][2] = "Srinivas";

		names[2][0] = "Srikanth";
		names[2][1] = "Sudhir";
		names[2][2] = "Srinivas";

//		for (String[] nm1 : names) {
//			for (String name : nm1) {
//				System.out.print(name + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}

	}

}
