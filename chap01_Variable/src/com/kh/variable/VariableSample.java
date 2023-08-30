package com.kh.variable;

public class VariableSample {

	public static void main(String[] args) {
		
		String name;
		name = "쿠팡";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';

		System.out.println("안녕하세요. 쿠팡입니다. 오늘 15시에 배송됩니다.");
		System.out.println("안녕하세요. " + name +"입니다. 오늘 "+ hour +"시에 배송됩니다.");
		System.out.println("저의 성적은 " + score +" 입니다.");
		System.out.println(score + " 은 " +grade+"입니다.");
		
		// 변수에 이름과 나이와 자신의 성적(double)로 넣기
		String my_name = "전종환";
		int my_age = 31;
		double my_score = 90.0;
		char my_grade = 'A';
		
		System.out.println("안전하세요 저는 " + my_name + " 입니다. 제 나이는 " + my_age + "살 이고");
		System.out.println("저희 성적은 " + my_score + "입니다. " + my_score + " 은 " + my_grade +" 입니다.");
		
		
	}
}
