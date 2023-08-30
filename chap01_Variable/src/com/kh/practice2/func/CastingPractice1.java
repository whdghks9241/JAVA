package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		// 키보드로 문자 하나를 입력 받아 그 문자의 숫자를 출력하세요
		char character;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요(A~Z/a~z)");
		character = sc.next().charAt(0);
		
		int changeIntcahr = character;
		System.out.println("입력문자 : " + character + " / unicode : " + changeIntcahr);
		
	}
}
