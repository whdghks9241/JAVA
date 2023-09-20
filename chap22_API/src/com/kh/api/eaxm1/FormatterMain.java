package com.kh.api.eaxm1;

public class FormatterMain {

	/**
	 	Formatter : 문자열을 형식화 하는데 사용되는 클래스
	 	텍스트 출력을 원하는 형식에 맞게 포맷팅하고 싶을 때 유용하게 사용
	 	
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Hwan";
		
		int age = 31;
		
		double salary = 50000.56;
		
		// Formatter 사용하여 문자열을 형식화 
		// 월급 : %.2f = 소수점 2자리까지 나타낸다는 의미
		String formatString = String.format("이름 : %s, 나이 : %d 월급 : %.2f", name, age, salary);
		
		// 형식화된 문자열 출력
		System.out.println(formatString);
	}
}
