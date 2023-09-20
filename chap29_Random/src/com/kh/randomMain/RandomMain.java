package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
 Random : 난수를 생성하기 위해 사용되는 클래스
 	난수 : 무작위로 만들어진 수
 * */
public class RandomMain {

	public static void main(String[] args) {
		// 로또 번호 생성기
		RandomMain rm = new RandomMain();
		//rm.AA();
		rm.Lotto();
		//rm.RandomExam();
	}
	public void AA() {
		Random rd = new Random();
		int ranNumber = rd.nextInt(45);
		System.out.println(ranNumber);
		int addnum = ranNumber + 1;
		System.out.println(addnum);
	}
	public void Lotto() {
		
		// 랜덤 객체 생성
		Random rd = new Random();
		
		List<Integer> lottoNum = new ArrayList<>();//중복을 피하기 위해 set을 사용할 수 있음

		int six = 6; //로또 번호 몇 개 뽑을 것 인지 설정
		while(lottoNum.size() < six) { //0,1,2,3,4,5
			int ranNumber = rd.nextInt(45)+1; //0~44 자리의 랜덤으로 번호 아나
			System.out.println(ranNumber);
			
			//lottoNum.add(ranNumber);
			// 중복된 값이 list에 저장될 수 있음
			if(!lottoNum.contains(ranNumber)) {
			//!가 사라지면 값이 존재할 때만 list에 저장되는 것이기 때문에 무한루프
				lottoNum.add(ranNumber);
			}
				
		}
		System.out.println(lottoNum);
		System.out.println("============");
		
	}
	
	
	public void RandomExam() {
		Random rd = new Random();// 랜덤 객체 생성
		
		//1. 정수 범위 내에서 랜덤인 난수를 만들어야 겠다.
		int ranInt = rd.nextInt(100); //0~99 사이에서 1개
		System.out.println(ranInt);
		
		//2. 실수 범위 내에서 랜덤인 난수를 만들어야 겠다.
		double ranD = rd.nextDouble(); //0.0 ~1.0
		System.out.println(ranD);
		
		//3. 불리언 값 랜덤으로 생성
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}

}