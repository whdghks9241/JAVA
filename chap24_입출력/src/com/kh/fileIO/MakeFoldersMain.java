package com.kh.fileIO;

import java.io.File;

public class MakeFoldersMain {

	/**
	 mkdirs 
	 바탕화면 / kh / image
	 부모 디렉토리가 존재하지 않는 경우에 중간 모든 디렉토리 생성.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath = "C:\\Users\\user1\\Desktop\\my\\name\\is\\jongHwan";
		
		// file 객체 생성
		File dir = new File(dirPath);
		
		// mkdirs 메서드를 사용하여 디렉토리 생성 시도
		boolean success = dir.mkdirs();
		if (success) {
			System.out.println("폴더 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}
	}

}
