package com.kh.practice.exam;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
	
		/**
		 * 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		   단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		   
		   소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		 */
		
		// 입력받기 위해 불러오는 메소드
		Scanner sc = new Scanner(System.in); 
		// 출력 메소드
		System.out.println("숫자를 입력해주세요"); 
		
		int num = sc.nextInt();
		int num2= 0;
		
		// 만약 입력한수가 2보다 작을 경우
		if (num < 2) { 
			System.out.println("잘못 입력하셨습니다.");
		// 만약 입력한수가 2보다 클 경우
		} else { 
			// 소수의 경우 1과 자기자신말고는 나누어 떨어지는 수가 없어야한다. -> 나머지가 0인 횟수가 2회.
			for (int i = 1; i <= num; i++) {
				// 입력한 숫자의 나머지값이 0일경우 
				if ((num % i) == 0) {
					 // 카운트를 한
					 num2 += 1;
				}
			}
			// 나머지가 0인 횟수가 3회 이상일경우 
			if (num2 >= 3) {
				System.out.println("소수가 아닙니다");
			} else {
				System.out.println("소수입니다");
			}
		}
	}
}
