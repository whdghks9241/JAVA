package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
//			int result = 10 / 0;
//		} catch (ArithmeticException e) {
//			/**
//			ArithmeticException 수학적인 계산 과정에서 발생한 오류
//			ArithmeticException e : e는 우리가 지정한 변수명
//			e로 지정한 변수로 메시지를 getMessage() 로 전달한다.
//			 */
//			System.out.println("산술 연산으로 인해 발생한 에러!! " + e.getMessage());
//
//		}	
		
		ExceptionMain em  = new ExceptionMain();
		em.Excepation3();
	}
	
	public void Exception1() {
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			
			System.out.println("산술 연산으로 인해 발생한 에러!! " + e.getMessage());

		}	
	}
	
	public void Exception2() {

		try {
			
			String text = null;
			
			int length = text.length();
			
			System.out.println("문자 길이 : " +  length);
		
		} catch (NullPointerException abc ) {
			System.out.println("값이 없어!! " + abc.getMessage());

		}	
		
	}
	
	public void Excepation3() {
		
		
		try {
			String junnNumber =  "오팔팔오";
			int num = Integer.parseInt(junnNumber); // 문자열 정수로변환시
		} catch (NumberFormatException a) { // 안에 String 있으면 반환
			System.out.println("숫자 입력 노!!!");
			
		} 
	
	}

}
