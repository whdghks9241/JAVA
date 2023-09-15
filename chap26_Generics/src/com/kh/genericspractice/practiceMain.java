package com.kh.genericspractice;

import java.util.ArrayList;
import java.util.List;

public class practiceMain {

	public static void main(String[] args) {
		// String Integer t 사용해서 출력
		practiceMain pm = new practiceMain();
//		pm.practice1();
		pm.practice2();
	}
	
	public void practice1() {

		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("라라라라라라");
		strList.add("에헤헤헤헤헤헤");
		strList.add("이히히히히히히히");
		strList.add("어허허호호호호호호");
		
		printList(intList);
		printList(strList);
	}
	
	public static <t> void printList(ArrayList<t> list) {
		for (t item : list) {
			System.out.println(item);
		}
	}
	
	public void practice2() {
		
		ArrayList<Object> list = new ArrayList<>();
		
		// Box 객체를 생성
		// 문자열 데이터를 저장하는 BOX 인스턴스 생성
		// 각 각 출력
		items<String> stritem  = new items<>();
		stritem.put("아이템 1번", list);
		stritem.put("아이템 2번", list);
		stritem.put("아이템 3번", list);
		
		String strValue = stritem.get();
		System.out.println("String Value  :  " + strValue);

		// 중수형 데이터를 저장하는 BOX 인스턴스 생성
		items<Integer> intitem = new items<>();
		intitem.put(1, list);
		intitem.put(3, list);
		intitem.put(5, list);
		intitem.put(7, list);
		intitem.put(19, list);
		
		int intValue = intitem.get();
		System.out.println("Int Value  :  " + intValue);

		// 향상된 for문 이용해서 값 모두 출력
		// 각 각 출력
	
		for (int i = 0; i < list.size(); i++) {
			System.out.println("str  :  " + list.get(i));

		}
		
		for (Object asd : list) {
			System.out.println(asd);
		}
	}
	
	
}
