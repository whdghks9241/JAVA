package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	final String path = "C:\\Users\\user1\\Desktop";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
//		pm.practice1();
		pm.practice2();
	}

	// 경로 설정해서 파일 만들기
	public void practice1() {
		
		try {
			FileWriter fw = new FileWriter(path +"//checkFile.txt");

			// 파일쓰기 
			fw.write("에베베베벱");
			// 파일닫기
			fw.close();
			FileReader reader = new FileReader(path +"//checkFile.txt");
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while ((line = bufferdReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferdReader.close(); //파일을 다 읽으면 닫아주기.
			

			System.out.println("파일 생성 완료");
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("파일 생성 실패");
		}
		
	}
	
	public void practice2() {

		String folderPath = path + "\\newfolder";

		//폴더 만들기
		File folder = new File(folderPath);
		folder.mkdir();
		if (!folder.exists()) {
			System.out.println("폴더 생성 완료");
		} else {
			System.out.println("폴더가 있지용");
		}
		try {
			FileWriter w = new FileWriter(folderPath + "//userInf8.txt");
			w.write("User 정보를 담는곳입니다");
			w.write(" 전종환");
			w.close();
			System.out.println("파일 만들어 졌지롱");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
