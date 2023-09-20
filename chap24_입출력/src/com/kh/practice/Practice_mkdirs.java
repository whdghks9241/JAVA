package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice_mkdirs pm = new Practice_mkdirs();
		
		pm.Practice1();
	}
	
	public void Practice1() {
		// 폴더 연속으로 2개 만들기 C:\Users\ user1\Desktop\이름1\이름2
		// 1.생성할 폴더의 주소를 정한다
		String twoPath = "C:\\Users\\user1\\Desktop\\myNameis\\JongHwan";
		
		// 2. file 갹체 생성
		File dir = new File(twoPath);
		
		// mkdirs 메서드를 사용해서 디렉토리 생성시도
		boolean success = dir.mkdirs();
		if (success) {
			System.out.println("파일 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}

		// 폴더 연속으로 3개 만들기 C:\Users\ user1\Java_Workspace\chap25_
		// 1.생성할 폴더의 주소를 정한다
		String threePath = "C:\\Users\\user1\\Java_Workspace\\chap25_\\JongHwan";
		// 2. file 갹체 생성
		dir = new File(threePath);
		
		// mkdirs 메서드를 사용해서 디렉토리 생성시도
		success = dir.mkdirs();
		if (success) {
			System.out.println("파일 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}
		
		// 폴더 연속으로 5개 만들기 C:\Users\ user1\Document\myPlace\Music\Korean\kPop
		// 1.생성할 폴더의 주소를 정한다
		String fourPath = "C:\\Users\\user1\\Document\\myPlace\\Music\\Korean\\kPop";
		// 2. file 갹체 생성
		dir = new File(fourPath);
		
		// mkdirs 메서드를 사용해서 디렉토리 생성시도
		success = dir.mkdirs();
		if (success) {
			System.out.println("파일 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}
		
	}

}
