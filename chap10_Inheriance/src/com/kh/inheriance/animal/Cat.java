package com.kh.inheriance.animal;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		System.out.println(getName() + "주인이 와서 달린다");
	}
	
	@Override // 한번더 다시 정의를 내린다 / 가독성이 좋게 하기위에 사용하기도함
	public void eat() {
		System.out.println(getName() + " 먹는데 중간에 먹이통 뺏을거야");
	}
}
