package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public static void main(String[] args) {
		/**
		 * 		이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		 */
		String name, gender;
		int age;
		double stature;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용자의 이름을 입력해주세요.");
		name = sc.next();
		
		System.out.println("사용자의 성별을 입력해주세요(남/여)");
		gender = sc.next();
		
		System.out.println("사용자의 나이를 입력해주세요.");
		age = sc.nextInt();
		
		System.out.println("사용자의 키를 입력해주세요(cm)");
		stature = sc.nextDouble();
		

		System.out.println("키 " + stature + "cm인 " + age + "살 " + gender + " " + name +"님");
	}	
}
