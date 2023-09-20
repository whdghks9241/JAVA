package com.kh.example.practice3.model.vo;

public class Circle {

	double PI = 3.14;
	
	int radius = 1;

	public Circle() {
		// 기본 생성자 , 아무런 초기화를 진행하지 않고 진행

	}
	
	// 
	public void incrementRadius() {
		// 
		System.out.println("원의 반지름 : " + radius++);
	}
	
	// 원의 둘레 구하기
	public void getAreaOfCircle() {
		// (원의 반지름) X 2 X (원주율)
		System.out.println("원의 둘레 : " + (radius * 2) * PI);
	}
	
	// 원의 넓이 구하기
	public void getSizeOfCircle() {
		// (원의 반지름) X (원의 반지름) X (원주율)
		System.out.println("원의 넓이 : " + (radius * radius) * PI);
	}
}
