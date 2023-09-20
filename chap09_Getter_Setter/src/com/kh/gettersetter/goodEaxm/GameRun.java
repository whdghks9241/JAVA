package com.kh.gettersetter.goodEaxm;

public class GameRun {

	public static void main(String[] args) {

		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();

		player1.setName("Marin");
		
		player1.setHealth(-10);
		player1.ValidHealth();
		// -10 이 무결성(내가만든코드가 결장이 엇는지 인지 검증한

		player1.setAttackpower(20);
		player1.ValidattackPower();;
		player1.displayInfo();
		
		// 플레이 생성자 만들기
		GoodPlayer player2= new GoodPlayer();

		player2.setName("Marin");
		
		player2.setHealth(-10);

		player2.setName("aomrom2");

		// -10 이 무결성(내가만든코드가 결장이 엇는지 인지 검증한
		player2.setAttackpower(20);
		player2.ValidattackPower();;
		player2.displayInfo();
		
	}

}
