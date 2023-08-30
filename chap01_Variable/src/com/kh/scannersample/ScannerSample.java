package com.kh.scannersample;
import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name, hobby, food, address;
		String phoneNumber;
		
//		System.out.println("나이를 입력 해주세요.");
//		int age = sc.nextInt(); // 정수형만 받는 next
//
//		System.out.println("내 나이는 " + age + " 세 입니다.");
//				
//		System.out.print("당신의 이름을 입력하세요 : ");
//		name = sc.next();
//		System.out.print("당신의 전화번호를 입력하세요 : ");
//		phoneNumber = sc.next(); // -넣지 않기
//		
//		
//		System.out.println("당신의 이름은 " + name + " 입니다");
//		System.out.println("당신의 전화번호는 " + phoneNumber + " 입니다");
//		
		
		
		// 내 취미와 내가 좋아하는 음식과 내 주소 출력하기
		System.out.println("당신의 취미를 입력하세요");
		hobby = sc.next();
		System.out.println("당신이 좋아하는 음식을 입력하세요");
		food = sc.next();
		System.out.println("당신의 주소를 입력하세요");
		sc.nextLine(); // sc.nextLine() 하기 전, sc.nextLine() 을 한번 더 작성하여 입력버퍼를 비워준다.
		address = sc.nextLine(); // 엔터치기 전까지 출력
		
		System.out.println("당신의 취미는 " + hobby + " 입니다");
		System.out.println("당신이 좋아하는 음식은 " + food + " 입니다");
		System.out.println("당신의 주소는 " + address + " 입니다");
	}
}
