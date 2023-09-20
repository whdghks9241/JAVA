package com.kh.foodStore;

public class Main {

	public static void main(String[] args) {
		Order order = new Order();
		order.addMenu("Â«»Í");
		order.addMenu("Â¥Àå¸é");
		order.addMenu("±¼Â«»Í");
	
		order.printMenu();
		
		FoodStore order1 = new Order2();
		order1.addMenu("ºÒ°í±â ÁÖ¹®");
		order1.addMenu("»ï°ã»ì ÁÖ¹®");
		order1.addMenu("ÇØÀå±¹ ÁÖ¹®");
	
		order1.printMenu();
	}
}
