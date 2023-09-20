package com.kh.arrayListSample;

import java.util.ArrayList;
/**
 * 	toDoSample.java
 * ArrayList 이용해서 할일 
 * 만들고  (3개)
 * 수정하고  (2개)
 * 지우고 (1개)
 * 전부다 삭제 하기
 */
public class ArrayListSample {

	public static void main(String[] agrs) {
		
		// 빈 ArrayList 생성
		ArrayList<String> fruits = new ArrayList<String>();
		
		System.out.println("fruits : " + fruits);
		
		// 요소 추가
		fruits.add("사과");
		System.out.println("사과 추가 : " + fruits);
		
		fruits.add("바나나");
		fruits.add("키위");
		fruits.add("복숭아");
		fruits.add("멜론");
		fruits.add("배");
		fruits.add("딸기");

		System.out.println("fruits : " + fruits);
		
		String firstFruits = fruits.get(0);
		System.out.println("첫번째 과일 : " + firstFruits);	
		
		fruits.set(2,"망고");
		System.out.println("fruits : " + fruits);
		
		System.out.println(fruits.remove(5));	

		System.out.println("과일 삭제 : " + fruits);	
		System.out.println("");	
		System.out.println("===========================================");
		System.out.println("");	
		
		// 방법 1
		for (String fruit : fruits) {
			System.out.println("과일 목록 " + fruit);
		}
		
		// 방법 2
		for (int i = 0; i < fruits.size(); i ++) {
			System.out.println("과일 목록 " + i + " : " + fruits.get(i));
		}
		

	}
}
