package com.kh.practice.exam;

import java.util.Scanner;

public class Practice17 {
	public static void main(String[] args) {
	
		/**
		 	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
			1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("정수를 입력해주세요");
		// 입력받는 정수
		int inputNum = sc.nextInt();
		
		// array의 길이는 입력받은 정수만큼의 길이
		int[] intArray = new int[inputNum];
		
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		for (int i = 0; i < inputNum; i++) {
			intArray[i] = i+1;
			
			System.out.print(i+1 + " ");
		}
		
	}
}
