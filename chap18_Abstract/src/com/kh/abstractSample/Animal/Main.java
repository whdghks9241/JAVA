package com.kh.abstractSample.Animal;

public class Main {
	public static void main(String[] args) {
		
		Animal[] animal = new Animal[2];
		
		Dog dog = new Dog("강아지");
//		System.out.print(dog.getname() + " ");

//		System.out.println(dog.makeSound());
	
		// 1. cat 만들기
		// Cat ct = new Cat ("고양이")
		// 2. 객체배열로 Animal 정의해서 출력하기 다향성을 활용한 객체 다루기
		// Animal[] animal = new Animal[];
		Cat cat = new Cat("고양이");

		animal[0] = dog;
		animal[1] = cat;
		
		for (Animal str : animal) {
			System.out.println(str.makeSound());
		}
		
	}
}
