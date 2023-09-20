package com.kh.ThreadPratice;

import java.util.Random;

public class GameLoop implements Runnable {
	
	private static boolean isGameOver = false;
	
	@Override
	public void run() {
		while(!isGameOver) {
			//게임 루프 내용
			int randomValue = new Random().nextInt(12);
			System.out.println("임의의 숫자 : " + randomValue);
		
			// 게임 루프 지연시간
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 게임 종료 조건
			// Enter 키를 누르면 게임이 종료된다.
			System.out.println("게임을 종료하려면 Enter를 누르세요");
		}
		System.out.println("게임 종료");
	}

	public boolean isGameOver() {
		return isGameOver;
	}

	public void setGameOver(boolean isGameOver) {
		GameLoop.isGameOver = isGameOver;
	}
	

	
}
