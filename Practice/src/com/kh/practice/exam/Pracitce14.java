package com.kh.practice.exam;

import java.util.Scanner;

public class Pracitce14 {

	public static void main(String[] args) {
	
		/**
		 * 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		   단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		   
		   소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
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
