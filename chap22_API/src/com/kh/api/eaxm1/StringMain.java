package com.kh.api.eaxm1;

public class StringMain {

	public static void main(String[] args) {

		String greeting = "Hello, Word";
		// 만약에 문자열이 같을 떄 나올 문구
		if (greeting == "Hello, Word"){
			System.out.println("똑같당");
		}
		
		// 문자열 연결
		String name = "Alice";
		String msg = "Hello, ";
		System.out.println(msg + name);
	}
}
