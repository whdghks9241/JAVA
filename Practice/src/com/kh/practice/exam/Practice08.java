package com.kh.practice.exam;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		
		/**
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		   단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		
		if (num >= 10) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else if (num >= 1 && num < 10) {
			for (int i = num; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println( i + " * " + j + " = " + (i * j));
				}
			}
		}
	}

}
