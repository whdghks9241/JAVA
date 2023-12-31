package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile = "C:\\Users\\user1\\Downloads\\cat.png";
		String outputFile = "C:\\Users\\user1\\Downloads\\cuteCat.jpg";
		/*
		 try(resource) 와 try{} 차이점
		 try(resource) 문법은 자동 자원 관리 문법으로 코드가 블록을 빠져 나갈 때 자원을 자동으로 닫을 수 있음
		 				현재는 File~~~Stream 들을 자동으로 닫겠다 선언한 것
		 try{...}      문법은 자원을 수동으로 닫아 예외처리를 진행해야함
		 
		 try(FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile))
		 */
		try 
			(FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)) {
			
			// 1024 바이트 크기의 버퍼
			byte[] buffer = new byte[1024];
			int byteRead;
			
			// int byteRead; fis.read(buffer) 메서드를 호출하여 버퍼로 읽어들인 바이트 수를 저장하는 변수 선언
			
			// 파일을 읽고 복사하는동안 사용된다.
			// fis.read(buffer) 파일에서 데이터를 읽어 들이고
			// 	fos.write(buffer, 0, byteRead); 읽어들인 데이터를 출력한다.
			// 파일의 끝에 도달하면 -1을 반환하면서 while문을 종료한다.
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
			
			System.out.println("파일이 복사 되었습니다");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
