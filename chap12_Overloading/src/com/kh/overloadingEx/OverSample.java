package com.kh.overloadingEx;

public class OverSample {
	/**
	 java 파일 만들고
	 OverSample.java 만들고
	 오버로딩 5개 만들고 메서드 5개 출력
	 */
	// 1. 매개 변수가 없는 생성자
	
	String name;
	int age;
	
	public OverSample() {
		this.name = name;
		this.age = 0;
	}
	
	// 2. 이름만 초기화 하는 생성자
	public OverSample(String newName) {
		this.name = newName;
	}
	
	// 3. 이름과 나이를 초기화 하는 생성자
	public OverSample(String newName, int newAge) {
		this.name = newName;
		this.age = newAge;
	}
	// 4. 이름은 새로 만들지만 나이는 초기화 하는 생성자
	public OverSample(int newAge) {
		this.name = "No Name";
		this.age = newAge;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	public int mul(int a, int b, int c) {
		return a*b*c;
	}
	public int mul(int a, int b, int c, int d) {
		return a*b*c*d;
	}
	public double mul(double a, double b) {
		return a*b;
	}
	public double mul(double  a, double  b, double  c) {
		return a*b*c;
	}
	
	public static void main(String[] args) {
		OverSample obj = new OverSample();

		OverSample obj1 = new OverSample();
		OverSample obj2 = new OverSample("나다");
		OverSample obj3 = new OverSample("나다", 20);
		OverSample obj4 = new OverSample(20);

		// 메서드 호출
		System.out.println("두 정수의 곱 : " + obj.mul(50, 50));
		System.out.println("세 정수의 곱 : " + obj.mul(50, 50, 20));
		System.out.println("네 정수의 곱 : " + obj.mul(50, 50, 20, 5));
		System.out.println("두 실수의 곱 : " + obj.mul(51.0, 50.90));
		System.out.println("세 실수의 곱 : " + obj.mul(50.1, 50.5, 10.1));
	}
}
