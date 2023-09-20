package com.kh.practice.exam;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		/**
		 * 다음과 같은 실행 예제를 구현하세요.
			ex.
			정수 입력 : 3 
			*
			**
			***
			** 
			*
		 */
		
		//중간을 기준으로 위/ 아래 나눠 이중 for문을 작성한
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for (int k = num-1; k >= 1; k--) {
			for (int l= 1; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
