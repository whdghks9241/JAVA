package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("kh");
		System.out.println(stKim.serialNum);
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("khÇÐ»ý");
		System.out.println(khLee.serialNum);
		khLee.serialNum++;
	}
}
