package com.kh.sithchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean ischoice = false;

		while (!ischoice) { // 초기 상태가 false - while은 참일 떄 종료
			// Scanner를 이용해서 과자를 선택하는 switch를 만들기
			System.out.println("원하는 과자를 선택해주세요");
			System.out.print("1. 새우깡	");
			System.out.print("2. 칸쵸	");
			System.out.println("3. 에이스	");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("새우깡을 선택하셨습니다.");
				ischoice = true;
				break;
			case 2 :
				System.out.println("칸쵸를 선택하셨습니다");
				ischoice = true;
				break;
			case 3 :
				System.out.println("에이스를 선택하셨습니다");
				ischoice = true;
				break;
			default :
				System.out.println("잘못된 선택입니다. 다시 선택해주세요");

			}
		}

		
//		System.out.println("과일을 선택해주세요");
//	
//		System.out.print("1. 사과		");
//		System.out.println("2. 포도	");
//		int fruit = sc.nextInt();
//		switch(fruit) {
//			case 1 :
//				System.out.println("사과");
//				break;
//			case 2 :
//				System.out.println("포도");
//				break;
//			default : 
//				System.out.println("잘못된 선택입니다");
//		}
//		
		
		
//		System.out.println("주문하실 번호를 선택해 주세요.");
//		System.out.print("1. 아메리카노	");
//		System.out.print("2. 흑당버블티	");
//		System.out.print("3. 카페라떼	");
//		System.out.println("4. 아인슈페너");
//		int choice = sc.nextInt();
//		
//		switch(choice) {
//			case 1:
//				System.out.println("아메리카노를 주문하셨습니다");
//				break;
//			case 2:
//				System.out.println("흑당버블티를 주문하셨습니다");
//				break;
//			case 3:
//				System.out.println("카페라떼를 주문하셨습니다");
//				break;
//			case 4:
//				System.out.println("아인슈페너를 주문하셨습니다");
//				break;
//			default :
//				System.out.println("잘못된 선택입니다. 다시 주문해주세요");
//		}
		
	}
}
