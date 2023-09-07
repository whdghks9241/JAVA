package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {
	/**
	 * 	toDoSample.java
	 * ArrayList 이용해서 할일 
	 * 만들고  (3개)
	 * 수정하고  (2개)
	 * 지우고 (1개)
	 * 전부다 삭제 하기
	 */
	public static void main(String[] args) {
		
		ArrayList<String> workingList = new ArrayList<String>();

		workingList.add("일어나기");
		workingList.add("코딩하기");
		workingList.add("밥먹기");
		
		System.out.println("할일 추가 : " + workingList);

		workingList.set(1, "게임하기");
		workingList.set(2, "산책하기");
		
		System.out.println("할일 수정 : " + workingList);
		
		workingList.remove(2);
		
		System.out.println("할일 삭제 : " + workingList);
		
		
		for (String work : workingList) {
			System.out.println("할일 목록 : " + work);
		}
		

		workingList.clear();
		
		System.out.println("할일 초기화 : " + workingList);
	}
}
