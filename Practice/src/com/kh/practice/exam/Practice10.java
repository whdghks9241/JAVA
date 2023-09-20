package com.kh.practice.exam;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while (isTrue) {
			
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
					 isTrue = false;
				} else {
					System.out.println("소수입니다");
					 isTrue = false;
				}
			}
		}
	}
}
