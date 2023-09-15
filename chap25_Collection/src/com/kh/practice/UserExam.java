package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {
	public static void main(String[] args) {
		// Map 이름 나이
		Map<String, Integer> userInfo = new HashMap<>();

		userInfo.put("전종환", 31);
		userInfo.put("전XX", 29);
		userInfo.put("전EE", 27);
		userInfo.put("전RR", 19);
		
		
		// 검색할 이름
		String userName = "전RR";
		if (userInfo.containsKey(userName)) {
			int userAge = userInfo.get(userName);
			
			System.out.println(userName + " : " + userAge);
			System.out.println("");
		} else {
			System.out.println(userName + " 의 나이를 찾을수 없습니다.");
		}
	}
}
