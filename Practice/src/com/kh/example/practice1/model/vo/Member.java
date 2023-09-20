package com.kh.example.practice1.model.vo;

public class Member {
	/**
	 * 맴버변수 
 	- grade : int
	- classroom : int
	- name : String
	- height : double
	- gender : char
	
	 * 생성자
	+ Student()
	+ information() : void
	 */
	String memberId, memberPwd, memberName, phone, email;
	
	int age;
	
	char gender;
	
	public Member() {
	}
	
	public void changeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		System.out.println("memberName : " + memberName);
	}
}
