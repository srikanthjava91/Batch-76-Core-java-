package com.logicalstatements;

import java.util.Scanner;

//
//veg non-veg starters soups dessert 
//WAP to print the invoice based on items from fruits and vegetables..?
public class TestLSDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		String yn = "";

		double totalPrice = 0;

		do {

			System.out.println("Enter Category ..? ");
			String catg = sc.next();

			switch (catg) {
			case "fruits" -> {

				String fyn = "";
				double totalFruitsCost = 0;
				do {

					System.out.println("Enter the item ");
					String item = sc.next();

					switch (item) {

					case "mng" -> {
						System.out.println("Mango per KG is 160 rs");
						double mngPrice = 160;
						totalFruitsCost = totalFruitsCost + mngPrice;
					}

					case "app" -> {
						System.out.println("Apple per KG is 180 rs");
						double appPrice = 180;
						totalFruitsCost = totalFruitsCost + appPrice;
					}

					case "ban" -> {
						System.out.println("Banana per KG is 60 rs");
						double banPrice = 60;
						totalFruitsCost = totalFruitsCost + banPrice;
					}

					case "org" -> {
						System.out.println("Orange per KG is 100 rs");
						double orgPrice = 100;
						totalFruitsCost = totalFruitsCost + orgPrice;
					}

					case "grapes" -> {
						System.out.println("Grapes per KG is 120 rs");
						double grapesPrice = 120;
						totalFruitsCost = totalFruitsCost + grapesPrice;
					}

					default -> System.out.println("Entered Item is Not availble !!");

					}

					System.out.println("DO you Want to continue with Fruits Click Y for Yes N for no ..?");
					fyn = sc.next();
				} while (fyn.equalsIgnoreCase("y"));

				System.out.println("Your Total Fruits Cost is : " + totalFruitsCost);
				totalPrice = totalPrice + totalFruitsCost;
				System.out.println("Exit From Fruits Category !!!");

			}
			case "veg" -> {

				String vyn = "";
				double totalVegCost = 0;

				do {
					System.out.println("Enter Item : ");

					String item = sc.next();

					switch (item) {

					case "tmt" -> {
						System.out.println("Tomato per kg is 40rs ");
						double tmtPrice = 40.0;
						totalVegCost = totalVegCost + tmtPrice;
					}

					case "pot" -> {
						System.out.println("Potato per kg is 50rs");
						double potatoPrice = 50.0;
						totalVegCost = totalVegCost + potatoPrice;
					}

					case "oni" -> {
						System.out.println("Onion per kg is 60rs");
						double onionPrice = 60.0;
						totalVegCost = totalVegCost + onionPrice;
					}

					case "car" -> {
						System.out.println("Carrot per kg is 70rs");
						double carrotPrice = 70.0;
						totalVegCost = totalVegCost + carrotPrice;
					}

					case "cab" -> {
						System.out.println("Cabbage per kg is 45rs");
						double cabbagePrice = 45.0;
						totalVegCost = totalVegCost + cabbagePrice;
					}

					case "brj" -> {
						System.out.println("Brinjal per kg is 55rs");
						double brinjalPrice = 55.0;
						totalVegCost = totalVegCost + brinjalPrice;
					}

					default -> System.out.println("Entered Item is not availble : ");

					}

					System.out.println("Do you want to Continue with Vegetables ..? Click Y for Yes N for No");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));

				System.out.println("Your Total Vegtables Cost is : " + totalVegCost);
				totalPrice = totalPrice + totalVegCost;
				System.out.println("Exit From Vegetable Category !!!");

			}

			default -> System.out.println("Entered Ctegory is not availble ..!!");

			}
			System.out.println("Do you want to continue with Category ..? Click Y for Yes N for N");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("Y"));

		System.out.println("Total Price is : " + totalPrice);

	}

}
