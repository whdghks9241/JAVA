package com.kh.objExam;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {
	public static void main(String[] args) {
		
		PracticeMain4 p4 = new PracticeMain4();
	
		p4.practice1();
		p4.practice2();
		p4.practice3();
		p4.practice4();
	}

	public void practice1() {
//		Scanner sc = new Scanner(System.in);
		String name = "Hwan";
		int age = 31;
		String formatString = String.format("이름 : %s  나이 : %d", name, age);
		
		System.out.println(formatString);
	}

	public void practice2() {
		
		Date currentDate = new Date();
		SimpleDateFormat smDateFormate = new SimpleDateFormat("yyyy-MM-dd");
		
		String formatStr = String.format("현재 날짜 : %s", smDateFormate.format(currentDate));
		System.out.println(formatStr);
	} 
	
	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		
		// 숫자가 지정된 넓이보다 짧을 경우 앞에 0으로 채워주겠다.
		// 출력되는 숫자의 최소 너비 자리 5자리로 하고싶다
		// String 변수명 = String.format(숫자출력)`;
		String formatInt = String.format("숫자 1 : %d   숫자 2 : %d", num1, num2);
		System.out.println(formatInt);

	}

	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";

		// 10의 최소 너비 최소 10자리의 공간을 차지
		// 만약 문자열이  10자리보다 짧다면  왼쪽에 공백으로 채워짐
		// 만약 문자열이 -10자리보다 짧다면 오른쪽에 공백으로 채워짐
		// ' 따옴표로 둘러쌓여야함.
		String foramtStr = String.format("%-10s %10s", text1, text2);
		System.out.println(foramtStr);

	}
}
