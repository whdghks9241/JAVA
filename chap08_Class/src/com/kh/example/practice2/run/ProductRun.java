package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class ProductRun {
	// Product 생성 3개 하고
	// 각각 상품명 가격 브랜드 출력하기
	public static void main(String[] agrs) {

		Product product = new Product("운동화", 3000, "나이키");
		Product product1 = new Product("라면", 300, "농심");
		Product product2 = new Product("휴대전화", 30000, "삼성");
		
		product.information();		
		product1.information();		
		product2.information();
		
	}
}
