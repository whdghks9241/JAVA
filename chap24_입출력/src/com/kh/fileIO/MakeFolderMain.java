package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {
	final static String path = "C:\\Users\\user1\\Desktop";

	public static void main (String [] args) {
		
		// 폴더를 생성할 경로 지정
		// 폴더생성을 원하는 경로 설정
		String folderPath = path + "\\new_folder";

		//폴더 만들기
		File folder = new File(folderPath);
		folder.mkdir();
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
			
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		//folder.mkdir();
		
		try {
			FileWriter w = new FileWriter(folderPath + "//userInfo");
			w.write("User 정보를 담는곳입니다");
			w.write(" 전종환");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
