package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
	public static void main(String[] args) {
		
		 ListArray1();
		
		 ListAndArray ListAndArray = new ListAndArray();
		 ListAndArray.ListArray2();
	}
	
	public static void ListArray1() {
		// Array 에제
		int[] intArray = new int[2];

		intArray[0] = 1;
		intArray[1] = 2;

		System.out.println("Array 요소 : ");
		for (int a = 0; a < intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
		
		System.out.println("");
		
		// List 예제
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		System.out.println(" List 요소 : ");
		for (int num : intList) {
			System.out.println(num + " ");

		}
	}
	
	public void ListArray2() {
		// String으로 변경 후 Array와 list 로 출력
		
		String[] strArray = new String[2];
		strArray[0] = "안녕안녕";
		strArray[1] = "안녕못해";

	
		System.out.println("Array 요소 : ");
		for (int a = 0; a < strArray.length; a++) {
			System.out.println(strArray[a] + " ");
		}
		System.out.println();
		
		List<String> strList = new ArrayList<>();
		strList.add("안녕안녕");
		strList.add("안녕못해");
		strList.add("왜안녕못해?");
		strList.add("그냥안녕못해");
		
		System.out.println(" List 요소 : ");
		for(String str : strList) {
			System.out.println(str + " ");
		}
	}
}
