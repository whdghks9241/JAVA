package com.kh.practice.exam;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		/**
		 * 다음과 같은 실행 예제를 구현하세요.
				ex.
				정수 입력 : 5
				*****
				*   *
				*   *
				*   *
				*****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++ ) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || i == num) {
					System.out.print("*");
				} else {
					if (j ==1 || j == num) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			} 

			System.out.println("");
		}
	}
}
