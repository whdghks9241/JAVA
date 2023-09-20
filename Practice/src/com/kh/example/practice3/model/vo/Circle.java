package com.kh.example.practice3.model.vo;


public class Circle {

	// 맴버 변수
	// private static final double PI = 3.14;
	private double PI = 3.14; // 변수
	
	private int radius = 1; // 상수
	
	public double getPI() {
		return PI;
	}

	public int getRadius() {
		return radius;
	}
	
	public void setPI(double pI) {
		PI = pI;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void incrementRadius() {
		
		System.out.println(radius++);
	}
	
	public void getAreaOfCircle() {
		double aree = PI * radius * radius;
		System.out.println("원의 넓이 : " + aree);
	}

	public void getSizeOfCircle() {
		System.out.println("원의 크기 (반지름) : " + radius);
	}

}

