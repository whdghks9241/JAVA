package com.kh.fileIO;

import java.io.File;

public class File_delete {

	final static String path = "C:\\Users\\user1\\Desktop\\new_folder";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originFile = path + "\\cuteCat.png";
	
		// 파일 객체 생성
		File fileToDelete = new File(originFile);
		
	
		// 파일삭제
		boolean delete = fileToDelete.delete();
		if (delete) {
			System.err.println("파일이 정상적으로 삭제 되었습니다.");
		} else {
			System.out.println("파일을 삭제하는데 실패 하셨습니다.");
		}
	}
}
