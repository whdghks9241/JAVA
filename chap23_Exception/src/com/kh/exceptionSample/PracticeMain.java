package com.kh.exceptionSample;

public class PracticeMain {
	
	public static void main(String[] args) {
		
		PracticeMain pm = new PracticeMain();
//		pm.ArithException();
//		pm.NPException();
//		pm.NumFormatException();
		pm.ExceptionExam();
		
	}
	public void ArithException() {
		// int dividend / divisor 나누었을 때 예외처리
		int dividend = 100;
		int divisor = 0;
		
		try {
			int result = dividend / divisor;
			System.out.println(result);
		} catch(ArithmeticException e) {
			
			System.out.println("산술 연산으로 인해 발생한 에러!! " + e.getMessage());
		}
	}

	public void NPException() {

		String text = "Hello World";
		String subText = null;
		
		try {
			// indexOf subText 에 있는 null 값을 포함한 문자열 검색
			
			int length = text.indexOf(subText);
			System.out.println(length);
		} catch(NullPointerException s) {
			System.out.println("문자길이 체크 " + s.getMessage());
		}
	}
	
	public void NumFormatException() {

		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(number);
		} catch(NumberFormatException s) {
			System.out.println("문제문제 " + s.getMessage());
		}
	
	}

	public void ExceptionExam() {
		
		try {
			int[] numbers = {1,2,3,4,5};
			int index = 7;
			int result = numbers[index];
			System.out.println(result);
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열 인덱스 범위를 벗어나 예외가 발생!!! " + e.getMessage());
		} catch(Exception e) {

			System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생" + e.getMessage());
		} finally {
			System.out.println("finally 동장!");
		}
		System.out.println("프로그램이 종료 되었습니다,");
	}
}
