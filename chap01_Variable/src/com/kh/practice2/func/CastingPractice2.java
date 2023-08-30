package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		// 실수형(소수점)으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		// 이 때 총점과 평균은 정수형으로 처리하세요.
		
		double korean, english, math;
		int averageScore, totalScore;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력해주세요");
		korean = sc.nextDouble();
		
		System.out.println("영어점수는 입력해주세요");
		english = sc.nextDouble();
		
		System.out.println("수학점수는 입력해주세요");
		math = sc.nextDouble();
		
		averageScore = (int) (korean + english + math);
		totalScore = (averageScore/3);
		System.out.println("국어점수는 " + korean + " 입니다.");
		System.out.println("영어점수는 " + english + " 입니다.");
		System.out.println("수학점수는 " + math + " 입니다.");
		System.out.println("총점은 " + averageScore + " 입니다.");
		System.out.println("평균점수는 " + totalScore + " 입니다.");
	}
}
