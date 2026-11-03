package com.oops;

//Single Inheritance
//Parent/ Super/ Base
class Animal {

	void Sound() {
		System.out.println("Animals can sound differently but not like Humans");
	}

}

//Child/ Sub / Derived class
class Dog extends Animal {
	@Override
	void Sound() {
		System.out.println("Dog Can sound like Bow bow !!");
	}
}

class BabyDog extends Dog{
	@Override
	void Sound() {
		System.out.println("Baby Dog Can sound like uff uff !!");
	}
}

//Driver class 
public class TestInhDemo1 {

	public static void main(String[] args) {
		BabyDog d = new BabyDog();
		d.Sound();
	}
}
