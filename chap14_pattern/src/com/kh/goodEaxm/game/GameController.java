package com.kh.goodEaxm.game;

import java.util.Scanner;

public class GameController {
	
	private GameModel model;
	private GameView view;

	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}

	public void runGame() {
		// 최초 메시지 출력
		view.displayMessage();
		// 스캐너 사용
		Scanner sc = new Scanner(System.in);

		while (true) {		
			// 숫자 추측하는 값 입력
			view.displayGuessPromt();
			int guess = sc.nextInt();
			
			if (model.inCorrectFuess(guess)) {
				// 컴퓨터가 생각한 숫자를 맞췄을 때 불러올 view
				view.displayCorrectGuess();
				view.displayAttempts(model.getAempts());
				break;
			} else {
				// 컴퓨터가 생각한 숫자와 내가 입력한 숫자가 틀렸을 때 view;
				view.displayinCorrectGuess();
				view.displayAttempts(model.getAempts());
			}
		}

		view.displayGameOver();

	}
	
	public static void main(String[] args) {
		
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}

}
