package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	/**
	 - lotto : int[]
		// �ʱ�ȭ �� ���, 
		�ߺ����� �ʴ� 1~45������
		������� 6�� �ʱ�ȭ
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
		
		// array�� ���̸�ŭ �ݺ����� ������.
		for(int i = 0; i < arrayLotto.length; i++) {
		
			// ���� ���� 1~45
			arrayLotto[i] = rd.nextInt(45)+1;

			// �ߺ����� �ʰ� �����͸� �߰�
			// array�ȿ� �ߺ��� �����Ͱ� �ִ��� üũ
			for (int j = 0; j < i; j++) {

				if (arrayLotto[j] == arrayLotto[i]) {
					System.out.println("�ߺ�");
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
//			// while���� false �ϰ�� ����ȴ�.
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
////					// ���� array�ȿ� �ִ� ���ڿ� �������� ���ư� ���ڰ� �������� üũ
////					if (arrayLotto[j] == lottoNum) {
////						
////						// ��ȣ�� �Ȱ������ ��ȣüũ boolean���� �ٲ۴�
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
