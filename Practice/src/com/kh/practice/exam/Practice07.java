package com.kh.practice.exam;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		/**
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}
