package com.kh.testSample;

import java.util.ArrayList;

public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a , int b) {
		return a - b;
	}
	
	public ArrayList fortest(int mul) {
		
		ArrayList list = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			mul = 2 * i;
			
			list.add(mul);
		}
		return list;
	}
}
