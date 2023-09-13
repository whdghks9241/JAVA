package com.kh.api.eaxm1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calendar 클래스를 사용한 현재 날짜와 시간 가져오기
		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);

		System.out.println("calendar 클래스를 사용한 현재 날짜와 시간");
		System.out.println(year +"년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		
		// GregorianCalendar 클래스를 활용한 현재 날짜와 시간 가져오기
		GregorianCalendar gCalendar = new GregorianCalendar();
		
		year = gCalendar.get(Calendar.YEAR);
		month = gCalendar.get(Calendar.MONTH) + 1;
		day = gCalendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년 " + month + "월 " + day);
	}

}
