package com.kh.abstractSample;

public class Rectangle extends Shape{

	public double width, length;
	
	public Rectangle(String color, double width, double length) {
		super(color);
		this.width = width;
		this.length = length;
	}
	@Override
	public double calculateArea() {
		return width * length;
	}
}
