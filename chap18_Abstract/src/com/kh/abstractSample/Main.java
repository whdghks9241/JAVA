package com.kh.abstractSample;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Red", 5.0);
		System.out.println("Circle Area : " + circle.calculateArea());
		System.out.println("Circle Color : " + circle.getColor());
		
		Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
		System.out.println("rectangle Area : " + rectangle.calculateArea());
		System.out.println("rectangle Color : " + rectangle.getColor());
	}

}
