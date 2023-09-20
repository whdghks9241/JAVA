package com.kh.inheriance.animal;

public class AnimalMain {
	public static void main(String[] args) {
		
		Dog myDog = new Dog("大大捞");
		System.out.println("======================================");

		myDog.info();
		myDog.speak();
		myDog.eat();
		System.out.println("");
		System.out.println("======================================");
	
		Cat myCat = new Cat("绊成捞");
		myCat.run();		
		myCat.eat();
		System.out.println("");
		System.out.println("======================================");

		Lion myLion = new Lion("荤鲤");
		myLion.action();
		myLion.eat();
		System.out.println("");
		System.out.println("======================================");

		Monkey myMonkey = new Monkey("件捞");
		myMonkey.action();
		myMonkey.eat();
		System.out.println("");
	}
}
