package com.kh.ThreadPratice;

import java.io.IOException;
public class GameMain {
	
	public static void main(String[] args) {
		// 외부 클래스의 인스턴스를 생성
		GameLoop gameLoop = new GameLoop();
		
		Thread gameThread= new Thread(gameLoop);
		gameThread.start();
		
		// 게임 종료 조건 : 플레이어가 Enter 키를 누르면 게임 종료
		try {
			// 사용자가 키보드로 입력한 바이트를 읽음
			// 사용자가 Enter키를 누를 때 까지 프로그램 일시 중지
			System.in.read();
			
//			isGameOver = true;
			gameLoop.setGameOver(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
}
