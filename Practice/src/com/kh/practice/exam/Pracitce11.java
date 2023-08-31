package com.kh.practice.exam;

import java.util.Scanner;

public class Pracitce11 {
	public static void main(String[] args) {

		/**
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력해주세요");
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		} else if (num2 < num1) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println(num1);
		}

	}
}
