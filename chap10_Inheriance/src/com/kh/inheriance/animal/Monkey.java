package com.kh.inheriance.animal;

public class Monkey extends Animal{

	public Monkey(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void action() {
		System.out.println(getName() + " 나무를 탑니다");
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + " 는 먹이를 먹을때 나무위로 올라갑니다");
	}
}
