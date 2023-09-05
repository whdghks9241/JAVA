package com.kh.example.practice5.model.vo;

import java.util.Arrays;
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

				if (arrayLotto[i] == arrayLotto[j]) {
					i--;
					break;
		
				}
			}
		}
		
		System.out.print(Arrays.toString(arrayLotto));
		
	}
}
