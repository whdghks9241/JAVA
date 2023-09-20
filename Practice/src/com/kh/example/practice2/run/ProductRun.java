package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class ProductRun {
	
	public static void main(String[] args) {
		
		Product product = new Product("¶ó¸é", "³ó½É", 150);
		
		product.information();
		
	}
}
