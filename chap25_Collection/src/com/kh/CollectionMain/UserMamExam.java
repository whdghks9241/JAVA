package com.kh.CollectionMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UserMamExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HaspMap 생성 UserAge
		// 유저의 이름과 나이
		Map<String, Integer> userInfo = new HashMap<>();
		userInfo.put("전종환", 31);
		userInfo.put("김종환", 88);
		userInfo.put("박종환", 35);
		userInfo.put("최종환", 39);
		
		// 특정 유저 검색
		String userName = "김종환";
		if (userInfo.containsKey(userName)) {
			// 유저 정보해쉬맵에서 유저이름의 키를 가지고 있는 벨류를 가져온다
			int userAge = userInfo.get(userName);
			System.out.println(userName + " : " + userAge);
			System.out.println("");
		} else {
			System.out.println(userName + "의 나이를 찾을수 없습니다.");
			System.out.println("");
		}
		
		// 모든 유저 출력
		for (Entry<String, Integer> entry : userInfo.entrySet()) {
			userName = entry.getKey();
			int userAge = entry.getValue();
			System.out.println(userName + " : " + userAge);
		}
		
		// 유저의 나이 수정 
		String updateUserName = "김종환";
		int update = 29;
		userInfo.put(updateUserName, update);
		System.out.println(updateUserName + " 의 성적을 " + update + " 로 수정했습니다");
		System.out.println("");
		
		// 유저 탈퇴
		userInfo.remove(updateUserName);
		
		
		// 최종 유저 출력 
		// 모든 유저 출력
		for (Entry<String, Integer> entry : userInfo.entrySet()) {
			userName = entry.getKey();
			int userAge = entry.getValue();
			System.out.println(userName + " : " + userAge);
		}
	}

}
