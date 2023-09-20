package com.kh.goodEaxm.game;

// 랜덤 숫자 맞추기 게임 모델
public class GameModel {
	
	// 숨겨진 번호
	private int secretNumber;
	// 몇 번 시도했는가
	private int attempts;

	
	public GameModel() {
		// 1 ~ 100 사이의 무작위 숫자 생성하기
		secretNumber = (int) (Math.random() * 10) + 1;
		attempts = 0;
	}
	
	// 1 부터 100사이 중 컴퓨터가 
	public int getSecretNumber() {
		return secretNumber;
	}
	
	public int getAempts() {
		return attempts;
	}
	
	public void incrementApttempts() {
		attempts++;
	}
	
	public boolean inCorrectFuess(int guess) {
		incrementApttempts();
		// Guess가 값을 입력했기 때문에 증가 메소드를 추가
		return guess == secretNumber;
	}
}
