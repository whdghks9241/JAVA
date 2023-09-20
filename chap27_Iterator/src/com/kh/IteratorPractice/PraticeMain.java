package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PraticeMain {

	public static void main(String[] args) {
		//AarayLsit 생성 및 요소 추가
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("사과");
		fruit.add("바나나");
		fruit.add("딸기");
		//Iterator 생성
		Iterator<String> iter = fruit.iterator();
		
		//Iterator를 사용하여 요소 반복
		while (iter.hasNext()) {
			String f = iter.next();
			System.out.println(f);
		}
		
		//요소 삭제
		
		//ArrayList 출력하기

	}

}