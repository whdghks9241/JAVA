package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 1.
		 이미지 하나 불러오기
		 새로 리사이즈 한 이미지 바탕화면에 저장하기
		 
		 2.
		 이미지 하나 불러오기
		 바탕화면에 새로운 폴더 만들기 mkdir
		 새로운 리사이즈한 이미지 바탕화면에 새로 만든 폴더 안에 저장하기
		 
		 */
		
		PracticeResize pr = new PracticeResize();
		pr.imgResize();
	}
	
	public void imgResize() {
		// 현재 주소
		String path = "C:\\Users\\user1\\Desktop\\";
		// 생성팔 파일의 주소
		String makeFolderPath = path + "reSizeImg\\";
		
		// 현재 이미지의 위치
		String inputImg = path + "Cat.png";
		// 사이즈 변경한 이미지의 위치
		String outputImg = makeFolderPath + "cuteCat.png";
		
		// 가로크기
		int width = 300;
		// 세로길이
		int height = 400;

		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));

			// 새로운 크기로 이미지 변경
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);

			// BufferedImage로 변환
			BufferedImage bufResizeImg = new BufferedImage(width, height,BufferedImage.TYPE_INT_BGR);

			Boolean success = bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			
			
			if (success) {
				File folder = new File(makeFolderPath);
				
				folder.mkdir();
				if(!folder.exists()) {
					folder.mkdir();
					System.out.println("폴더가 성공적으로 생성되었습니다.");
					
				}
				
				ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
				
				System.out.println("이미지 사이즈 변경 완료");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 사이즈 변경 중 오류 발생 : " +e.getMessage());
		}
	}

}
