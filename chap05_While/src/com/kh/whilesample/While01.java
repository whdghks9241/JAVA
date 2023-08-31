package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;

		
		while(isTrue) { // isTrue = true 이기 때문에 true 대신 isTrue 사용
			System.out.println("커피를 주문해주세요. 		1. 아메리카노	2. 카페라떼	3. 아이스초코");
			int choice = sc.nextInt(); // while 안으로 이동
			
			switch(choice) {
				case 1 :
					System.out.println("아메리카노 주문!");
					isTrue = false; // 아메리카노 주문을 받았으니 while문을 종료하기위해 boolean 값을 false로 변경한다.
					break;
				case 2 :
					System.out.println("카페라떼 주문!");
					isTrue = false;
					break;
				case 3 :
					System.out.println("아이스초코 주문!");
					isTrue = false;
					break;
				default :
					System.out.println("님 주문 잘못함");
			}
		}
	}
}
