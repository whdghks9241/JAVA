package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeCollection pc = new PracticeCollection();

		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
	}
	
	public void practiceList() {
		List<String> pList = new ArrayList<>(); 
		// String add 해보고 포문 출력
		pList.add("배가");
		pList.add("많이");
		pList.add("고프다");
		pList.add("고프다");
		
		for (String str : pList) {
			System.out.println(str);
		}
		
	}
	
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		// String add 해보고 포문 출력 중복된 값 add 해야함
		pSet.add("");
		pSet.add("배가");
		pSet.add("정말");
		pSet.add("고프다");
		pSet.add("배고파");
		pSet.add("배고파");
		pSet.add("배고파");
		
		for (String str : pSet) {
			System.out.println(str);
		}
	}

	public void practiceMap() {
		// 키와 값을 이용해서 map put 한다음 향상된 포문으로 출력해보기
		
		// 맵 객체화 선언
		Map<String , String> myMap = new HashMap<>();
		
		myMap.put("전종환", "국어");
		myMap.put("전종환1", "수학");
		myMap.put("전종환3", "미술");
		
		for (String name:myMap.keySet()) {
			String code = myMap.get(name);
			
			System.out.println(name + " , " + code);
		}
	}
}