package com.kh.abstractSample.Animal;

public class Cat extends Animal{

	// 积己磊 super 
	public Cat(String name) {
		super(name);
	}

	@Override
	public String makeSound() {
		return "具克";
	}
	
}
