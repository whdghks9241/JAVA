package com.kh.practice.exam;

import java.util.Scanner;

public class Practice19 {

	public static void main(String[] args) {
		/*
			사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
			배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
			그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
			ex.
			정수 : 5
			배열 0번째 인덱스에 넣을 값 : 4
			배열 1번째 인덱스에 넣을 값 : -4
			배열 2번째 인덱스에 넣을 값 : 3
			배열 3번째 인덱스에 넣을 값 : -3
			배열 4번째 인덱스에 넣을 값 : 2
			4 -4 3 -3 2 
			총 합 : 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		intArray[0] = 4;
		intArray[1] = -4;
		intArray[2] = 3;
		intArray[3] = -3;
		intArray[4] = 2;
		
		int sum = 0;
		
		for (int i = 0; i <intArray.length; i++) {
			sum += intArray[i];
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
		System.out.println("총 합 : " + sum);
	}

}
