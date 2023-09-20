package com.kh.practice.exam;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		/*
		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요.
		ex.
		정수 : 4
		다시 입력하세요.
		정수 : -6
		다시 입력하세요.
		정수 : 5
		1, 2, 3, 2, 1
		*/
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("3이상인 홀수를 입력해주세요");
		int inputNum = sc.nextInt();
		int[] intArray = new int[inputNum];
		
		if (inputNum < 3 || inputNum%2 == 0) {
			System.out.println("다시 입력하세요");
		} else {
			// 배열의 총길이
			for (int i = 0; i < inputNum; i++) {

				if ( i < ((inputNum / 2) + 1)) {
					intArray[i] = num++;
					
					System.out.print(num);
				}
				else if (i >= ((inputNum / 2) + 1)) {
					intArray[i] = num--;
					
					System.out.print(num);
				}
			}
		}
	}
}
