package com.kh.example;

public class StudentMain {
	public static void main(String[] arge) {
		// 학생의 객체 생성
		
		Student student1 = new Student("전종환",10, "3학년");
		// 학생 정보 출력
		
		student1.displayInfo();
		
		/**
		 *  학생을 3명 만들어서 3명을 출력하기
		 */
		Student student2 = new Student("전종환2",12, "2학년");
		
		Student student3 = new Student("전종환3",13, "3학년");
		
		Student student4 = new Student("전종환4",14, "4학년");
		
		student2.displayInfo();
		
		student3.displayInfo();
		
		student4.displayInfo();
		
	}
}
