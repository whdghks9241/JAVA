package com.kh.pattern.mvc.View;

public class UserView {
	
	/*
	 *  정보를 화면에 출력
	 */
	public void displayInfo(String userName, int userAge) {
		System.out.println("유저 정보");
		System.out.println("이 름 : " + userName);
		System.out.println("나 이 : " + userAge);
	}

}
