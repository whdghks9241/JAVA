package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		
		String eString;
		// 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		// 1번
		System.out.println("영어 문자열을 입력해주세요");
		eString = sc.next();
		
		System.out.println("문자열의 첫 단어는 " + eString.charAt(0)  + " 입니다");
		System.out.println("문자열의 두번째 단어는 " + eString.charAt(1)  + " 입니다");
		System.out.println("문자열의 세번째 단어는 " + eString.charAt(2)  + " 입니다");

		
		// 2번
		System.out.println("영어 문자열을 입력해주세요");
		eString = sc.next();

		System.out.println("문자열의 첫 단어는 " + eString.substring(0,1) + " 입니다");
		System.out.println("문자열의 두번째 단어는 " + eString.substring(1,2) + " 입니다");
		System.out.println("문자열의 세번째 단어는 " + eString.substring(2,3) + " 입니다");
		
	}
}