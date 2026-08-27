package com.langfundamentals.constructors;

public class Movie {

	String director;
	String producer;
	String hero;
	String heroine;
	String name;
	double budget;

	Movie(String director, String producer) {
		this.director = director;
		this.producer = producer;
	}

	Movie(Movie m, String hero, String heroine) {
		this.director = m.director;
		this.producer = m.producer;
		this.hero = hero;
		this.heroine = heroine;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Movie m1 = new Movie("S S Rajamouli", "D V V ");
		m1.movieInfo();

		Movie m2 = new Movie(m1, "Super Star Mahesh Babu", "Priyank Chopra");
		m2.movieInfo();

		System.out.println("main method ended ");
	}

	void movieInfo() {
		System.out.println("Director of the Movie : " + director);
		System.out.println("Producer of the Movie : " + producer);
		System.out.println("Hero of the Movie : " + hero);
		System.out.println("Heroine of the Movie : " + heroine);
		System.out.println("Name of the Movie : " + name);
		System.out.println("Budget of the Movie : " + budget);
		System.out.println("--------------------------------");

	}
}
