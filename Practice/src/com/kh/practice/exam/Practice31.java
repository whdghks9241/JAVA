package com.kh.practice.exam;

import java.util.Arrays;
import java.util.Random;

public class Practice31 {

	private int[] lotto = new int[6];
	
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}


	public void information() {
		
		Random rd = new Random();
		
		// array의 길이만큼 반복문을 돌린다.
		for(int i = 0; i < lotto.length; i++) {
		
			// 난수 생성 1~45
			lotto[i] = rd.nextInt(45)+1;

			// 중복되지 않게 데이터를 추가
			// array안에 중복된 데이터가 있는지 체크
			for (int j = 0; j < i; j++) {

				if (lotto[i] == lotto[j]) {
					i--;
					break;
		
				}
			}
		}
		
		System.out.print(Arrays.toString(lotto));
		
	}
	
}
