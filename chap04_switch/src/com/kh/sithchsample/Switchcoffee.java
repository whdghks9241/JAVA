package com.kh.sithchsample;

import java.util.Scanner;

public class Switchcoffee {
	public static void main(String[] args) {
		// while 문을 활용한 switch
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		boolean isChoice = false;
		
		while(!isChoice) { // 조건이 참인 동안 코드 블록을 반복적으로 실행
			System.out.println("커피주문 해주세요");
			System.out.println("1. 아메리카노	2. 카페라떼	3.홍차");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					System.out.println("아메리카노 주문");
					isChoice = true;
					break;
				case 2 :
					System.out.println("카페라떼 주문");
					isChoice = true;
					break;
				case 3 :
					System.out.println("홍차 주문");
					isChoice = true;
					break;
				default :
					System.out.println("잘못된 주문입니다. 다시 주문해주세요.");
			}
		}
	}
}
