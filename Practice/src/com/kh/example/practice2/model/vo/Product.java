package com.kh.example.practice2.model.vo;

public class Product {

	private String pName; 
	private String brand;
	private int price;
	
	public Product(String pName, String brand, int price) {
		this.pName = pName;
		this.brand = brand;
		this.price = price;
	}
	
	public void information() {
		System.out.println(" 상품명 : " + pName);
		System.out.println(" 가격 : " + price + "원");
		System.out.println(" 브랜드 : " + brand);
	}
}
