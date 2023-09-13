package com.kh.objExam;

public class PracticeMain2 {		// 빈 StringBuffer 객체 생성
	
	String str = "오늘 저녁은 뭐먹지";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain2 main2 = new PracticeMain2();
		main2.practice1();
		main2.practice2();
		main2.practice3();
		main2.practice4();
		main2.practice5();

	}

	public void practice1() {

		StringBuffer sb = new StringBuffer();
		// 문자열 덧 붙이기 출력 append
		sb.append("오늘 ");
		sb.append("저녁은 ");
		sb.append("뭘 ");
		sb.append("먹지 ");
		
		System.out.println("출 력 : " + sb.toString());
	}

	public void practice2() {
		StringBuffer sb = new StringBuffer(str);
		// 문자열 뒤집기 오늘 저녁은 뭐먹지
		sb.reverse();
		System.out.println("반대로 : " + sb.toString());
	}
	
	public void practice3() {
		StringBuffer sb = new StringBuffer(str);
		// 문자열 insert
		sb.insert(10, " ㅎㅎㅎㅎ ?!?!?!?!");
		System.out.println("문자열 추가 : " + sb.toString());
	}
	
	public void practice4() {
		StringBuffer sb = new StringBuffer(str);
		// 문자열 대체
		sb.replace(0, 2, "내일");
		System.out.println("문자열 대체 : " + sb.toString());
	}
	
	public void practice5() {
		StringBuffer sb = new StringBuffer(str);
		// 문자열 삭제
		sb.delete(2, 6);
		System.out.println("문자열 삭제 : " + sb.toString());
	}
}
