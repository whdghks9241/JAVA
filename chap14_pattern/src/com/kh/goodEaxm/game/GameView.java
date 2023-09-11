package com.kh.goodEaxm.game;

public class GameView {

	private String Stringstr = "숫자 맞추기 게임을 시작합니다";
	private String Stringstr1 = "1에서 100 사이의 숫자를 맞춰보세요!";
	private String Stringstr2 = "추측한 숫자를 입력하세요.";
	private String Stringstr3 = "틀렸습니다 다시 시도하세요.";

	public void displayMessage() {

		System.out.println(Stringstr);
		System.out.println(Stringstr1);
	}
	
	// 숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑 시도 횟수 게임종료 
	public void displayGuessPromt() {
		System.out.println();
	}
	
	public void displayCorrectGuess() {
		System.out.println(Stringstr2);
	}
	
	public void displayinCorrectGuess() {
		System.out.println(Stringstr3);
	}
	
	public void displayAttempts(int attempts) {
		System.out.println("시도횟수 : " + attempts);
	}
	
	public void displayGameOver() {
		System.out.println("게임종료!");
	}
}
