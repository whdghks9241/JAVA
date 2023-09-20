package com.kh.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExam {
	public static void main(String[] args) {
		
		// HashMap 생성
		Map<String, Integer> studentGrades = new HashMap<>();
		
		// 학생과 점수를 추가하겠습니다.
		studentGrades.put("KH", 95);
		studentGrades.put("GH", 95);
		studentGrades.put("EHa", 65);
		studentGrades.put("Oia", 78);
		
		// 특정 학생의 성적 검색
		// containsKey : 맵에서 key(키), value(값)이 있는지 확
		String studentName = "Oia";
		// 만약 학생들 중에서 Oia가 있다면
		if (studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + " : " + grade);
			System.out.println("");
		} else {
			System.out.println(studentName + "의 성적을 찾을 수 없습니다.");
			System.out.println("");
		}
		
		// 모든 학생과 성적 출력
		for (Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		
		// 학생 성적 수정
		String GradeUpdate = "Oia";
		int newGrede = 99;
		studentGrades.put(GradeUpdate, newGrede);
		System.out.println(GradeUpdate + " 의 성적을 " + newGrede + " 로 수정했습니다");
		System.out.println("");
		
		// 학생 제거
		String removeStudent = "KH";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "의 성적을 삭제 했습니다.");
		System.out.println("");
		
		
		// 최종 학생 성적 출력
		System.out.println("최종학생 성적 : ");
		for (Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
	}
}
