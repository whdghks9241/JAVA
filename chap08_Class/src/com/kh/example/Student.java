package com.kh.example;

public class Student {
	// 1. 맴버변수 ( 학생의 속성 )
	// 이름
	String name;
	// 나이
	int age;
	// 학년
	String grade;
	
	/**
	 *  생성자 / 생성자는 메서드 중 일부
	 */
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	// 학생 정보 출력 메서드
	public void displayInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("나    이 : " + age);
		System.out.println("학    년 : " + grade);
	}
}
