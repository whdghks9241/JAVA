package com.kh.example.practice1.model.vo;

public class Member {

	String memberId, memberPwd, memberName, phone, email;
	
	int age;
	
	char gender;
	
	public Member() {
	}
	
	public void changeName(String name) {
		memberName = name;
	}
	
	public void printName() {
		System.out.println("memberName : " + memberName);
	}
}
