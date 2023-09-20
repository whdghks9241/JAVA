package com.kh.inheriance.calculator;

public class Calculator {
	
	int num1, num2;
	// 계산기
	// 1. 더하기
	// 파라미터 = 매개변수 2개
	public int add() { // 파라미텅
		return num1 + num2;
	}
	
	// 2. 빼기
	public int substruct() {
		return num1 - num2;
	}
	
	// 3. 곱하기
	public int multiply() {
		return num1 * num2;
	}
	
	// 4. 나누기
	public int divide() {

		return num1 / num2;
	}

}
