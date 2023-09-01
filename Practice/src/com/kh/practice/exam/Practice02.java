package com.kh.practice.exam;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		
		/**
		 * 문제 2
		   위 문제와 모든 것이 동일하나, 1미만의 숫자가 입력됐다면
		   "1 이상의 숫자를 입력해주세요" 가 출력되면서 다시 사용자가 값을 입력하도록 하세요. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("숫자를 입력해주세요");
			
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.println("숫자 : " + i);
				}
				isTrue = false;
				break;
			}
		}

	}
}
