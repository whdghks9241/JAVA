package com.kh.superSample;

//            자식  상속받는다 	 부모
public class Child extends Parent {
	// Child() -> 접근제한자가 default로 변경된 것일 뿐 public과 동일하다
	public Child() { 
		// 부모 클래스의 기본 생성자 호출
		super(); // 
		System.out.println("자식 클래스 기본 생성자입니다.");
	}
	
	public Child(String name) {
		// 부모 클래스의 문자열 파라미터 생성자 호출
		super(name);
		System.out.println("자식 클래스의 문자열 파라미터 생성자입니다.");
	}
	
	public void display() {
		// 부모 클래스의 show 출력 메서드 호출
		super.show();
		System.out.println("자식 클래스의 display 메서드 입니다.");
	}
	
}
