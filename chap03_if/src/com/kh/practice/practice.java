package com.kh.practice;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("실습문제를 선택해주세요");
			System.out.print("1. practice1		");
			System.out.print("2. practice2		");
			System.out.print("3. practice3		");
			System.out.println("4. practice4		");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				practice1();
				break;
			case 2 :
				practice2();
				break;
			case 3 :
				practice3();
				break;
			case 4 :
				practice4();
				break;
			default :
				System.out.println("다시 입력해주세요");
				break;
			}
		}
		
	}

	public static void practice1() {
		/**
		    아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
			종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
			ex.
			1. 입력
			2. 수정
			3. 조회
			4. 삭제
			7. 종료
			메뉴 번호를 입력하세요 : 3
			조회 메뉴입니다
		 */
	
		int choice;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("메뉴를 선택해 주세요");
		System.out.print("1. 입력		");
		System.out.print("2. 수정		");
		System.out.print("3. 조회		");
		System.out.print("4. 삭제		");
		System.out.println("7. 종료	");
		
		choice = sc.nextInt();
		
		// 1. if문
		if (choice == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (choice == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (choice == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (choice == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (choice == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}
		
		// 2. switch
		switch(choice) {
			case 1 :
				System.out.println("입력 메뉴입니다.");
				break;
			case 2 :
				System.out.println("수정 메뉴입니다.");
				break;
			case 3 :
				System.out.println("조회 메뉴입니다");
				break;
			case 4 :
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7 :
				System.out.println("프로그램이 종료됩니다.");
				break;
		}
	}
	
	
	public static void practice2() {
		/**
		 	키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
			짝수가 아니면 “홀수다“를 출력하세요.
			양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		 */
		int insertNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력해주세요");
		insertNumber = sc.nextInt();
		
		if (insertNumber <= 0) {
			System.out.println("양수만 입력해주세요");
		} else if ((insertNumber % 2) == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}
	
	
	public static void practice3() {
		
		int koranScore, mathScore, englishScore, totalScore;
		
		double averageScore;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력해주세요");
		koranScore = sc.nextInt();
		System.out.println("수학점수를 입력해주세요");
		mathScore = sc.nextInt();
		System.out.println("영어점수를 입력해주세요");
		englishScore = sc.nextInt();
		
		totalScore = koranScore + mathScore + englishScore;
		averageScore = totalScore / 3;
		if (averageScore < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("국어 : " + koranScore);
			System.out.println("수학 : " + mathScore);
			System.out.println("영어 : " + englishScore);
			System.out.println("합계 : " + totalScore);
			System.out.println("평균 : " + averageScore);
			System.out.println("축하합니다, 합격입니다!");
			
		}		
	}
	
	
	public static void practice4() {
		// 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요
		int month;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 12 사이의 정수를 입력해주세요");
		month = sc.nextInt();
		
		switch(month) {
			case 1 : case 2 : case 12 :
				System.out.println(month + "월은 겨울 입니다");
				break;
			case 3 : case 4 : case 5 :
				System.out.println(month + "월은 봄 입니다");
				break;
			case 6 : case 7 : case 8 :
				System.out.println(month + "월은 여름 입니다");
				break;
			case 9 : case 10 : case 11 :
				System.out.println(month + "월은 가을 입니다");
				break;
		}
	}
	
}
