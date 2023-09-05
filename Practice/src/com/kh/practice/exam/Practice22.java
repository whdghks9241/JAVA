package com.kh.practice.exam;

public class Practice22 {

	public static void main(String[] args) {
	
		/**
		 	주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
			단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
			ex.
			주민등록번호(-포함) : 123456-1234567
			123456-1*****
		 */
		String jumin = "123456-1234567";
		
		// 2. 성별자리 이후 별표 만드는거 만들기
		String makester = "*";
		
		// 주민등록번호 성별자리 이후부터 *로 가리고 출력
		// to char Array를 사용해서 String -> char Array로 
		char[] juminStar = jumin.toCharArray();
	}
}
