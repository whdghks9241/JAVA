package com.kh.abstractSample.Animal;

abstract class Animal {

	// 필드 s name;
	private String name;
	// 생성자
	
	public Animal (String name) {
		this.name = name;
	}
	
	public String displayName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 일반 메서드 동물이름 출력 void displayName();
//	public void displayName() {
//		System.out.println("Animal name : " + name);
//
//	}
	
	// 추상메서드 동물소리출력 void makeSound();
	
	abstract String makeSound();

}
