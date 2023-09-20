package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		PlayerCharacter player1= new PlayerCharacter();

		player1.setName("Marin");
		player1.setHealth(10);
		player1.setAttackpower(20);
		player1.displayInfo();
		
		PlayerCharacter player2= new PlayerCharacter();
		
		System.out.println("");
		
		player2.setName("KH");
		player2.setHealth(80);
		player2.setAttackpower(30);
		player2.displayInfo();
		
		System.out.println("");
		
		System.out.println("attack !!!!!! 후 ");
		player1.attack(player2);
	}

}
