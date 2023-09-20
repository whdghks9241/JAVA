package com.kh.genericsMain;

import java.util.ArrayList;

public class GenericsMain {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 ArrayList
		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("배고파");
		strList.add("배가");
		strList.add("고파요");

		printList(intList);
		printList(strList);
		
	}
	
	public static <t> void printList(ArrayList<t> list) {
		for (t item : list) {
			System.out.println(item);
		}
	}
}
