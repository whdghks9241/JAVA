package com.kh.example.practice1.run;

import java.util.Scanner;

import com.kh.example.practice1.model.vo.Member;

public class MemberRun {
	public static void main(String[] agrs) {
		
		/**
		 	- grade : int
			- classroom : int
			- name : String
			- height : double
			- gender : char
			+ Student()
			+ information() : void
		 */
		Scanner sc = new Scanner(System.in);
		
		Member member = new Member();
		
		System.out.println("������ �̸��� �ۼ����ּ���.");
		String memberName = sc.next();
		
		member.changeName(memberName);
		member.printName();
		
	}
}
