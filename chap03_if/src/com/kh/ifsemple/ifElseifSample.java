package com.kh.ifsemple;

public class ifElseifSample {

	public static void main(String[] args) {
		
		// if-else if
		/*
		 여러 개의 조건을 연속적으로 평가
		 그 중 첫 번째 참인 조건에 해당하는 코드 블록을 실행하는 구조
		 만약 if나 else if 의 조건도 참이 아니라면 마지막 else 블록 실행
		
		 if (조건1) {
		 	// 조건1이 참일 때 실행되는 코드
		 } else if (조건2) {
		 	// 조건2가 참일 때 실행되는 코드
		 } else {
		 	// 위의 모든 조건이 거짓일 때 실행되는 코드
		 }
		 */
		
		int age = 23;
		
		if (age == 20) {
			System.out.println("해외여행 갈래");
		} else if (age >= 20) {
			System.out.println("세계여행 갈래");
		} else {
			System.out.println("집에 있을래");
		}
		
		// int score = 85;
		/**
		 * 만약에 90점이 넘으면 A
		 * 90점 이면 B+
		 * 90점보다 미만이면 B
		 */
		int score = 85;

		// 만약에 90점이 넘으면 A
		if (score > 90) {
			System.out.println("A");
		// 90점 이면 B+
		} else if (score == 90) {
			System.out.println("B+");
		// 90점보다 미만이면 B	
		} else if (score < 90) {
			System.out.println("B");
		}
		
		
		int hour = 15;
		
		// 만약 시간이 12시 이전이면
		if (hour < 12) {
			System.out.println("좋은 아침입니다");
		// 만약 시간이 18시 이전이면
		} else if (hour < 18) {
			System.out.println("열심히 코딩합시다");
		// 시간이 18시 이후 일 경우
		} else {
			System.out.println("수고하셨습니다.");
		}
		
		
		int temp = 28;
		// 온도가 30도 초과일경우
		if (temp > 30) {
			System.out.println("더운 날씨입니다.");
		// 온도가 21~30도 사이일경우
		} else if (temp > 20) {
			System.out.println("적당한 날씨 입니다.");
		// 온도가 20도 이하일경우
		} else {
			System.out.println("쌀쌀한 날씨 입니다.");
		}
		
		
		int number = -5;
		
		// 0보다 클때 true
		if (number > 0) {
			System.out.println("양수입니다.");
		// 0보다 작을 때 true
		} else if (number < 0) {
			System.out.println("음수입니다.");
		// 0일 때
		} else {
			System.out.println("0 입니다");
		}
	
	
		
		/*
		 int myAge = 15; 나의 나이가 15살 일 때
		 청소년인지 어린이인지 성인인지 출력하기 
		 (조건 중첩이 빠져있음)
		 */
		int myAge = 15;
		// 나의 나이가 14 ~ 20살
		if (myAge >= 14 && myAge <= 20 ) {
			System.out.println("청소년 입니다");
		// 나의 나이가 21살 이상일 경우 성인	
		} else if (myAge > 20) {
			System.out.println("성인 입니다");
		// 14살 미만일 경우 전부 다 어린이
		} else {
			System.out.println("어린이 입니다");
		}
		
		/* 다른방식 1. */
		// 나의 나이가 15살 일경우
		if (myAge <= 20 ) {
			System.out.println("청소년 입니다");
		// 나의 나이가 21살보다 많을경우	
		} else if (myAge > 20) {
			System.out.println("성인 입니다");
			// 14살 이하일 경우 전부 다 어린이
		} else {
			System.out.println("어린이 입니다");
		}
		
		
		// 계절 출력하기
		int month = 8;
		// 1월 2월 12월 일경우
		if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울");
		// 3~5월 일 경우
		} else if (month >= 3 && month <= 5) {
			System.out.println("봄");
		// 6~8월 일 경우
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		// 그외의 달일경우
		} else { 
			System.out.println("가을");
		}
	
	}
}
