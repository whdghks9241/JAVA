package com.kh.classAM;

public class AM {
	public int pNum = 10;

	protected int pNum2 = 20;
	
	// 접근 제한자를 명시하지 않으면 자동으로 default 제한이 적용된다
	int pNum3 = 20;
	
	private int pNum4 = 20;
	
	// 호출 메소드 작성해서 각각 호출
	public void publicMethod() {
		
		System.out.println("public Method() 호출됨");
	}
	
	
	protected void protectedMethod() {
		System.out.println("protected Method() 호출");
	}
	
	// default 는 앞에 접근제한자를 작성해주지 않으면 기본으로 적용이 됨
	void defaultMethed() {
		System.out.println("default Method() 호풀");
	}
	
	private void privateMethod() {
		System.out.println("private Method() 출력");
	}
}
