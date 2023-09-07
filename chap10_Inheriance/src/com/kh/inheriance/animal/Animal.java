package com.kh.inheriance.animal;

// 동물 클래스 정의
public class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void setName() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void info() {
		System.out.println("이름 " + name);
	}
	public void eat() {
		System.out.println(name + " 먹이를 먹습니다.");
	}
	
	public void sleep() {
		System.out.println(name + "이(가) 잠을 잡니다");
	}
}
