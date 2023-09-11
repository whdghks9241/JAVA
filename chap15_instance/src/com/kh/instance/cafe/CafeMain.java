package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		// 사이즈와 설탕여부
		Cafe Cafe1 = new Cafe("아이스초코", 3, false);

		Cafe Cafe2 = new Cafe("아메리카노", 3, true);
		
		Cafe Cafe3 = new Cafe("복숭아아이스티", 3, true);
		

		Cafe1.makeing();
		Cafe2.makeing();
		Cafe3.makeing();
	}
}
