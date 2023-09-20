package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	
	String name;

	// 积己磊 super 
	public Dog(String name) {
		super(name);
	}

	// @Override 荤侩
	public String makeSound() {
		return "港港";
	}
}
