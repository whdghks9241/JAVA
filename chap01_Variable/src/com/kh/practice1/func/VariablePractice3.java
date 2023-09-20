package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {

		/**
		 * 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		   계산 공식 ) 면적 : 가로 * 세로
	       둘레 : (가로 + 세로) * 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//가로길이, 세로길이
		double width, length;
		
		System.out.println("가로의 길이는 ? ");
		width = sc.nextDouble();

		System.out.println("세로의 길이는 ? ");
		length = sc.nextDouble();
		
		System.out.println("사각형의 면적은 " + (width * length) + " 입니다");
		System.out.println("사각형의 둘레는 " + ((width + length) * 2) + " 입니다");
	}
}



