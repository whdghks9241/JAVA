package com.kh.api.eaxm1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/**
 Date : 날짜와 시간 정보를 나타내는데 사용
 	java1.1 이후 권장되지 않음
 		java.time 패키지 LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
		//import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		LocalDateTime currentLDt = LocalDateTime.now();
		System.out.println("현재 날짜 시간 : " + currentLDt);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : " + futureDate);
		//minus plus 이용해서 각 2개씩 만들어보기 총 4개
		futureDate = today.minusMonths(8);
		System.out.println(" 날짜 : " + futureDate);
		futureDate = today.minusWeeks(1);
		System.out.println(" 날짜 : " + futureDate);
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3시간 후 시간 : " + laterTime);
		
		// 특정 날짜와 시간 생성하기
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		 LocalDate date2 = LocalDate.of(2023, 9, 20);
		/*
		 * LocalDate date2 = LocalDate.of(2023, 9, 13);
			date1.isBefore(date2)
			date1.isAfter(date2)
		 */
		if(date1.isBefore(date2)) {
			System.out.println(date1 + " 은 " + date2 + "이전입니다.");
		}else if (date1.isAfter(date2)) {
			System.out.println(date1 + " 은 " + date2 + "이후입니다.");
		} else {
			System.out.println(date1 + " 와 " + date2 + "는 같은 날짜 입니다.");
		}

	}
}
