package com.kh.practice.exam;

public class Practice30_Run {
	public static void main(String[] args) {
		
		Practice30 Student = new Practice30();

		Student.setGrade(3);
		Student.setClassroom(3);
		Student.setName("전종환");
		Student.setHeight(177.5);
		Student.setGender('남');
		
		Student.information();
	}
}
