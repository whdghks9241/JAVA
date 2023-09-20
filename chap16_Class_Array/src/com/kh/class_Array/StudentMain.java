package com.kh.class_Array;

public class StudentMain {
	public static void main(String[] args) {
		// Student 객체를 저장하는 배열 생성
		Student[] student = new Student[3];
		
		// 배열에 student 객체를 추가
		student[0] = new Student("넌뭐야", 17);
		student[1] = new Student("난뭐지", 18);
		student[2] = new Student("넌너야", 19);
	
		// 총 길이를 구하고 싶으면 length
		// 1번 째 학생의 이름 student[0].name;
		// 1번 째 학생의 이름 student[0].age;
		
		System.out.println("총 학생 수 : " + student.length);
		System.out.println("첫 번째 학생의 이름 : " + student[0].name);
		System.out.println("첫 번째 학생의 나이 : " + student[0].age);
		System.out.println("");

		// 두번째 학생의 이름과 나이 출력
		System.out.println("첫 번째 학생의 이름 : " + student[1].name);
		System.out.println("첫 번째 학생의 나이 : " + student[1].age);
		System.out.println("");
		// 세번째 학생의 이름과 나이 출력
		System.out.println("첫 번째 학생의 이름 : " + student[2].name);
		System.out.println("첫 번째 학생의 나이 : " + student[2].age);
		System.out.println("");
		
		// for문을 이용해서 1번째 학생 ~ 3번째학생까지 출력
		for (int i = 0; i < student.length; i++) {
			System.out.println(i + " 번째 학생의 이름 : " + student[i].name);
			System.out.println(i + " 번째 학생의 나이 : " + student[i].age);
		}
	}
}
