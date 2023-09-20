package com.kh.gettersetter.goodEaxm;

public class GoodPlayer {

	// 캐릭터 이름
	// 
	private String name;

	public String getName() {
		return name;
	}

	public void ValidName(String name) {
		if (this.name == " ") {
			this.name = name;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	// 체력
	private int health;
	
	public int getHealth() {
		return health;
	}

	public void ValidHealth() {
		if (this.health < 0) {
			health = 0;
		}
	}
	
	public void setHealth(int health) {
		this.health = health;
	}


	// 공격력
	private int attackPower;
	
	public int getAttackPower() {
		return attackPower;
	}
	
	public void ValidattackPower() {
		if (this.attackPower <- 0) {
			attackPower = 0;
		}
	}
	
	public void setAttackpower(int attackpower) {
		this.attackPower = attackpower;
	}
	

	// 캐릭터 정보 출력
	public void displayInfo() {
		System.out.println("캐릭터 정보 : " + this.name);
		System.out.println("채력 정보 : " + this.health);
		System.out.println("공격력 정보 : " + this.attackPower);
		
	}
}
