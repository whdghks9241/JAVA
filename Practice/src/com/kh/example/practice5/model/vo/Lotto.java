package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	/**
	 - lotto : int[]
		// 초기화 블럭 사용, 
		중복하지 않는 1~45까지의
		난수들로 6개 초기화
		+ Lotto()
		+ information() : void
	 */
	boolean numCheck = false;
	
	int[] arrayLotto = new int[6];

	Random rd = new Random();
	
	int lottoNum , checkNum;
	
	
	public Lotto() {

	}
	
	public void information() {
		
		// array의 길이만큼 반복문을 돌린다.
		for(int i = 0; i < arrayLotto.length; i++) {
		
			// 난수 생성 1~45
			arrayLotto[i] = rd.nextInt(45)+1;

			// 중복되지 않게 데이터를 추가
			// array안에 중복된 데이터가 있는지 체크
			for (int j = 0; j < i; j++) {

				if (arrayLotto[j] == arrayLotto[i]) {
					System.out.println("중복");
					j--;
				}
			}
			lottoNum = arrayLotto[i];
			System.out.println(" " + lottoNum);
		}
		
//		for(int i = 0; i < arrayLotto.length; i++) {
//			
//			lottoNum = rd.nextInt(45)+1;
//			
//			// while문은 false 일경우 종료된다.
//			while(!numCheck) {
//				
//				for (int j = 0; j <= i; j++) {
//				
//					if (arrayLotto[j] == lottoNum) {
//						
//
//						System.out.println(lottoNum);
//						
//						
//						numCheck = true;
//						
//					}
//				}	
//				break;
////					// 만약 array안에 있는 숫자와 랜덤으로 돌아간 숫자가 동일한지 체크
////					if (arrayLotto[j] == lottoNum) {
////						
////						// 번호가 똑같을경우 번호체크 boolean값을 바꾼다
////						numCheck = true;
////						return;
////					}
////
////				}
//			}
////
//			if (numCheck == false) {
//				arrayLotto[i] = lottoNum;
//
//			}
//			numCheck = false;
////			
////		
////			
//			System.out.println(" 		" + lottoNum);
//		}
		
		
	}
}
