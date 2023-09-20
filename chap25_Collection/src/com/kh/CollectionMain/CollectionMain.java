package com.kh.CollectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List 
		List<String> myList = new ArrayList<>();
		myList.add("사과");
		myList.add("바나나");
		myList.add("딸기");
		
		System.out.println("List : ");
		// 향상된 for문 활용해서 출력
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(2); // 중복된 요소는 허용하지 않음
		
		for (Integer number : myset) {
			System.out.println(number);
		}
		
		// Map 예제
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("한국", 1);
		myMap.put("미국", 2);
		myMap.put("중국", 3);
		myMap.put("일본", 4);
		myMap.put("베트남", 5);
		myMap.put("태국", 6);
		myMap.put("러시아", 7);
		myMap.put("스페인", 8);
		myMap.put("독일", 9);
		myMap.put("이탈리아", 10);
		
		for (String country:myMap.keySet()) {
			int code = myMap.get(country);
			
			System.out.println(country + " : " + code);
		}
	}
}
