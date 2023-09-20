package com.kh.example.practice1.run;

import java.util.Scanner;

import com.kh.example.practice1.model.vo.Member;

public class MemberRun {
	public static void main(String[] agrs) {
		

		Scanner sc = new Scanner(System.in);
		
		Member member = new Member();
		
		System.out.println("변경할 이름을 작성해주세요.");
		String memberName = sc.next();
		
		member.changeName(memberName);
		member.printName();
		
	}
}
