package com.kh.practice.exam;

import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		/**
		 * 다음과 같은 실행 예제를 구현하세요.
			ex.
			정수 입력 : 4 
				*
			   *** 
			  ****** 
			 ********
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++ ) {
			for (int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
