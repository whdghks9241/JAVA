package com.kh.overloadingEx;

/**
 java 파일 만들고
 OverSample.java 만들고
 오버로딩 5개 만들고 메서드 5개 출력
 */
public class OverloadingExam {

	// 정수형 덧셈
	public int sum(int a, int b) {
		return a+b;
	}
	
	// 세 개의 정수형 덧셈
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	// 두 개의 실수형 덧셈
	public double sum(double a, double b) {
		return a+b;
	}

	public double sum(double a, double b, double c) {
		return a+b+c;
	}
	
	
	public static void main(String[] ergs) {
		
		OverloadingExam obj = new OverloadingExam();
		
		// 메서드 호출
		System.out.println("두 정수의 합 : " + obj.sum(50, 50));
		System.out.println("세 정수의 합 : " + obj.sum(50, 50, 20));
		System.out.println("두 실수의 합 : " + obj.sum(51.0, 50.90));
		System.out.println("세 실수의 합 : " + obj.sum(50.1, 50.5, 10.1));
		
	}
}
