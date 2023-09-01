package com.kh.practice.exam;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		/**
		 * 1부터 사용자에게 입력 받은 수까지 중에서
			1) 2와 3의 배수를 모두 출력하고
			2) 2와 3의 공배수의 개수를 출력하세요.
			* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때 모두 나머지가 0이 나오는 수
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		
		int num = sc.nextInt();
		int count = 0;
		for (int i=2; i<=num; i++) {
			if ((i % 2) == 0 || (i % 3) == 0) {
				System.out.print(i + " ");
				if ((i % 6) == 0) {
					count ++;
				}
			} 
		}
		
		System.out.print("count : "  + count);	
	}

}
