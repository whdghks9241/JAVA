package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {


	Date currentDate = new Date();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice4 p4 = new Practice4();
		p4.practice1();
		p4.practice2();
		p4.practice3();
		p4.practice4();
		p4.practice5();
		
	}
	
	public void practice1() {
		// 년월일 yyyy-MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
	
	public void practice2() {
		// 시분초 HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
	
	public void practice3() {
		// 월일 MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
	
	public void practice4() {
		// 연도-시간 yyyy-HH
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 HH시");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
	
	public void practice5() {
		// 날짜 - 요일 yyyy-hh
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
}
