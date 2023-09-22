package com.kh.finalSample;

import java.io.FileWriter;

public class FileIOMain {

	public static void main(String[] args) {

		try {

			FileWriter fw;
			
			// true 2번째 인자의 값이 boolean true지정되면 해당 파일에 이어쓰기를 허용한다는 뜻.
			fw = new FileWriter("file.txt", true);
			fw.write("데이터 추가 완료");
	
			fw.write("gagdas");
	
			fw.write(60);
			
			fw.close();
			
			System.out.println("된겨?");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
