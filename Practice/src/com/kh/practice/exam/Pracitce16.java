package com.kh.practice.exam;

import java.util.Scanner;

public class Pracitce16 {
	public static void main(String[] args) {
		
		/**
		 * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
			단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		int num2= 0;
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			// 소수의 경우 1과 자기자신말고는 나누어 떨어지는 수가 없어야한다.
			for (int i = 1; i <= num; i++) {
				if ((num % i) == 0) {
					 num2 += 1;
				}
			}
			if (num2 >= 3) {
				System.out.println("소수가 아닙니다");
			} else {
				System.out.println("소수입니다");
			}
		}
	}
}