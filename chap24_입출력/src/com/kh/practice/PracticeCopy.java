package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeCopy {

	final static String path = "C:\\Users\\user1\\Desktop";

	public static void main(String[] args) {

		PracticeCopy pc = new PracticeCopy();
		pc.PracticeCopy1();
		pc.PracticeCopy2();
	}
	
	public void PracticeCopy1 () {
		
		String inputFile = path + "\\Ccat.png";
		
		
		String outputFile = path + "\\Cat.png";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)) {
			
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while ((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
			
			System.out.println("파일이 복사 되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void PracticeCopy2 () {

		// 바탕화면에 폴더를 만들어서 
		String folderPath = path + "\\new_folder";

		//폴더 만들기
		File folder = new File(folderPath);
		folder.mkdir();
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 생성되었습니다.");
			
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		
		// 이미지 파일 jpg 또는 png 파일을 바탕화면에 저장한 후
		String inputFile = path + "\\Ccat.png";

		// 폴더 안에 복사한 이미지 저장하기.
		String outputFile = folderPath + "\\cuteCat.png";

		try (FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)) {
			
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while ((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
			
			System.out.println("파일이 복사 되었습니다");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
